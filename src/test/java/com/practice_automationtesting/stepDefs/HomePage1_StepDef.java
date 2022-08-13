package com.practice_automationtesting.stepDefs;

import com.practice_automationtesting.pages.FirstElementPage;
import com.practice_automationtesting.pages.Homapage_Page;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class HomePage1_StepDef {

    Homapage_Page homapagePage = new Homapage_Page();
    FirstElementPage firstElementPage = new FirstElementPage();

    @Then("the user click on Home menu button")
    public void the_user_click_on_Home_menu_button() {
        homapagePage.homeBtn_loc.click();
    }

    @And("Test whether the Home page has {int} Sliders only")
    public void testWhetherTheHomePageHasSlidersOnly(int slider) {
        homapagePage.slider(slider);
    }

    @Then("Verify The Home page must contains only {int} sliders")
    public void verifyTheHomePageMustContainsOnlySliders(int slider) {
        homapagePage.sliderSize_Mtd(slider);
    }

    @Then("Verify The Home page must contains only {int} Arrivals")
    public void verify_The_Home_page_must_contains_only_Arrivals(int arrival) {
        homapagePage.arrivalsSize_Mtd(arrival);
    }

    @Then("Now click the image in the Arrivals")
    public void now_click_the_image_in_the_Arrivals() {
        homapagePage.firstElementArrival_loc.click();
    }

    @And("User can add a book by clicking on Add To Basket button")
    public void userCanAddABookByClickingOnAddToBasketButton() {
        assertTrue(firstElementPage.addBasket_btn_loc.isDisplayed());
        firstElementPage.addBasket_btn_loc.click();
    }

    @Then("Verify that book in to his Basket")
    public void verifyThatBookInToHisBasket() throws InterruptedException {
        String actualMessage = firstElementPage.message_loc.getText();
        String expectedMessage = "VIEW BASKET\n" +
                "“Selenium Ruby” has been added to your basket.";
        assertEquals(expectedMessage, actualMessage);
        Thread.sleep(2000);
    }

    @And("Click on Description tab")
    public void clickOnDescriptionTab() {
        firstElementPage.description_loc.click();
    }

    @Then("Verify to There should be a description regarding that book the user clicked on")
    public void verifyToThereShouldBeADescriptionRegardingThatBookTheUserClickedOn() {
        assertTrue(firstElementPage.productDescription_loc.isDisplayed());
    }

    @Then("Now click on Reviews tab for the book you clicked on.")
    public void now_click_on_Reviews_tab_for_the_book_you_clicked_on() {firstElementPage.reviewsBtn_loc.click();}

    @Then("Verify to There should be a Reviews regarding that book the user clicked on")
    public void verifyToThereShouldBeAReviewsRegardingThatBookTheUserClickedOn() {
        assertTrue(firstElementPage.regardingReviews_loc.isEnabled());
//        System.out.println("firstElementPage.regardingReviews_loc = " + firstElementPage.regardingReviews_loc.getText());
    }


}
