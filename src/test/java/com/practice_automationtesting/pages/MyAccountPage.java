package com.practice_automationtesting.pages;

import com.practice_automationtesting.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class MyAccountPage extends BasePage{


    @FindBy(xpath = "//img[@alt='Automation Practice Site']")
    public WebElement homePageReturn_loc;
    public void menu(String list){

        WebElement element = Driver.get().findElement(By.xpath("//a[text()='"+list+"']"));
        element.click();
    }

}
