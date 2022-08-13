package com.practice_automationtesting.stepDefs;

import com.practice_automationtesting.pages.ShopPage;
import com.practice_automationtesting.utilities.BrowserUtils;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;


public class ShopStepDef {

    ShopPage shopPage=new ShopPage();

    @Then("the user click on Shop Menu")
    public void theUserClickOnShopMenu() {
        shopPage.navigateToMenu("Shop");
        BrowserUtils.waitFor(1);
    }

    @And("The User should be able to select two ranges of numbers as filters")
    public void theUserShouldBeAbleToSelectTwoRangesOfNumbersAsFilters() throws InterruptedException {

//        Actions move = new Actions(Driver.get());
//        Action action = move.dragAndDropBy(shopPage.priceRight, 60, 0).build();
//        action.perform();

        for(int i=150; i<200; i++){  //baslangic noktasi önemli sitede 150 den basliyor
            shopPage.priceRight.sendKeys((Keys.ARROW_RIGHT));
        }

        for (int i = 0; i <50 ; i++) { //locater da yüzde deger görünüyor ama bu metodla adim adim ilerleme oldugundan istedigim rakam araligini yazabiliyorum
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
        String expectedTex="Price: ₹"+min+" — ₹"+max;
        Assert.assertEquals("The Message DO NOT match",expectedTex,actualText);


    }
}
