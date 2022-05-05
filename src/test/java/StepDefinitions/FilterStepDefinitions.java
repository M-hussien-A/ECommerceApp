package StepDefinitions;

import Pages.*;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class FilterStepDefinitions {
    FilterPage filterPage = new FilterPage(Hooks.driver);

    @When("user can select category and subcategory")
    public void selectCategory(){
        filterPage.selectApparelCategory();
    }
    @Then("verify the category is selected")
    public void assertSelectCategory(){
        filterPage.assertSelectApparelCategory();
    }
    @And("user can filter by color")
    public void filterByRed(){
        filterPage.filterByRedColor();
    }

    @Then("verify the category and color are selected")
    public void assertFilterByRed(){
        filterPage.assertFilterByRedColor();
    }

    @And("user can select tag")
    public void selectTag(){
        filterPage.selectApparelTag();
    }
    @Then("verify the tag is selected")
    public void assertSelectedTag(){
        filterPage.assertSelectApparelTag();
    }
}
