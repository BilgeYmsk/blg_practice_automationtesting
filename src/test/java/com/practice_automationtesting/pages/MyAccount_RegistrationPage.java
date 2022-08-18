package com.practice_automationtesting.pages;

import com.practice_automationtesting.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MyAccount_RegistrationPage extends BasePage {

    @FindBy(xpath = "//input[@id='reg_email']")
    public WebElement EmailBtn_Rgstr;

    @FindBy(xpath = "//input[@id='reg_password']")
    public WebElement PasswordBtn_Rgstr;

    @FindBy(xpath = "//input[@name='register']")
    public WebElement registerBtn;

    @FindBy(xpath = "//div[@id='body']//li[1]")
    public WebElement errorValidEmail;


    @FindBy(xpath = "//*[text()=' Please provide a valid email address.']")
    public WebElement errorEmail;

    public String nameReader(String textEmail){
        WebElement element = Driver.get().findElement(By.xpath("//strong[normalize-space()='"+textEmail+"']"));
        return element.getText();


    }

    public void navigateRegister(String menuName) {

        WebElement menu = Driver.get().findElement(By.xpath("//input[@name='" + menuName + "']"));
        menu.click();

//        WebElement name=Driver.get().findElement(By.xpath("//div[@class='woocommerce-MyAccount-content']//p//strong"));


    }


    public WebElement register(String id){
        return Driver.get().findElement(By.id(id));
    }



}





