package com.practice_automationtesting.pages;

import com.practice_automationtesting.utilities.BrowserUtils;
import com.practice_automationtesting.utilities.Driver;
import static org.junit.Assert.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class Homapage_Page extends BasePage {

    @FindBy(xpath = "//a[text()='Home']")
    public WebElement homeBtn_loc;

    @FindBy(id = "n2-ss-6-arrow-next")
    public WebElement slideRight_loc;

    @FindBy(xpath = "//img[@class='n2-ss-slide-background-image n2-ss-slide-fill n2-ow']")
    public List<WebElement> sliderSize;

    public void slider(int slider) {

        for (int i = 1; i <= slider; i++) {
            slideRight_loc.click();
            BrowserUtils.waitFor(1);
        }
    }

    public String img(String imgName) {

        WebElement img = Driver.get().findElement(By.xpath("//img[@alt='" + imgName + "']"));
        return img.getText();

    }

    public void imgKntl(int img) {

        int actualSlider = sliderSize.size();
        int expectedSlider=img;
        assertEquals(expectedSlider,actualSlider);


    }

}
