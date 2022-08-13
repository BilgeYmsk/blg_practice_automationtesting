package com.practice_automationtesting.pages;

import com.practice_automationtesting.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

import static org.junit.Assert.assertTrue;

public class BasketPage extends BasePage{

    @FindBy(xpath = "//tr[@class='cart_item']//td")
    public List<WebElement> cartitem1_loc;

    @FindBy(xpath = "//h1[@itemprop='name']")
    public WebElement productTitle_loc;

    @FindBy(xpath = "//a[@class='pull-down']")
    public WebElement pullDownBtn_loc;

    @FindBy(xpath = "//div[@class='quantity']//input")
    public WebElement quantity_loc;


    @FindBy(linkText = "Selenium Ruby")
    public WebElement product_SeleniumBook_loc;

    @FindBy(css = ".remove")
    public WebElement remove_loc;

    @FindBy(xpath = "//input[@title='Qty']")
    public WebElement quantityBox_loc;

    @FindBy(xpath = "//table//tbody//tr//td[@class='product-subtotal']//span")
    public WebElement total_Amount_loc;

    @FindBy(xpath = "//input[@name='update_cart']")
    public WebElement update_basket_loc;

    @FindBy(xpath = "(//span[@class='woocommerce-Price-amount amount'])[5]")
    public  WebElement basketTotalAmount_loc;

    @FindBy(xpath = "//div//div//a[@class='checkout-button button alt wc-forward']")
    public WebElement proceedToCheckOut_loc;

    @FindBy(xpath = "//div//a[@class='button wc-forward']")
    public WebElement viewBasket_loc;
    @FindBy(xpath = "//div[@id='content']")
    public WebElement body_loc;

    @FindBy(id = "coupon_code")
    public WebElement coupon_code_loc;

    @FindBy(xpath = "//input[@name='apply_coupon']")
    public WebElement apply_Coupon_loc;

    @FindBy(xpath = "//table[@class='shop_table shop_table_responsive']//tr//td")
    public List<WebElement>shopTable_list_loc;

    @FindBy(xpath = "//div[@class='woocommerce-message']")
    public WebElement deleteMsg_loc;

    public void itemAndPriceVisibility(String name){

//        WebElement caritem= Driver.get().findElement(By.xpath("//table[@class='shop_table shop_table_responsive cart']//tbody//tr//td[@class='"+name+"']"));
        WebElement caritem= Driver.get().findElement(By.xpath("//table//tbody//tr[1]//td[@class='"+name+"']"));
        assertTrue(caritem.isDisplayed());


    }

//    public void itemTableClick(String name,int index){
////        WebElement caritem= Driver.get().findElement(By.xpath("//tr//td[@class='"+name+"']"));
////        WebElement caritem= Driver.get().findElement(By.xpath("//table//tbody//tr//td[@class='"+name+"']"));
//        WebElement caritem= Driver.get().findElement(By.xpath("//table//tbody//tr["+index+"]//td[@class='"+name+"']"));
//        caritem.click();
//
//        /*
//        delete=product-remove
//        img=product-thumbnail
//        Product=product-name
//        Price=product-price
//        Quantity=product-quantity
//        Total=product-subtotal
//
//         */
//
//    }
}
