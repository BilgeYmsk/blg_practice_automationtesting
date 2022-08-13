package com.practice_automationtesting.stepDefs;

import com.practice_automationtesting.pages.BasePage;
import com.practice_automationtesting.pages.CheckOutPage;
import io.cucumber.java.en.Then;

import static org.junit.Assert.*;

public class CheckOut_StepDef extends BasePage {

    CheckOutPage checkOutPage = new CheckOutPage();

    @Then("User can view Billing Details,Order Details,Additional details and Payment gateway details.")
    public void user_can_view_Billing_Details_Order_Details_Additional_details_and_Payment_gateway_details() {
        assertTrue(checkOutPage.billingDetailsText_loc.isDisplayed());
        assertTrue(checkOutPage.additionalInfoText_loc.isDisplayed());
    }

    @Then("Now user can fill his details in billing details form and can opt any payment in the payment gateway like Direct bank transfer,cheque,cash or paypal.")
    public void now_user_can_fill_his_details_in_billing_details_form_and_can_opt_any_payment_in_the_payment_gateway_like_Direct_bank_transfer_cheque_cash_or_paypal() {

    }

    @Then("User has the feasibility to add coupon in the payment gateway page")
    public void userHasTheFeasibilityToAddCouponInThePaymentGatewayPage() {
    }

    @Then("Now click on Place Order button to complete process")
    public void now_click_on_Place_Order_button_to_complete_process() {

    }

    @Then("On clicking place-order button user completes the process where the page navigates to Order confirmation page with order details,bank details,customer details and billing details.")
    public void on_clicking_place_order_button_user_completes_the_process_where_the_page_navigates_to_Order_confirmation_page_with_order_details_bank_details_customer_details_and_billing_details() {

    }


}
