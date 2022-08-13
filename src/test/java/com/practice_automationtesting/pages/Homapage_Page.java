package com.practice_automationtesting.pages;

import com.practice_automationtesting.utilities.BrowserUtils;
import com.practice_automationtesting.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class Homapage_Page extends BasePage {

    @FindBy(id = "main-nav")
    public List<WebElement>mainNavi_loc;

    @FindBy(xpath = "//a[text()='Home']")
    public WebElement homeBtn_loc;

    @FindBy(id = "n2-ss-6-arrow-next")
    public WebElement slideRight_loc;

    @FindBy(xpath = "//img[@class='n2-ss-slide-background-image n2-ss-slide-fill n2-ow']")
    public List<WebElement> sliderSize;

    @FindBy(xpath = "//a[text()='Add to basket']")
    public WebElement newArrivals_loc;

    @FindBy(xpath = "//div[@class='themify_builder_sub_row clearfix gutter-default   sub_row_1-0-2'] //div//div//img")
    public List<WebElement> arrivalsSize;

    @FindBy(xpath = "//h3[text()='Selenium Ruby']")
    public WebElement firstElementArrival_loc;

    @FindBy(xpath = "//h3[text()='Thinking in HTML']")
    public WebElement secondElementArrival_loc;

    public void homePageMenu(String name){

        WebElement mainMenu= Driver.get().findElement(By.xpath("//li[*='"+name+"']"));
        mainMenu.click();
    }

    public void slider(int slider) {

        for (int i = 1; i <= slider; i++) {
            slideRight_loc.click();
            BrowserUtils.waitFor(1);
        }
    }

    public void sliderSize_Mtd(int img) {
        int actualSlider = sliderSize.size();
        int expectedSlider=img;
        assertEquals(expectedSlider,actualSlider);

    }

    public void arrivalsSize_Mtd(int arrival) {
        int actualSlider = arrivalsSize.size();
        int expectedSlider=arrival;
        assertEquals(expectedSlider,actualSlider);

    }



}
