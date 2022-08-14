package com.practice_automationtesting.stepDefs;

import com.practice_automationtesting.pages.ShopPage;
import com.practice_automationtesting.utilities.BrowserUtils;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;


public class ShopStepDef {

    ShopPage shopPage = new ShopPage();

    @Then("the user click on Shop Menu")
    public void theUserClickOnShopMenu() {
        shopPage.navigateToMenu("Shop");
        BrowserUtils.waitFor(1);
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

        BrowserUtils.waitFor(2);

    }

    @And("Now click on Filter button")
    public void nowClickOnFilterButton() throws InterruptedException {
        Thread.sleep(2000);
        shopPage.filterBtn.click();
        BrowserUtils.waitFor(5);

    }

    @Then("User can view books only between {int} to {int} rps price")
    public void userCanViewBooksOnlyBetweenToRpsPrice(int min, int max) {

        String actualText = shopPage.priceText.getText();
        String expectedTex = "Price: ₹" + min + " — ₹" + max;
        Assert.assertEquals("The Message DO NOT match", expectedTex, actualText);
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
        Assert.assertEquals(expectedCategoryText, actualCategoryText);

    }

    @Then("Click on Sort and verify the value {string}")
    public void click_on_Sort_and_verify_the_value(String string) {
        shopPage.selectOrderBy_Btn_loc.click();

    }

    @Then("Click on Sort {string}  item in Default sorting dropdown")
    public void click_on_Sort_item_in_Default_sorting_dropdown(String string) {

    }

    @Then("User should be able to view the popular products only")
    public void user_should_be_able_to_view_the_popular_products_only() {

    }


}
