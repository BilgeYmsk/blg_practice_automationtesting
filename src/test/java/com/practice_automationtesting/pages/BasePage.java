package com.practice_automationtesting.pages;

import com.practice_automationtesting.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public abstract class BasePage {

    public BasePage(){
        PageFactory.initElements(Driver.get(), this);
        //bu kod blogu findElement sürekli cagirmadan islem yapmamiza olanak tanir ve @FindBy kullanmamizi saglar vede WebElement in calismasini saglar
        //bu sayfadaki element ve methodlari kullanmamiza yariyor.
    }



    @FindBy(xpath = "//a[text()='Shop']")
    public WebElement shopBtn_bsPg;

    @FindBy(xpath = "//img[@title='Automation Practice Site']")
    public WebElement websiteIcon;



    public void navigateToMenu(String menuName) {
        // Shop My Account Test Cases AT Site Demo Site
        WebElement menu =   Driver.get().findElement(By.xpath("//a[text()='"+menuName+"']"));
        menu.click();
    }








}


