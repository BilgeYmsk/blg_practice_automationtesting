package com.practice_automationtesting.pages;

import com.github.javafaker.Faker;
import com.practice_automationtesting.utilities.BrowserUtils;
import com.practice_automationtesting.utilities.Driver;

import static org.junit.Assert.*;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class CheckOutPage extends BasePage {

    @FindBy(xpath = "//h3[text()='Billing Details']")
    public WebElement billingDetailsText_loc;

    @FindBy(xpath = "//h3[text()='Additional Information']")
    public WebElement additionalInfoText_loc;

    @FindBy(xpath = "//div[@class='woocommerce-info'][1]")
    public WebElement returningCustomerText_loc;

    @FindBy(xpath = "//div[@class='woocommerce-info'][1]//a")
    public WebElement returningCustomerBtn_loc;

    @FindBy(id = "username")
    public WebElement usernameOderEmail_Customer_loc;

    @FindBy(id = "password")
    public WebElement password_Customer_loc;

    @FindBy(xpath = "//input[@name='login']")
    public WebElement loginBtn_Customer_loc;


    @FindBy(xpath = "//div[@class='woocommerce-info'][2]")
    public WebElement haveACouponText_loc;

    @FindBy(xpath = "//div[@class='woocommerce-info'][2]//a")
    public WebElement addCouponBtn_loc;

    @FindBy(id = "coupon_code")
    public WebElement couponBox_loc;

    @FindBy(xpath = "//input[@name='apply_coupon']")
    public WebElement applyCopuon_ChckPg_loc;

//    @FindBy(xpath = "//div[@class='woocommerce-billing-fields']//p")
//    public List<WebElement> billingsDetail_List;

    @FindBy(xpath = "//b[@role='presentation']")
    public WebElement countryBtn_loc;

    @FindBy(xpath = "//h3[text()='Your order']")
    public WebElement yourOrderText_loc;

    @FindBy(id = "place_order")
    public WebElement placeOrderBtn_loc;

    @FindBy(xpath = "//ul//li//strong")
    List<WebElement> billingDetail_List;


    public void billingDetailsForm(String name) throws InterruptedException {

        Faker faker = new Faker();
        WebElement menu = Driver.get().findElement(By.xpath("//div[@class='woocommerce-billing-fields']//p//input[@id='" + name + "']"));
        switch (name) {
            case "billing_first_name":
                menu.sendKeys(faker.name().firstName());
                break;
            case "billing_last_name":
                menu.sendKeys(faker.name().lastName());
                break;
            case "billing_company":
                menu.sendKeys(faker.company().name());
                break;
            case "billing_email":
                menu.sendKeys(faker.internet().emailAddress());
                break;
            case "billing_phone":
                menu.sendKeys(faker.phoneNumber().cellPhone());
                break;
            case "billing_country_field":
                countrySelect();
                break;

            case "billing_address_1": //Street adress
                menu.sendKeys(faker.address().streetAddress());
                break;
            case "billing_address_2": //Apartman
                menu.sendKeys(faker.address().buildingNumber());
                break;
            case "billing_city":
                menu.sendKeys(faker.address().city());
                break;
            case "billing_postcode":
                menu.sendKeys(faker.address().zipCode());
                break;
            default:
        }

        /*
        Billing Email Address is a required field.
        Phone is not a valid phone number.
         */
    }

    public void countrySelect() throws InterruptedException {

        countryBtn_loc.click();

        WebElement countryListe = Driver.get().findElement(By.cssSelector("#billing_country"));

        Select country = new Select(countryListe);

        //Extra Info SelectDropDown
//        List<WebElement> countryList = country.getOptions();  //ich kann all Country finden und -->getOptions -->return List Element
//        for (WebElement option : countryList) {
//            option.getText();
//        }
        //verify that default country is null
        String expectedOption = "";
        String actualOption = country.getFirstSelectedOption().getText();
        System.out.println("actualOption = " + actualOption);
        assertEquals(actualOption, expectedOption, "verify that default country is null");

        country.selectByVisibleText("FR");

        expectedOption = "France";
        actualOption = country.getFirstSelectedOption().getText();
        assertEquals(actualOption, expectedOption, "verify that default country is France");
        Thread.sleep(6000);


    }

    public void billingTotalDetail_methd() {
//        for (WebElement webElement : billingDetail_List) {
//            System.out.println("Detail = " + webElement.getText());
//
//        }
        for (int i = 0; i < billingDetail_List.size(); i++) {
            System.out.print(billingDetail_List.get(i).getText() + " ");

        }
    }


}
