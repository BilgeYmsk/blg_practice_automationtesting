package com.practice_automationtesting.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FirstElementPage extends BasePage{

    @FindBy(xpath = "//button[text()='Add to basket']")
    public WebElement addBasket_btn_loc;

    @FindBy(xpath = "//a[text()='Description']")
    public WebElement description_loc;

    @FindBy(xpath = "//h2[text()='Product Description']")
    public WebElement productDescription_loc;

    @FindBy(xpath = "//ul[@class='tabs wc-tabs']//li[2]")
    public WebElement reviewsBtn_loc;

    @FindBy(xpath = "//h2[text()='Reviews']")
    public WebElement regardingReviews_loc;
}
