package com.practice_automationtesting.stepDefs;

import com.practice_automationtesting.pages.BasketPage;
import com.practice_automationtesting.pages.ProductPage;
import com.practice_automationtesting.utilities.BrowserUtils;
import com.practice_automationtesting.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.devtools.v85.browser.model.WindowState;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class HomePage2_StepDef {

    ProductPage productPage = new ProductPage();

    BasketPage basketPage = new BasketPage();


    @Then("User can view that Book in the Menu item with price.")
    public void user_can_view_that_Book_in_the_Menu_item_with_price() throws InterruptedException {

        BrowserUtils.scrollToElement(basketPage.body_loc);
        basketPage.viewBasket_loc.click();
        Thread.sleep(3000);

        assertTrue(basketPage.product_SeleniumBook_loc.isDisplayed());

//        basketPage.itemAndPriceVisibility("product-name");
//        basketPage.itemAndPriceVisibility("product-price");
////        assertTrue(basketPage.cartitem1_loc.get(2).isDisplayed());
//        assertTrue(basketPage.cartitem1_loc.get(3).isDisplayed());
    }


    @And("Select more books than the books in stock.")
    public void selectMoreBooksThanTheBooksInStock() throws InterruptedException {
        Driver.get().navigate().back();

        //1.way für maxStuck -->dynamic
        String stockText = productPage.stock_loc.getText();
//        firstElementPage.stock_loc.getText() = '9964 in stock' -->9964
        String actualStockText = stockText.replace(" in stock", "");

        // 2.way  für maxStuck -->dynamic
//        String max = productPage.maxStuck_loc.getAttribute("max");
//        System.out.println("max = " + max);

        productPage.productStuck.sendKeys(actualStockText + 1);
//        Thread.sleep(3);

    }

    @Then("Click the add to basket button")
    public void click_the_add_to_basket_button() {
        productPage.addBasket_btn_loc.click();
    }

    @And("Now it throws an error prompt like you must enter a value between one and twenty")
    public void nowItThrowsAnErrorPromptLikeYouMustEnterAValueBetweenOneAndTwenty() throws InterruptedException {
//        Alert alert=Driver.get().switchTo().alert();
//        System.out.println("alert.getText() = " + alert.getText());
//        Thread.sleep(2000);
//        WebElement element = Driver.get().findElement(By.xpath("(//input[@type='hidden'])[1]"));
//        System.out.println("element.getText() = " + element.getText());
////        Thread.sleep(3000);
//       assertTrue(Driver.get().findElement(By.xpath("/html")).getText().contains("Wert muss kleiner als oder gleich 9960 sein."));
//        System.out.println("element = " + element.getAttribute(""));
//        assertTrue(element.isDisplayed());
//        System.out.println("Wert muss kleiner als oder gleich 9960 sein.");
    }


    @And("Enter the Coupon code as {string} to get {int}rps off on the total.")
    public void enterTheCouponCodeAsToGetRpsOffOnTheTotal(String coupenCode, int discount) throws InterruptedException {
        basketPage.coupon_code_loc.sendKeys(coupenCode);
        Thread.sleep(2000);
        basketPage.apply_Coupon_loc.click();
        Thread.sleep(2000);
    }

    @Then("Verify {int}rps discount with coupon on total price")
    public void verifyRpsDiscountWithCouponOnTotalPrice(int discount) {

        String actualText = basketPage.shopTable_list_loc.get(1).getText();
        String expectedText = "-₹" + discount + ".00, Free shipping coupon [Remove]";
        System.out.println("actualText = " + actualText);
        System.out.println("expectedText = " + expectedText);
        assertEquals(expectedText, actualText);

    }

    @Then("verify to the total price because the coupon is applicable for the book price > {int} rps")
    public void verifyToTheTotalPriceBecauseTheCouponIsApplicableForTheBookPriceRps(int rps) {

        String price = basketPage.shopTable_list_loc.get(0).getText();
        String totalPrice = price.replace("₹", "");
        double price_total = Double.parseDouble(totalPrice);
//        System.out.println("totalPrice = " + totalPrice); //totalPrice = ₹500.00
        assertTrue(price_total > rps);

        String actualApply_CouponText = basketPage.apply_Coupon_Msg_loc.getText();
        String expectedApply_CouponText = "Coupon code applied successfully.";
        assertEquals(expectedApply_CouponText, actualApply_CouponText);


    }

    @And("Now click on Remove this icon in Check out page")
    public void nowClickOnRemoveThisIconInCheckOutPage() throws InterruptedException {
        basketPage.remove_loc.click();
        Thread.sleep(3000);

    }

    @Then("Verify user can remove the book at the time of check out")
    public void verifyUserCanRemoveTheBookAtTheTimeOfCheckOut() {
        String actualDeleteMessage = basketPage.deleteMsg_loc.getText();
        String expectedDeleteMessage = "Selenium Ruby removed. Undo?";
        System.out.println("actualDeleteMessage = " + actualDeleteMessage);
        System.out.println("expectedDeleteMessage = " + expectedDeleteMessage);
        assertEquals(expectedDeleteMessage, actualDeleteMessage);
    }


}
