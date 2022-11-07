package com.Try_Cloud.POM;

import com.Try_Cloud.Utilities.Configuration_Reader;
import com.Try_Cloud.Utilities.Driver;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class US_001 extends LoginPage {

    public US_001() {
        PageFactory.initElements(Driver.getDriver(), this);
    }


    @FindBy(xpath = "//*[@id='user']")
    public WebElement username;

    @FindBy(xpath = "//*[@id='password']")
    public WebElement password;

    @FindBy(xpath = "//*[@class='warning wrongPasswordMsg']")
    public WebElement errorMessage;

    @FindBy(xpath = "//*[@type='submit']")
    public WebElement loginButton;

    @FindBy(xpath = "//*[@class='toggle-password']")
    public WebElement eyeIcon;

    @FindBy(xpath = "//*[@id='lost-password']")
    public WebElement forgotPassword;

    @FindBy(xpath = "//*[@id='reset-password-submit']")
    public WebElement restPasswordButton;



}
