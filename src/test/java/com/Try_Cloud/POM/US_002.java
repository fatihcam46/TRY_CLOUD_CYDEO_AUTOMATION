package com.Try_Cloud.POM;

import com.Try_Cloud.Utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class US_002 {

    public US_002() {
        PageFactory.initElements(Driver.getDriver(), this);
    }


    @FindBy(xpath = "//*[@class='avatardiv avatardiv-shown']")
    public WebElement userProfileIcon;

    @FindBy(xpath = "//*[@data-id='logout']")
    public WebElement logOutButton;

    @FindBy(xpath = "//ul[@id]/li[@data-id]")
    public List<WebElement> upMenuButtons;

}
