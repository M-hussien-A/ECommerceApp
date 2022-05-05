package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

public class ProductsPage {

    WebDriver driver;

    public ProductsPage(WebDriver driver) {
        this.driver = driver;
    }
    By addToCartPageBtn = By.className("button-2");
    By addToCartBtn = By.id("add-to-cart-button-4");
    By addToCompareListBtn = By.xpath("//button[@title=\"Add to compare list\"]");
    By addToWishListPageBtn = By.xpath("//button[@title=\"Add to wishlist\"]");
    By addToWishListBtn = By.id("add-to-wishlist-button-4");

 By confirmationMessage = By.className("content");

    public void addToCompareList(){
        new WebDriverWait(this.driver, Duration.ofSeconds(30))
                .until(ExpectedConditions.visibilityOfElementLocated(addToCompareListBtn));
        driver.findElement(addToCompareListBtn).click();

    }
    public void addToWishList(){
        new WebDriverWait(this.driver, Duration.ofSeconds(30))
                .until(ExpectedConditions.visibilityOfElementLocated(addToWishListPageBtn));
        driver.findElement(addToWishListPageBtn).click();
        /*new WebDriverWait(this.driver, Duration.ofSeconds(30))
                .until(ExpectedConditions.visibilityOfElementLocated(addToWishListBtn));
        driver.findElement(addToWishListBtn).click();*/
    }
    public void addToCart(){
        new WebDriverWait(this.driver, Duration.ofSeconds(30))
                .until(ExpectedConditions.visibilityOfElementLocated(addToCartPageBtn));
        driver.findElement(addToCartPageBtn).click();
       /* new WebDriverWait(this.driver, Duration.ofSeconds(30))
                .until(ExpectedConditions.visibilityOfElementLocated(addToCartBtn));
        driver.findElement(addToCartBtn).click();*/
    }

    public void assertAddToCompareList(){
        new WebDriverWait(this.driver, Duration.ofSeconds(30))
                .until(ExpectedConditions.visibilityOfElementLocated(confirmationMessage));
        Assert.assertTrue(driver.findElement(confirmationMessage).getText().contains("The product has been added to your product comparison"));
    }
    public void assertAddToWishList(){
        new WebDriverWait(this.driver, Duration.ofSeconds(30))
                .until(ExpectedConditions.visibilityOfElementLocated(confirmationMessage));
        Assert.assertTrue(driver.findElement(confirmationMessage).getText().contains("The product has been added to your wishlist"));
    }
    public void assertAddToCart(){
        new WebDriverWait(this.driver, Duration.ofSeconds(30))
                .until(ExpectedConditions.visibilityOfElementLocated(confirmationMessage));
        Assert.assertTrue(driver.findElement(confirmationMessage).getText().contains("The product has been added to your shopping cart"));
    }



}
