package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

public class LoginPage {
WebDriver driver;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }
    By loginPageBtn=By.className("ico-login");
    By emailTF = By.id("Email");
    By passwordTF = By.id("Password");
    By loginBtn=By.className("button-1");
    By myAccountBtn=By.className("ico-account");




    public void openBrowser(){
        System.setProperty("webdriver.chrome.driver","src/main/resources/chromedriver.exe");
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.navigate().to("https://demo.nopcommerce.com/");
    }
    public void closeBrowser(){
        driver.quit();
    }
    public void navigateToLogin(){
        new WebDriverWait(driver, Duration.ofSeconds(30))
                .until(ExpectedConditions.elementToBeClickable(loginPageBtn));
        driver.findElement(loginPageBtn).click();
    }
    public void login(String email,String password){
        new WebDriverWait(driver, Duration.ofSeconds(30))
                .until(ExpectedConditions.visibilityOfElementLocated(emailTF));

        driver.findElement(emailTF).clear();
        driver.findElement(emailTF).sendKeys(email);
        driver.findElement(passwordTF).clear();
        driver.findElement(passwordTF).sendKeys(password);
        driver.findElement(passwordTF).submit();
     /*   new WebDriverWait(driver, Duration.ofSeconds(30))
                .until(ExpectedConditions.elementToBeClickable(loginBtn));
        driver.findElement(loginBtn).click();*/


    }
    public void assertSuccessfulLogin(){
        new WebDriverWait(driver, Duration.ofSeconds(30))
                .until(ExpectedConditions.visibilityOfElementLocated(myAccountBtn));
        Assert.assertTrue(driver.findElement(myAccountBtn).isDisplayed());
    }



}
