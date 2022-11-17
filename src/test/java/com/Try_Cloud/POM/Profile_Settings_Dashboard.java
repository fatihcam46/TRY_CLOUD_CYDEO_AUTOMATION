package com.Try_Cloud.POM;

import com.Try_Cloud.Utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Profile_Settings_Dashboard {

    public Profile_Settings_Dashboard(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//div[@class='avatardiv avatardiv-shown']")
    public WebElement ProfileSettingIcon;

    @FindBy(xpath = "//li[@data-id='settings']")
    public WebElement SettingsButton;

    @FindBy(xpath = "//input[@id='displayname']")
    public WebElement inputFullName;

    @FindBy(xpath = " //span[@class='user-status-menu-item__header']")
    public WebElement profileIconUserName;


}
