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

    @FindBy(xpath = "(//div[@class='federation-menu'])[2]")
    public WebElement iconVisibilityFullName;

    @FindBy(xpath = "//div[@class='federationScopeMenu popovermenu bubble menu menu-center']/ul")
    public WebElement optionVisibilityFullName;

    @FindBy(xpath = "//input[@id='oc-dialog-0-content-input']")
    public WebElement inputAuthentication;

    @FindBy(xpath = "//strong[.='Trusted']")
    public WebElement trustedStatus;

    @FindBy(xpath = "//strong[.='Private']")
    public WebElement privateStatus;

    @FindBy(xpath = "//strong[.='Public']")
    public WebElement publicStatus;

    @FindBy(xpath = "//button[.='Confirm']")
    public WebElement confirmButton;

    @FindBy(xpath = "//p[.='Failed to authenticate, try again']")
    public WebElement msgWarning;

    @FindBy(xpath = "//input[@id='displaynamescope']")
    public WebElement privatestatus;

}
