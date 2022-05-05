package Pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

public class ResetPasswordPage {
    WebDriver driver;

    public ResetPasswordPage(WebDriver driver) {
        this.driver = driver;
    }

    By forgetPasswordBtn = By.className("forgot-password");
    By emailTF = By.id("Email");
    By passwordRecoverBtn = By.xpath("//button[@Name=\"send-email\"]");
By successfulResetPasswordMessage = By.className("content");

    public void navigatesToResetPassword(){
        new WebDriverWait(driver, Duration.ofSeconds(30))
                .until(ExpectedConditions.visibilityOfElementLocated(forgetPasswordBtn));
        driver.findElement(forgetPasswordBtn).click();
    }
    public void resetPassword(String email){
        new WebDriverWait(driver, Duration.ofSeconds(30))
                .until(ExpectedConditions.visibilityOfElementLocated(emailTF));
        driver.findElement(emailTF).clear();
        driver.findElement(emailTF).sendKeys(email);
        driver.findElement(passwordRecoverBtn).click();

    }
    public void assertResetPassword(){

        new WebDriverWait(driver, Duration.ofSeconds(30))
                .until(ExpectedConditions.visibilityOfElementLocated(successfulResetPasswordMessage));
        Assert.assertTrue(driver.findElement(successfulResetPasswordMessage).getText()
                .contains("Email with instructions has been sent to you"));
    }

}
