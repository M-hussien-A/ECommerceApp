package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.awt.event.ActionListener;
import java.time.Duration;

public class FilterPage {
    WebDriver driver;

    public FilterPage(WebDriver driver) {
        this.driver = driver;
    }

    By apparelCategory = By.partialLinkText("Apparel");
    By shoesCategory = By.partialLinkText("Shoes");
    By pageTitle = By.className("page-title");
    By redColor = By.id("attribute-option-15");
    By redShoes = By.className("product-title");
    By apparelTag = By.partialLinkText("apparel");
    By apparelTagProducts = By.className("page-title");

    public void selectApparelCategory(){
        new WebDriverWait(driver, Duration.ofSeconds(30))
                .until(ExpectedConditions.elementToBeClickable(apparelCategory));
        Actions action = new Actions(driver);
        action.moveToElement(driver.findElement(apparelCategory)).perform();
        new WebDriverWait(driver, Duration.ofSeconds(30))
                .until(ExpectedConditions.elementToBeClickable(shoesCategory));
        driver.findElement(shoesCategory).click();

    }

    public void assertSelectApparelCategory(){
        new WebDriverWait(driver, Duration.ofSeconds(30))
                .until(ExpectedConditions.elementToBeClickable(pageTitle));
        Assert.assertTrue(  driver.findElement(pageTitle).getText().contains("Shoes"));
    }

    public void filterByRedColor(){
        new WebDriverWait(driver, Duration.ofSeconds(30))
                .until(ExpectedConditions.elementToBeClickable(redColor));
        driver.findElement(redColor).click();

    }
    public void assertFilterByRedColor(){
        new WebDriverWait(driver, Duration.ofSeconds(30))
                .until(ExpectedConditions.elementToBeClickable(redShoes));
        Assert.assertTrue(  driver.findElement(redShoes).getText().contains("adidas Consortium Campus 80s Running Shoes"));


    }
    public void selectApparelTag(){
        new WebDriverWait(driver, Duration.ofSeconds(30))
                .until(ExpectedConditions.elementToBeClickable(apparelTag));
        driver.findElement(apparelTag).click();

    }
    public void assertSelectApparelTag(){
        new WebDriverWait(driver, Duration.ofSeconds(30))
                .until(ExpectedConditions.elementToBeClickable(apparelTagProducts));
        Assert.assertTrue(  driver.findElement(apparelTagProducts).getText().contains("Products tagged with 'apparel'"));


    }





}
