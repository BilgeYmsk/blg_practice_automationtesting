package com.practice_automationtesting.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class CheckOutPage extends BasePage{

    @FindBy(xpath = "//h3[text()='Billing Details']")
    public WebElement billingDetailsText_loc;

    @FindBy(xpath = "//h3[text()='Additional Information']")
    public WebElement additionalInfoText_loc;

    @FindBy(xpath = "//div[@class='woocommerce-info'][1]")
    public WebElement returningCustomerText_loc;

    @FindBy(xpath = "//div[@class='woocommerce-info'][1]//a")
    public WebElement returningCustomerBtn_loc;

    @FindBy(id = "username")
    public WebElement usernameBox_loc;

    @FindBy(id="password")
    public WebElement passwordBox_loc;

    @FindBy(xpath = "//input[@name='login']")
    public WebElement loginBtn_loc;

    @FindBy(xpath = "//div[@class='woocommerce-info'][2]")
    public WebElement haveACouponText_loc;

    @FindBy(xpath = "//div[@class='woocommerce-info'][2]//a")
    public WebElement addCouponBtn_loc;

    @FindBy(id = "coupon_code")
    public WebElement couponBox_loc;

    @FindBy(xpath = "//input[@name='apply_coupon']")
    public WebElement applyCopuon_ChckPg_loc;

    @FindBy(xpath = "//div[@class='woocommerce-billing-fields']//p")
    public List<WebElement>billingsDetail_List;

    @FindBy(id = "place_order")
    public WebElement placeOrderBtn_loc;


}
