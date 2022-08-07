package com.practice_automationtesting.pages;

import com.practice_automationtesting.utilities.ConfigurationReader;
import com.practice_automationtesting.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage{

    @FindBy(id="username")
    public WebElement usernameBtn;

    @FindBy(id = "password")
    public WebElement passwordBtn;

    @FindBy(xpath = "//input[@name='login']")
    public WebElement loginBtn;

    @FindBy(xpath = "//a[text()='Sign out']")
    public WebElement signOutBtn;

    @FindBy(xpath = "//h2[text()='Login']")
    public WebElement loginTextBtn;

    public void login(String menü){

        WebElement login= Driver.get().findElement(By.id(menü));

        if(menü.equalsIgnoreCase("username")){
            login.sendKeys(ConfigurationReader.get("email"));
        }else if(menü.equalsIgnoreCase("password")){
            login.sendKeys(ConfigurationReader.get("password"));
        }
    }




}
