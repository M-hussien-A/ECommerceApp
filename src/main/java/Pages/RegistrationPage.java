package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class RegistrationPage {
WebDriver driver;

    public RegistrationPage(WebDriver driver) {
        this.driver = driver;
    }

    By registerPageBtn=By.className("ico-register");
    By firstNameTF = By.id("FirstName");
    By lastNameTF = By.id("LastName");
    By emailTF = By.id("Email");
    By passwordTF = By.id("Password");
    By confirmPasswordTF = By.id("ConfirmPassword");
    By registerBtn=By.id("register-button");
    By registerSuccessfulTxt=By.className("result");

    public void openBrowser(){
        System.setProperty("webdriver.chrome.driver","src/main/resources/chromedriver.exe");
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.navigate().to("https://demo.nopcommerce.com/");
    }


    public void navigateToRegister()  {
       /* System.setProperty("webdriver.chrome.driver","src/main/resources/chromedriver.exe");
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.navigate().to("https://demo.nopcommerce.com/");*/
        new WebDriverWait(this.driver, Duration.ofSeconds(30))
                .until(ExpectedConditions.visibilityOfElementLocated(registerPageBtn));
        this.driver.findElement(registerPageBtn).click();
    }
    public void register(String firstName,String lastName,String email,String password){
        new WebDriverWait(driver, Duration.ofSeconds(30))
                .until(ExpectedConditions.visibilityOfElementLocated(firstNameTF));
       // driver.findElement(registerPageBtn).click();
        driver.findElement(firstNameTF).clear();
        driver.findElement(firstNameTF).sendKeys(firstName);
        driver.findElement(lastNameTF).clear();
        driver.findElement(lastNameTF).sendKeys(lastName);
        driver.findElement(emailTF).clear();
        driver.findElement(emailTF).sendKeys(email);
        driver.findElement(passwordTF).clear();
        driver.findElement(passwordTF).sendKeys(password);
        driver.findElement(confirmPasswordTF).clear();
        driver.findElement(confirmPasswordTF).sendKeys(password);
        new WebDriverWait(driver, Duration.ofSeconds(30))
                .until(ExpectedConditions.elementToBeClickable(registerBtn));
        driver.findElement(registerBtn).click();
    }
    public void assertSuccessfulRegister(){
        new WebDriverWait(driver, Duration.ofSeconds(30))
                .until(ExpectedConditions.visibilityOfElementLocated(registerSuccessfulTxt));
        String actualResult=driver.findElement(registerSuccessfulTxt).getText();
        Assert.assertTrue(actualResult.contains("completed"));
    }

    // method overloading for data which is not mandatory
    public void register(String firstName,String lastName,String email,String password,String type){
        new WebDriverWait(driver, Duration.ofSeconds(30))
                .until(ExpectedConditions.visibilityOfElementLocated(firstNameTF));
        driver.findElement(firstNameTF).clear();
        driver.findElement(firstNameTF).sendKeys(firstName);
        driver.findElement(lastNameTF).clear();
        driver.findElement(lastNameTF).sendKeys(lastName);
        driver.findElement(emailTF).clear();
        driver.findElement(emailTF).sendKeys(email);
        driver.findElement(passwordTF).clear();
        driver.findElement(passwordTF).sendKeys(password);
        driver.findElement(confirmPasswordTF).clear();
        driver.findElement(confirmPasswordTF).sendKeys(password);
    }


    public void closeBrowser(){
        driver.quit();
    }

}
