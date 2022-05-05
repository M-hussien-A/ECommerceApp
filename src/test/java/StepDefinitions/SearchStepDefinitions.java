package StepDefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import Pages.*;
public class SearchStepDefinitions
{

    SearchPage searchPage = new SearchPage(Hooks.driver);

    @When("^user searches \"(.*)\"$")
    public void searchProduct(String product){
        searchPage.search(product);
    }

    @Then("the product appears")
    public void assertSearchProduct(){
        searchPage.assertSearchedProduct("Nokia");
    }

}
