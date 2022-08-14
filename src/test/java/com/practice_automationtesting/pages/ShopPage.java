package com.practice_automationtesting.pages;

import com.practice_automationtesting.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
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



    public void productCategories_Mthd(String name) {
        WebElement categorie= Driver.get().findElement(By.xpath("//a[text()='"+name+"']"));
        categorie.click();
    }

    public void selectSorting_Mthd(){
        WebElement sorting=Driver.get().findElement(By.xpath("//select[@class='orderby']"));

        Select orderBy=new Select(sorting);

        String expectedOption = "Default sorting";
        String actualOption = orderBy.getFirstSelectedOption().getText();
        System.out.println("actualOption = " + actualOption);
        assertEquals(actualOption, expectedOption, "verify that default Text is Default sorting");

//        orderBy.selectByVisibleText("Sort by popularity");
//
//        expectedOption = "Sort by popularity";
//        actualOption = orderBy.getFirstSelectedOption().getText();
//        assertEquals(actualOption, expectedOption, "verify that default country is Sort by popularity");

    }
}
