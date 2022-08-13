package com.practice_automationtesting.stepDefs;

import com.practice_automationtesting.pages.BasketPage;
import com.practice_automationtesting.pages.FirstElementPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

import static org.junit.Assert.*;

public class BasketPage_StepDef {

    FirstElementPage firstElementPage = new FirstElementPage();

    BasketPage basketPage = new BasketPage();

    @And("Now click on Item link which navigates to proceed to basket page.")
    public void nowClickOnItemLinkWhichNavigatesToProceedToBasketPage() {
        basketPage.product_SeleniumBook_loc.click();
        firstElementPage.itemAmountBtn_loc.click();
    }

    @Then("Verify Update Basket button UnClickable mode")
    public void verifyUpdateBasketButtonUnClickableMode() {

        assertFalse(basketPage.update_basket_loc.isEnabled());
    }

    @And("Click on textbox value under quantity in Basket page to add or subtract books.")
    public void clickOnTextboxValueUnderQuantityInBasketPageToAddOrSubtractBooks() throws InterruptedException {

        basketPage.quantityBox_loc.sendKeys("5");
        Thread.sleep(2000);
    }

    @Then("Now after the above change ‘Update Basket’ button will turn into Clickable mode.")
    public void now_after_the_above_change_Update_Basket_button_will_turn_into_Clickable_mode() {
        assertTrue(basketPage.update_basket_loc.isEnabled());
    }

    @Then("Now click on Update Basket to reflect those changes")
    public void now_click_on_Update_Basket_to_reflect_those_changes() {

        basketPage.update_basket_loc.click();

    }

    @Then("User has the feasibility to Update Basket at the time of check out.")
    public void user_has_the_feasibility_to_Update_Basket_at_the_time_of_check_out() {
        String actualStuck = basketPage.quantity_loc.getAttribute("value");
        String expectedStuck="51";
        assertEquals(expectedStuck,actualStuck);
    }

    @Then("Now User can find the Total price of the book in the Check out grid.")
    public void now_User_can_find_the_Total_price_of_the_book_in_the_Check_out_grid() {

        String actualAmountText=basketPage.total_Amount_loc.getText();
//        basketPage.Total_Amount_loc.getText() = ₹500.00
        String expectedAmountText="₹500.00";
        String actualNummer = actualAmountText.replace("₹", "");
        double totalPrice=Double.parseDouble(actualNummer);
        double expectedTotalPrice=500.00;
        System.out.println("totalPrice = " + totalPrice);
        System.out.println("expectedTotalPrice = " + expectedTotalPrice);
        System.out.println("actualAmountText = " + actualAmountText);
        System.out.println("expectedAmountText = " + expectedAmountText);
        assertEquals(expectedAmountText,actualAmountText);
    }

    @Then("User has the feasibility to find the total price of the books at Basket Totals")
    public void userHasTheFeasibilityToFindTheTotalPriceOfTheBooksAtBasketTotals() {

        String actualBasketTotal = basketPage.basketTotalAmount_loc.getText();
        String expectedBasketTotal="₹510.00";
        System.out.println("actualBasketTotal = " + actualBasketTotal);
        System.out.println("expectedBasketTotal = " + expectedBasketTotal);
        assertEquals(expectedBasketTotal,actualBasketTotal);
    }

    @Then("The total always < subtotal because taxes are added in the subtotal")
    public void the_total_always_subtotal_because_taxes_are_added_in_the_subtotal() {

        String actualAmountText=basketPage.total_Amount_loc.getText();
        String actualNummer = actualAmountText.replace("₹", "");
        double totalPrice=Double.parseDouble(actualNummer);

        String actualBasketTotal = basketPage.basketTotalAmount_loc.getText();
        String actualBasketNummer = actualBasketTotal.replace("₹", "");
        double basketTotalPrice=Double.parseDouble(actualBasketNummer);

            assertTrue(basketTotalPrice>totalPrice);

    }
    @Then("Now click on Proceed to Check out button which navigates to payment gateway page.")
    public void now_click_on_Proceed_to_Check_out_button_which_navigates_to_payment_gateway_page() {

        basketPage.proceedToCheckOut_loc.click();
    }
}
