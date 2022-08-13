package com.practice_automationtesting.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CheckOutPage extends BasePage{

    @FindBy(xpath = "//h3[text()='Billing Details']")
    public WebElement billingDetailsText_loc;

    @FindBy(xpath = "//h3[text()='Additional Information']")
    public WebElement additionalInfoText_loc;


}
