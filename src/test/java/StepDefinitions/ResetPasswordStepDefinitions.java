package StepDefinitions;
import Pages.*;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ResetPasswordStepDefinitions {

    ResetPasswordPage resetPasswordPage = new ResetPasswordPage(Hooks.driver);
    @And("user selects reset password")
    public void navigateResetPassword(){
        resetPasswordPage.navigatesToResetPassword();
    }

    @When("user enters his-her email")
    public void resetPassword(){
        resetPasswordPage.resetPassword("profm.hussien@gmail.com");
    }
    @Then("the password resets successfully")
    public void assertResetPassword(){
        resetPasswordPage.assertResetPassword();
    }
}
