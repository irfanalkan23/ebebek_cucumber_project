package com.ebebek.step_definitions;

import com.ebebek.pages.BasePage;
import com.ebebek.pages.CartPage;
import com.ebebek.pages.LoginPage;
import com.ebebek.pages.ProductPage;
import com.ebebek.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;

public class Cart_StepDefinitions {
    BasePage basePage = new BasePage();
    ProductPage productPage = new ProductPage();
    CartPage cart = new CartPage();
    LoginPage loginPage = new LoginPage();

    @Given("user is at the ebebek home page")
    public void user_is_at_the_ebebek_home_page() {
        Driver.getDriver();
    }

    @When("user types {string} in the search box and clicks Enter")
    public void user_types_in_the_search_box_and_clicks_enter(String string) {
        basePage.searchBox.sendKeys(string);
        basePage.searchBox.sendKeys(Keys.ENTER);
    }

    @Then("user sees {string} in the page title")
    public void user_sees_in_the_page_title(String string) {
        Assert.assertTrue(Driver.getDriver().getTitle().contains("Ara biberon - ebebek"));
    }

    @When("user clicks the first product")
    public void user_clicks_the_first_product() {
        productPage.firstBiberon.click();
    }

    @Then("user sees {string} in the product page title")
    public void user_sees_in_the_product_page_title(String string) {
        Assert.assertTrue(Driver.getDriver().getTitle().contains("Lansinoh Hoşgeldin Bebek Biberon Seti - ebebek"));
    }

    @Then("user sees {string} at the product title")
    public void user_sees_at_the_product_title(String string) {
        Assert.assertTrue(Driver.getDriver().getTitle().contains("Hoşgeldin Bebek Biberon Seti"));
    }

    @When("user clicks Sepete Ekle button")
    public void user_clicks_sepete_ekle_button() {

    }
    @Then("user sees Ürün Sepetinizde window")
    public void user_sees_ürün_sepetinizde_window() {

    }
    @Then("user clicks Sepeti Gör button")
    public void user_clicks_sepeti_gör_button() {

    }
    @Then("sees {string} in the page title")
    public void sees_in_the_page_title(String string) {

    }
    @Then("user sees {string} in the cart item list")
    public void user_sees_in_the_cart_item_list(String string) {

    }

}
