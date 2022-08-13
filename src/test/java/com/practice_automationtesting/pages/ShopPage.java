package com.practice_automationtesting.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ShopPage extends BasePage{

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

//    public void price(double deger){
//
//        WebElement priceLeft= Driver.get().findElement(By.xpath("//span[@style='left: "+deger2+"%;']"));
////        WebElement priceLeft= Driver.get().findElement(By.xpath("//span[@style='left: 0%;']"));
////        Actions move = new Actions(Driver.get());
////        Action action = (Action) move.dragAndDropBy(priceLeft, 150, 450).build();
////        action.perform();
//   }

}
