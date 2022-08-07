package com.practice_automationtesting.pages;

import com.practice_automationtesting.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;


public class MyAccountPage extends BasePage{


    public void menu(String list){

        WebElement element = Driver.get().findElement(By.xpath("//a[text()='"+list+"']"));
        element.click();
    }

}
