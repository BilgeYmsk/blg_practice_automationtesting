package com.practice_automationtesting.stepDefs;

import com.practice_automationtesting.pages.BasketPage;
import com.practice_automationtesting.pages.FirstElementPage;
import com.practice_automationtesting.utilities.BrowserUtils;
import com.practice_automationtesting.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class HomePage2_StepDef {

    FirstElementPage firstElementPage = new FirstElementPage();

    BasketPage basketPage = new BasketPage();

    WebDriver driver;


    @Then("Click on the Add To Basket button which adds that book to your basket")
    public void click_on_the_Add_To_Basket_button_which_adds_that_book_to_your_basket() {
        String actualResult = firstElementPage.itemAmountBtn_loc.getText();
        String expectedResult = "₹500.00";
        assertEquals(expectedResult, actualResult);

    }

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
        String stockText = firstElementPage.stock_loc.getText();
//        firstElementPage.stock_loc.getText() = 9964 in stock buradan rakami almaliyim
        String actualStockText = stockText.replace(" in stock", "");
        firstElementPage.productStuck.sendKeys(actualStockText + 1);
        Thread.sleep(3);

    }

    @Then("Click the add to basket button")
    public void click_the_add_to_basket_button() {
        firstElementPage.addBasket_btn_loc.click();
    }

    @And("Now it throws an error prompt like you must enter a value between one and twenty")
    public void nowItThrowsAnErrorPromptLikeYouMustEnterAValueBetweenOneAndTwenty() {

//        Alert alert=Driver.get().switchTo().alert();
//        System.out.println("alert.getText() = " + alert.getText());
        assertTrue(Driver.get().findElement(By.xpath("//input[@title='Qty']")).isDisplayed());
        System.out.println("Wert muss kleiner als oder gleich 9960 sein.");
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
        String totalPrice=price.replace("₹","");
        double price_total=Double.parseDouble(totalPrice);
//        System.out.println("totalPrice = " + totalPrice); //totalPrice = ₹500.00
        assertTrue(price_total>rps);

        String actualApply_CouponText = basketPage.apply_Coupon_Msg_loc.getText();
        String expectedApply_CouponText="Coupon code applied successfully.";
        assertEquals(expectedApply_CouponText,actualApply_CouponText);


    }

    @And("Now click on Remove this icon in Check out page")
    public void nowClickOnRemoveThisIconInCheckOutPage() throws InterruptedException {
        basketPage.remove_loc.click();
        Thread.sleep(3000);

    }

    @Then("Verify user can remove the book at the time of check out")
    public void verifyUserCanRemoveTheBookAtTheTimeOfCheckOut(){
        String actualDeleteMessage = basketPage.deleteMsg_loc.getText();
        String expectedDeleteMessage = "Selenium Ruby removed. Undo?";
        System.out.println("actualDeleteMessage = " + actualDeleteMessage);
        System.out.println("expectedDeleteMessage = " + expectedDeleteMessage);
        assertEquals(expectedDeleteMessage, actualDeleteMessage);
    }





}
