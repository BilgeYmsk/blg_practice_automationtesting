package com.practice_automationtesting.pages;

import com.practice_automationtesting.utilities.Driver;
import static org.junit.Assert.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class ShopPage extends BasePage {

    @FindBy(xpath = "//a[text()='Shop']")
    public WebElement shopBtn;

    @FindBy(xpath = "//span[@tabindex='0'][2]")
    public WebElement priceLeft;

    @FindBy(xpath = "//span[@tabindex='0'][1]")
    public WebElement priceRight;

    @FindBy(xpath = "//button[text()='Filter']")
    public WebElement filterBtn;

    @FindBy(xpath = "//div[@class='price_label']")
    public WebElement priceText;

    @FindBy(xpath = "//ul[@class='product-categories']")
    public List<WebElement> product_Categories_loc;

    @FindBy(xpath = "//div//nav[@class='woocommerce-breadcrumb']")
    public WebElement javaScriptText_loc;

    @FindBy(css = ".woocommerce-ordering")
    public WebElement selectOrderBy_Btn_loc;

    @FindBy(xpath = "//span[@class='onsale'][1]")
    public WebElement onsole_firstProduct_loc;

    @FindBy(xpath = "(//span[@class='price']//del//span)[1]")
    public WebElement oldPrice_firstProduct_loc;

    @FindBy(xpath = "(//span[@class='price']//ins//span)[1]")
    public WebElement newPrice_firstProduct_loc;

    public void productCategories_Mthd(String name) {
        WebElement categorie = Driver.get().findElement(By.xpath("//a[text()='" + name + "']"));
        categorie.click();
    }

    public void selectSorting_Mthd() {

        WebElement sorting = Driver.get().findElement(By.xpath("//select[@class='orderby']"));

        Select orderBy = new Select(sorting);

        String expectedOption = "Default sorting";
        System.out.println("expectedOption = " + expectedOption);
        String actualOption = orderBy.getFirstSelectedOption().getText();
        System.out.println("actualOption = " + actualOption);

        assertEquals("verify that default Text is Default sorting", actualOption, expectedOption);

//        orderBy.selectByVisibleText("Sort by popularity");
//
//        expectedOption = "Sort by popularity";
//        actualOption = orderBy.getFirstSelectedOption().getText();
//        assertEquals("verify that default country is Sort by popularity",actualOption, expectedOption );

    }

    public void selectSorting_OrderBy(String orderBy,String order) {
        WebElement sorting = Driver.get().findElement(By.xpath("//select[@class='orderby']"));

        Select select = new Select(sorting);

        switch (orderBy){
            case "Sort by popularity":
                select.selectByValue(order);
                assertTrue(Driver.get().getCurrentUrl().contains("orderby=popularity"));
                break;
            case "Sort by average rating":
                select.selectByValue(order);
                assertTrue(Driver.get().getCurrentUrl().contains("orderby=rating"));
                break;
            case "Sort by newness":
                select.selectByValue(order);
                assertTrue(Driver.get().getCurrentUrl().contains("orderby=date"));
                break;
            case "Sort by price: low to high":
                select.selectByValue(order);
                assertTrue(Driver.get().getCurrentUrl().contains("orderby=price"));
                break;
            case "Sort by price: high to low":
                select.selectByValue(order);
                assertTrue(Driver.get().getCurrentUrl().contains("orderby=price-desc"));
                break;
            default:
                System.out.println("Wrong OrderBy entered!!!");
        }


//        List<WebElement> orderList = select.getOptions();
//
//        for (WebElement option : orderList) {
//            if(option.getText().equalsIgnoreCase(order)){
//                option.click();
//            }
//        }

    }
    public void getUrl(){

        String currentUrl = Driver.get().getCurrentUrl();
        System.out.println("currentUrl = " + currentUrl);
        assertTrue(Driver.get().getCurrentUrl().contains("orderby=popularity"));


    }
}
