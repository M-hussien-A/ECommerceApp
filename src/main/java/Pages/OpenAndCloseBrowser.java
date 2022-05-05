package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenAndCloseBrowser {
    WebDriver driver;
    public OpenAndCloseBrowser(WebDriver driver) {
        this.driver = driver;
    }


    public void openBrowser(){
        System.setProperty("webdriver.chrome.driver","src/main/resources/chromedriver.exe");
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.navigate().to("https://demo.nopcommerce.com/");
    }
    public void closeBrowser(){
        driver.quit();
    }
}
