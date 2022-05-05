package StepDefinitions;

import Pages.RegistrationPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;

public class RegistrationStepDefinitions {
WebDriver driver;

    RegistrationPage registrationPage = new RegistrationPage(Hooks.driver);
/*@Given("user opens the browser")
    public void homePage() {
        registrationPage.openBrowser();
    }
    *//*@After
    public void quiteBrowser(){
       registrationPage.closeBrowser();
    }*//*
    @And("user navigates to registration page")
    public  void user_navigates_to_register_page() throws InterruptedException {
        *//*driver = new ChromeDriver();
        System.setProperty("webdriver.chrome.driver","src/main/resources/chromedriver.exe");*//*
        registrationPage.navigateToRegister();
    }*/
@Given("user opens the browser and navigates to registration page")
public  void user_navigates_to_register_page() {

    registrationPage.navigateToRegister();
}
    @When("user enters registration valid data and clicks on register button")
    public void registerSuccessfully(){
        registrationPage.register("Mohamed","Hussien","profm.hussien@gmail.com","123456");
    }
@Then("valid registration message is displayed")
    public void assertRegister(){
    registrationPage.assertSuccessfulRegister();
}

}
