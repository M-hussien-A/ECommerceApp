package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;


import java.time.Duration;

public class ChangeCurrency {
    WebDriver driver;

    public ChangeCurrency(WebDriver driver) {
        this.driver = driver;
    }
    By currencyDropDownList = By.id("customerCurrency");

    public void changeCurrency(String selectedCurrency) {
        new WebDriverWait(this.driver, Duration.ofSeconds(30))
                .until(ExpectedConditions.visibilityOfElementLocated(currencyDropDownList));
        Select currency = new Select(driver.findElement(currencyDropDownList));
    currency.selectByVisibleText(selectedCurrency);
    }
    public void assertChangeCurrency(String selectedCurrency) {
        Select currency = new Select(driver.findElement(currencyDropDownList));

        Assert.assertTrue(currency.getFirstSelectedOption().getText().contains(selectedCurrency));
    }

}
