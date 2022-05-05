package StepDefinitions;

import io.cucumber.java.en.And;
import Pages.*;
import io.cucumber.java.en.Then;

public class SuccessfulOrderStepDefinitions {

    ShoppingCart shoppingCart = new ShoppingCart(Hooks.driver);
    @And("user navigates to shopping cart and continue shopping")
    public void continueShopping(){
        shoppingCart.navigateToCart();
        shoppingCart.checkOut();
        shoppingCart.fillShippingData();
    }
    @Then("the order processes successfully")
    public void assertOrder() throws InterruptedException {
        shoppingCart.assertsuccessfulOrder();
    }
}
