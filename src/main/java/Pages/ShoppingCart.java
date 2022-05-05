package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

public class ShoppingCart {
    public ShoppingCart(WebDriver driver) {
        this.driver = driver;
    }
WebDriver driver;
    By shoppingCartPageBtn = By.className("cart-label");
    By agreeCheckBox = By.id("termsofservice");
    By checkOutBtn = By.id("checkout");
    By countryDropDownList = By.id("BillingNewAddress_CountryId");
    By cityTF = By.id("BillingNewAddress_City");
    By addressTF = By.id("BillingNewAddress_Address1");
    By zipCodeTF = By.id("BillingNewAddress_ZipPostalCode");
    By phoneNumberTF = By.id("BillingNewAddress_PhoneNumber");
    By continueShippingAddressBtn = By.xpath("//button[@name='save']");
    By continueShippingMethodBtn = By.xpath("//button[@onclick=\"ShippingMethod.save()\"]");
    By continuePaymentMethodBtn = By.xpath("//button[@onclick=\"PaymentMethod.save()\"]");
    By continuePaymentInfoBtn = By.id("payment-info-buttons-container");
    By confirmBtn = By.id("confirm-order-buttons-container");
    By successfulOrderAssert = By.className("title");


    public void navigateToCart(){
        new WebDriverWait(this.driver, Duration.ofSeconds(30))
                .until(ExpectedConditions.visibilityOfElementLocated(shoppingCartPageBtn));
        driver.findElement(shoppingCartPageBtn).click();

    }
    public void checkOut(){
        new WebDriverWait(this.driver, Duration.ofSeconds(30))
                .until(ExpectedConditions.visibilityOfElementLocated(agreeCheckBox));
        driver.findElement(agreeCheckBox).click();
        new WebDriverWait(this.driver, Duration.ofSeconds(30))
                .until(ExpectedConditions.visibilityOfElementLocated(checkOutBtn));
        driver.findElement(checkOutBtn).click();
    }

    public void fillShippingData(){
        new WebDriverWait(this.driver, Duration.ofSeconds(30))
                .until(ExpectedConditions.visibilityOfElementLocated(countryDropDownList));
        Select country = new Select(driver.findElement(countryDropDownList));
        country.selectByVisibleText("Egypt");

        new WebDriverWait(this.driver, Duration.ofSeconds(30))
                .until(ExpectedConditions.visibilityOfElementLocated(cityTF));
        driver.findElement(cityTF).sendKeys("Giza");

        new WebDriverWait(this.driver, Duration.ofSeconds(30))
                .until(ExpectedConditions.visibilityOfElementLocated(addressTF));
        driver.findElement(addressTF).sendKeys("GizaYasmeen1234");

        new WebDriverWait(this.driver, Duration.ofSeconds(30))
                .until(ExpectedConditions.visibilityOfElementLocated(zipCodeTF));
        driver.findElement(zipCodeTF).sendKeys("0200");

        new WebDriverWait(this.driver, Duration.ofSeconds(30))
                .until(ExpectedConditions.visibilityOfElementLocated(phoneNumberTF));
        driver.findElement(phoneNumberTF).sendKeys("02012186569");

        new WebDriverWait(this.driver, Duration.ofSeconds(30))
                .until(ExpectedConditions.visibilityOfElementLocated(continueShippingAddressBtn));
        driver.findElement(continueShippingAddressBtn).click();

        new WebDriverWait(this.driver, Duration.ofSeconds(30))
                .until(ExpectedConditions.visibilityOfElementLocated(continueShippingMethodBtn));
        driver.findElement(continueShippingMethodBtn).click();

        new WebDriverWait(this.driver, Duration.ofSeconds(30))
                .until(ExpectedConditions.visibilityOfElementLocated(continuePaymentMethodBtn));
        driver.findElement(continuePaymentMethodBtn).click();

        new WebDriverWait(this.driver, Duration.ofSeconds(30))
                .until(ExpectedConditions.visibilityOfElementLocated(continuePaymentInfoBtn));
        driver.findElement(continuePaymentInfoBtn).click();

        new WebDriverWait(this.driver, Duration.ofSeconds(30))
                .until(ExpectedConditions.visibilityOfElementLocated(confirmBtn));
        driver.findElement(confirmBtn).click();


    }

    public void assertsuccessfulOrder() throws InterruptedException {
        Thread.sleep(6000);
        new WebDriverWait(this.driver, Duration.ofSeconds(30))
                .until(ExpectedConditions.visibilityOfElementLocated(successfulOrderAssert));
        System.out.println(driver.findElement(successfulOrderAssert).getText());
        Assert.assertTrue(driver.findElement(successfulOrderAssert).getText().contains("successfully processed"));

    }

}
