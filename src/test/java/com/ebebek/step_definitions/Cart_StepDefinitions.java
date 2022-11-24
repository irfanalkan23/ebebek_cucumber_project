package com.ebebek.step_definitions;

import com.ebebek.pages.BasePage;
import com.ebebek.pages.CartPage;
import com.ebebek.pages.ProductPage;
import com.ebebek.utilities.BrowserUtils;
import com.ebebek.utilities.ConfigurationReader;
import com.ebebek.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.Keys;


public class Cart_StepDefinitions {
    BasePage basePage = new BasePage();
    ProductPage productPage = new ProductPage();
    CartPage cartPage = new CartPage();

    @Given("user is at the ebebek home page")
    public void user_is_at_the_ebebek_home_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
    }

    @When("user types {string} in the search box and clicks Enter")
    public void user_types_in_the_search_box_and_clicks_enter(String string) {
        basePage.searchBox.sendKeys(string);
        basePage.searchBox.sendKeys(Keys.ENTER);
    }

    @When("user clicks the first product")
    public void user_clicks_the_first_product() {
        productPage.firstBiberon.click();
    }

    @When("user clicks Sepete Ekle button")
    public void user_clicks_sepete_ekle_button() {
        productPage.addToCartButton.click();
    }

    @Then("user clicks Sepeti Gör button")
    public void user_clicks_sepeti_gör_button() {
        productPage.showCartButton.click();
    }

    @Then("user sees {string} in the cart item list")
    public void user_sees_in_the_cart_item_list(String string) {
        BrowserUtils.verifyElementDisplayed(cartPage.cartItem);
    }

}
