package Pages;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;


import java.time.Duration;

public class SearchPage {
    WebDriver driver;

    public SearchPage(WebDriver driver) {
        this.driver = driver;
    }

    By searchProductTF=By.id("small-searchterms");
    By searchProductBtn = By.className("button-1");

    public void search(String product){
        new WebDriverWait(driver, Duration.ofSeconds(30))
                .until(ExpectedConditions.visibilityOfElementLocated(searchProductTF));
        driver.findElement(searchProductTF).clear();
        driver.findElement(searchProductTF).sendKeys(product);
        driver.findElement(searchProductTF).submit();

    }

    public void assertSearchedProduct(String product){
        By productSearchResult = By.xpath("//a[contains(text(),'" + product + "')]");

      Assert.assertTrue(driver.findElement(productSearchResult).isDisplayed());


    }
}
