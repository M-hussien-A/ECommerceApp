package StepDefinitions;

import Pages.*;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

public class ProductsStepDefinitions {
    ProductsPage productsPage = new ProductsPage(Hooks.driver);

    @And("user adds the product to wishlist")
    public void addProductToWishList(){
        productsPage.addToWishList();

    }
    @Then("the product added to the wishlist")
    public void assertAddProductToWishList(){
        productsPage.assertAddToWishList();

    }

    @And("user adds the product to shopping cart")
    public void addProductToCart(){
        productsPage.addToCart();
    }
    @Then("the product added to the shopping cart")
    public void assertAddProductToCart(){
        productsPage.assertAddToCart();
    }

    @And("user adds the product to compare list")
    public void addProductToCompareList(){
        productsPage.addToCompareList();
    }
    @Then("the product added to the compare list")
    public void assertAddProductToCompareList(){
        productsPage.assertAddToCompareList();
    }
}
