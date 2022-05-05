package StepDefinitions;

import Pages.*;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ChangeCurrencyStepDefinitions {
    ChangeCurrency changeCurrency = new ChangeCurrency(Hooks.driver);
    @When("user changes the currency")
        public void currencyChange(){
            changeCurrency.changeCurrency("Euro");
        }
    @Then("the currency changed successfully")
    public void assertCurrencyChange(){
        changeCurrency.assertChangeCurrency("Euro");
    }
}
