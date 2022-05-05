import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import Pages.*;
public class test {
    WebDriver driver = new ChromeDriver();
    RegistrationPage registrationPage = new RegistrationPage(driver);
    OpenAndCloseBrowser openAndCloseBrowser = new OpenAndCloseBrowser(driver);
    @Test
    public void ff() throws InterruptedException {
        openAndCloseBrowser.openBrowser();
        registrationPage.navigateToRegister();
        registrationPage.register("Mohamed","Hussien","profm.hussien@gmail.com","123456");
    }

}
