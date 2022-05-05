package StepDefinitions;
import Pages.LoginPage;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;

public class LoginStepDefinitions {

    LoginPage loginPage = new LoginPage(Hooks.driver);
  @Given("user navigates to login page")
    public void navigateToLoginPage() {
      loginPage.navigateToLogin();
    }

    @When("user enters login valid data and clicks on login button")
    public void loginSuccessfully(){
        loginPage.login("profm.hussien@gmail.com","123456");
    }
     @Then("user enters to his account")
    public void assertRegister(){
         loginPage.assertSuccessfulLogin();
}



}
