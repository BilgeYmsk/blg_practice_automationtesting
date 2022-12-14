package com.practice_automationtesting.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProductPage extends BasePage{

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

    @FindBy(xpath = "//span[@class='amount']")
    public WebElement itemAmountBtn_loc;

    @FindBy(xpath = "//div[@class='woocommerce-message']")
    public WebElement message_loc;

    @FindBy(xpath = "//input[@title='Qty']")
    public WebElement productStuck;

    @FindBy(xpath = "//div//p[@class='stock in-stock']")
    public WebElement stock_loc;

    @FindBy(xpath = "//li[contains(text(),'You cannot add that amount to the cart — we have 9')]")
    public WebElement stockText_loc;

    @FindBy(xpath = "(//p[@class='price']//del//span)[1]")
    public WebElement oldPrice_Log;

    @FindBy(xpath = "(//span[@class='woocommerce-Price-amount amount'])[2]")
    public WebElement newPrice_loc;

    @FindBy(xpath = "//div[@class='quantity']//input")
    public WebElement maxStuck_loc;
}
