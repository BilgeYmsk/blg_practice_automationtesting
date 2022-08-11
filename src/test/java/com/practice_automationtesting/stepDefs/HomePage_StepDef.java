package com.practice_automationtesting.stepDefs;

import com.practice_automationtesting.pages.Homapage_Page;
import com.practice_automationtesting.utilities.BrowserUtils;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

public class HomePage_StepDef {

    Homapage_Page homapagePage = new Homapage_Page();

    @Then("the user click on Home menu button")
    public void the_user_click_on_Home_menu_button() {
        homapagePage.homeBtn_loc.click();
    }

    @And("Test whether the Home page has {int} Sliders only")
    public void testWhetherTheHomePageHasSlidersOnly(int slider) {
        homapagePage.slider(slider);

    }

    @Then("The Home page must contains only {int} sliders")
    public void theHomePageMustContainsOnlySliders(int slider) {
        homapagePage.imgKntl(slider);

    }


    @Then("Test whether the Home page has Three Arrivals only")
    public void test_whether_the_Home_page_has_Three_Arrivals_only() {

    }

    @Then("The Home page must contains only three Arrivals")
    public void the_Home_page_must_contains_only_three_Arrivals() {

    }

    @Then("Now click the image in the Arrivals")
    public void now_click_the_image_in_the_Arrivals() {

    }

    @Then("Test whether it is navigating to next page where the user can add that book into his basket.")
    public void test_whether_it_is_navigating_to_next_page_where_the_user_can_add_that_book_into_his_basket() {

    }

    @Then("Image should be clickable and shoul navigate to next page where user can add that book to his basket")
    public void image_should_be_clickable_and_shoul_navigate_to_next_page_where_user_can_add_that_book_to_his_basket() {

    }

    @Then("Click on Description tab for the book you clicked on.")
    public void click_on_Description_tab_for_the_book_you_clicked_on() {

    }

    @Then("There should be a description regarding that book the user clicked on")
    public void there_should_be_a_description_regarding_that_book_the_user_clicked_on() {

    }

    @Then("Now clock on Reviews tab for the book you clicked on.")
    public void now_clock_on_Reviews_tab_for_the_book_you_clicked_on() {

    }

    @Then("There should be a Reviews regarding that book the user clicked on")
    public void there_should_be_a_Reviews_regarding_that_book_the_user_clicked_on() {

    }

    @Then("Click on the Add To Basket button which adds that book to your basket")
    public void click_on_the_Add_To_Basket_button_which_adds_that_book_to_your_basket() {

    }

    @Then("User can view that Book in the Menu item with price.")
    public void user_can_view_that_Book_in_the_Menu_item_with_price() {

    }

    @Then("User can add a book by clicking on Add To Basket button which adds that book in to his Basket")
    public void user_can_add_a_book_by_clicking_on_Add_To_Basket_button_which_adds_that_book_in_to_his_Basket() {

    }

    @Then("Select more books than the books in stock.Ex if the stock has {int} books, try to add {int}.")
    public void select_more_books_than_the_books_in_stock_Ex_if_the_stock_has_books_try_to_add(Integer int1, Integer int2) {

    }

    @Then("Click the add to basket button")
    public void click_the_add_to_basket_button() {

    }

    @Then("Now it throws an error prompt like you must enter a value between {int} and {int}")
    public void now_it_throws_an_error_prompt_like_you_must_enter_a_value_between_and(Integer int1, Integer int2) {

    }

    @Then("Now click on Item link which navigates to proceed to check out page.")
    public void now_click_on_Item_link_which_navigates_to_proceed_to_check_out_page() {

    }

    @Then("User can click on the Item link in menu item after adding the book in to the basket which leads to the check out page")
    public void user_can_click_on_the_Item_link_in_menu_item_after_adding_the_book_in_to_the_basket_which_leads_to_the_check_out_page() {

    }

    @Then("Enter the Coupon code as ‘krishnasakinala’ to get 50rps off on the total.")
    public void enter_the_Coupon_code_as_krishnasakinala_to_get_50rps_off_on_the_total() {

    }

    @Then("User can able to apply coupon by entering ‘krishnasakinala’ in the coupon textbox which give 50rps off on the total price")
    public void user_can_able_to_apply_coupon_by_entering_krishnasakinala_in_the_coupon_textbox_which_give_50rps_off_on_the_total_price() {

    }

    @Then("User can able to apply coupon by entering ‘krishnasakinala’ in the coupon textbox which give 50rps off on the total price because the coupon is applicable for the book price > {int} rps")
    public void user_can_able_to_apply_coupon_by_entering_krishnasakinala_in_the_coupon_textbox_which_give_50rps_off_on_the_total_price_because_the_coupon_is_applicable_for_the_book_price_rps(Integer int1) {

    }

    @Then("Now click on Remove this icon in Check out page which removes that book from the grid.")
    public void now_click_on_Remove_this_icon_in_Check_out_page_which_removes_that_book_from_the_grid() {

    }

    @Then("User has the feasibility to remove the book at the time of check out also")
    public void user_has_the_feasibility_to_remove_the_book_at_the_time_of_check_out_also() {

    }

    @Then("Click on textbox value under quantity in Check out page to add or subtract books.")
    public void click_on_textbox_value_under_quantity_in_Check_out_page_to_add_or_subtract_books() {

    }

    @Then("Now after the above change ‘Update Basket’ button will turn into Clickable mode.")
    public void now_after_the_above_change_Update_Basket_button_will_turn_into_Clickable_mode() {

    }

    @Then("Now click on Update Basket to reflect those changes")
    public void now_click_on_Update_Basket_to_reflect_those_changes() {

    }

    @Then("User has the feasibility to Update Basket at the time of check out.")
    public void user_has_the_feasibility_to_Update_Basket_at_the_time_of_check_out() {

    }

    @Then("Now User can find the Total price of the book in the Check out grid.")
    public void now_User_can_find_the_Total_price_of_the_book_in_the_Check_out_grid() {

    }

    @Then("User has the feasibility to find the total price of the books at to find the total price of the books at the time of check out")
    public void user_has_the_feasibility_to_find_the_total_price_of_the_books_at_to_find_the_total_price_of_the_books_at_the_time_of_check_out() {

    }

    @Then("Now user can find total and subtotal values just above the Proceed to Checkout button.")
    public void now_user_can_find_total_and_subtotal_values_just_above_the_Proceed_to_Checkout_button() {

    }

    @Then("The total always < subtotal because taxes are added in the subtotal")
    public void the_total_always_subtotal_because_taxes_are_added_in_the_subtotal() {

    }

    @Then("Total")
    public void total() {

    }

    @Then("Now click on Proceed to Check out button which navigates to payment gateway page.")
    public void now_click_on_Proceed_to_Check_out_button_which_navigates_to_payment_gateway_page() {

    }

    @Then("Clicking on Proceed to Checkout button leads to payment gateway page")
    public void clicking_on_Proceed_to_Checkout_button_leads_to_payment_gateway_page() {

    }

    @Then("User can view Billing Details,Order Details,Additional details and Payment gateway details.")
    public void user_can_view_Billing_Details_Order_Details_Additional_details_and_Payment_gateway_details() {

    }

    @Then("Now user can fill his details in billing details form and can opt any payment in the payment gateway like Direct bank transfer,cheque,cash or paypal.")
    public void now_user_can_fill_his_details_in_billing_details_form_and_can_opt_any_payment_in_the_payment_gateway_like_Direct_bank_transfer_cheque_cash_or_paypal() {

    }

    @Then("User has the feasibility to add coupon in the payment gateway page and also he can find billing,order and additional details.")
    public void user_has_the_feasibility_to_add_coupon_in_the_payment_gateway_page_and_also_he_can_find_billing_order_and_additional_details() {

    }

    @Then("Now click on Place Order button to complete process")
    public void now_click_on_Place_Order_button_to_complete_process() {

    }

    @Then("On clicking place-order button user completes the process where the page navigates to Order confirmation page with order details,bank details,customer details and billing details.")
    public void on_clicking_place_order_button_user_completes_the_process_where_the_page_navigates_to_Order_confirmation_page_with_order_details_bank_details_customer_details_and_billing_details() {

    }



}
