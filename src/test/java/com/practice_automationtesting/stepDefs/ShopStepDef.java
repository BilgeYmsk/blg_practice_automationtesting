package com.practice_automationtesting.stepDefs;

import com.practice_automationtesting.pages.ProductPage;
import com.practice_automationtesting.pages.ShopPage;
import static com.practice_automationtesting.utilities.BrowserUtils.*;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import static org.junit.Assert.*;
import org.openqa.selenium.Keys;


public class ShopStepDef {

    ShopPage shopPage = new ShopPage();
    ProductPage productPage = new ProductPage();

    @Then("the user click on Shop Menu")
    public void theUserClickOnShopMenu() {
        shopPage.navigateToMenu("Shop");
        waitFor(1);
    }

    @And("Adjust the filter by price between number")
    public void adjustTheFilterByPriceBetweenNumber() throws InterruptedException {

//        Actions move = new Actions(Driver.get());
//        Action action = move.dragAndDropBy(shopPage.priceRight, 60, 0).build();
//        action.perform();

        for (int i = 150; i < 200; i++) {  //baslangic noktasi önemli sitede 150 den basliyor
            shopPage.priceRight.sendKeys((Keys.ARROW_RIGHT));
        }

        for (int i = 0; i < 50; i++) { //locater da yüzde deger görünüyor ama bu metodla adim adim ilerleme oldugundan istedigim rakam araligini yazabiliyorum
            shopPage.priceLeft.sendKeys(Keys.ARROW_LEFT);
        }

        waitFor(2);

    }

    @And("Now click on Filter button")
    public void nowClickOnFilterButton() throws InterruptedException {
        Thread.sleep(2000);
        shopPage.filterBtn.click();
        waitFor(5);

    }

    @Then("User can view books only between {int} to {int} rps price")
    public void userCanViewBooksOnlyBetweenToRpsPrice(int min, int max) {

        String actualText = shopPage.priceText.getText();
        String expectedTex = "Price: ₹" + min + " — ₹" + max;
        assertEquals("The Message DO NOT match", expectedTex, actualText);
    }

    @Then("Click on any of the product links available in the product category")
    public void click_on_any_of_the_product_links_available_in_the_product_category() {
        shopPage.productCategories_Mthd("JavaScript");
    }

    @Then("The user should be able to see only that particular product")
    public void the_user_should_be_able_to_see_only_that_particular_product() {
        String actualCategoryText = shopPage.javaScriptText_loc.getText();
        String expectedCategoryText = "Home / JavaScript";
        System.out.println("actualCategoryText = " + actualCategoryText);
        System.out.println("expectedCategoryText = " + expectedCategoryText);
        assertEquals(expectedCategoryText, actualCategoryText);

    }

    @Then("Click on Sort and verify the value {string}")
    public void click_on_Sort_and_verify_the_value(String string) {

        shopPage.selectOrderBy_Btn_loc.click();

        shopPage.selectSorting_Mthd();

    }

    @Then("Click on Sort {string}  item in Default sorting dropdown")
    public void click_on_Sort_item_in_Default_sorting_dropdown(String orderBy,String order) throws InterruptedException {

       shopPage.selectSorting_OrderBy(orderBy,order);
        Thread.sleep(3000);
    }

    @Then("Click on Sort {string}  item and verify User should be able to view {string} only")
    public void clickOnSortItemAndVerifyUserShouldBeAbleToViewOnly(String orderBy, String order) throws InterruptedException {
        shopPage.selectSorting_OrderBy(orderBy, order);
        Thread.sleep(3000);

    }

/*
    // the three method für -->#Scenario: Shop Read More Functionality
    @Then("Click on read more button in home page")
    public void click_on_read_more_button_in_home_page() { }

    @Then("Read More option indicates the Out Of Stock.")
    public void read_More_option_indicates_the_Out_Of_Stock() {}

    @Then("User cannot add the product which has read more option as it was out of stock.")
    public void user_cannot_add_the_product_which_has_read_more_option_as_it_was_out_of_stock() {}

 */

    @Then("Click on Sale written product in home page")
    public void click_on_Sale_written_product_in_home_page() {
        shopPage.onsole_firstProduct_loc.click();
    }

    @Then("User can view the actual price with old price striken for the sale written products")
    public void user_can_view_the_actual_price_with_old_price_striken_for_the_sale_written_products() {
//        String oldPrice = shopPage.oldPrice_firstProduct_loc.getText();
//        String newPrice = shopPage.newPrice_firstProduct_loc.getText();
//        System.out.println("oldPrice = " + oldPrice);
//        System.out.println("newPrice = " + newPrice);
        String oldPrice = productPage.oldPrice_Log.getText();
        String newPrice = productPage.newPrice_loc.getText();
//        System.out.println("oldPrice = " + oldPrice);
//        System.out.println("newPrice = " + newPrice);
        assertTrue(productPage.oldPrice_Log.isDisplayed());
        assertTrue(productPage.newPrice_loc.isDisplayed());


    }

    @And("Click on the Add To Basket button of the {int} book")
    public void clickOnTheAddToBasketButtonOfTheBook(int product) {

        shopPage.addBasketWithIndex(product);

    }

    @Then("Click on View Basket link which navigates to proceed to check out page.")
    public void click_on_View_Basket_link_which_navigates_to_proceed_to_check_out_page() {
        shopPage.viewBasket_loc.click();
    }

    @Then("User can find total and subtotal values just above the Proceed to Checkout button.")
    public void user_can_find_total_and_subtotal_values_just_above_the_Proceed_to_Checkout_button() {
        assertFalse(shopPage.basketTotal_list_loc.isEmpty());

    }


}
