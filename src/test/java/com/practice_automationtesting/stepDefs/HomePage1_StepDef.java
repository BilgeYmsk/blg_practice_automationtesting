package com.practice_automationtesting.stepDefs;

import com.practice_automationtesting.pages.FirstElementPage;
import com.practice_automationtesting.pages.Homapage_Page;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

import static org.junit.Assert.*;

public class HomePage1_StepDef {

    Homapage_Page homapagePage = new Homapage_Page();
    FirstElementPage firstElementPage = new FirstElementPage();

    @Then("the user click on Home menu button")
    public void the_user_click_on_Home_menu_button() {
        homapagePage.homeBtn_loc.click();
    }

    @And("Test whether the Home page has {int} Sliders only")
    public void testWhetherTheHomePageHasSlidersOnly(int slider) {homapagePage.slider(slider);}

    @Then("The Home page must contains only {int} sliders")
    public void theHomePageMustContainsOnlySliders(int slider) {homapagePage.sliderSize_Mtd(slider);}

    @Then("Verify The Home page must contains only {int} Arrivals")
    public void verify_The_Home_page_must_contains_only_Arrivals(int arrival) {homapagePage.arrivalsSize_Mtd(arrival);}

    @Then("Now click the image in the Arrivals")
    public void now_click_the_image_in_the_Arrivals() {homapagePage.firstElementArrival_loc.click();}

    @Then("User can add a book by clicking on Add To Basket button which adds that book in to his Basket")
    public void user_can_add_a_book_by_clicking_on_Add_To_Basket_button_which_adds_that_book_in_to_his_Basket() throws InterruptedException {
        assertTrue(firstElementPage.addBasket_btn_loc.isDisplayed());
        firstElementPage.addBasket_btn_loc.click();
        String actualMessage = firstElementPage.message_loc.getText();
        String expectedMessage="VIEW BASKET\n" +
                "“Selenium Ruby” has been added to your basket.";
        assertEquals(expectedMessage,actualMessage);

//        BrowserUtils.scrollToElement(firstElementPage.description_loc);
        Thread.sleep(2000);

    }

//    @Then("Test whether it is navigating to next page where the user can add that book into his basket.")
//    public void test_whether_it_is_navigating_to_next_page_where_the_user_can_add_that_book_into_his_basket() throws InterruptedException {
//
//        assertTrue(firstElementPage.addBasket_btn_loc.isDisplayed());
//        firstElementPage.addBasket_btn_loc.click();
//        String actualMessage = firstElementPage.message_loc.getText();
//        String expectedMessage="VIEW BASKET\n" +
//                "“Selenium Ruby” has been added to your basket.";
//        System.out.println("actualMessage = " + actualMessage);
//        System.out.println("expectedMessage = " + expectedMessage);
//        assertEquals(expectedMessage,actualMessage);
//
////        BrowserUtils.scrollToElement(firstElementPage.description_loc);
//        Thread.sleep(2000);
//
//
//    }

    @Then("Click on Description tab for the book you clicked on.")
    public void click_on_Description_tab_for_the_book_you_clicked_on() {firstElementPage.description_loc.click();}

    @Then("There should be a description regarding that book the user clicked on")
    public void there_should_be_a_description_regarding_that_book_the_user_clicked_on() {
        assertTrue(firstElementPage.productDescription_loc.isEnabled());
//        System.out.println(firstElementPage.productDescription_loc.getText());

    }

    @Then("Now click on Reviews tab for the book you clicked on.")
    public void now_click_on_Reviews_tab_for_the_book_you_clicked_on() {
        firstElementPage.reviewsBtn_loc.click();

    }

    @Then("There should be a Reviews regarding that book the user clicked on")
    public void there_should_be_a_Reviews_regarding_that_book_the_user_clicked_on() {

        assertTrue(firstElementPage.regardingReviews_loc.isDisplayed());
//        System.out.println("firstElementPage.regardingReviews_loc = " + firstElementPage.regardingReviews_loc.getText());
    }


}
