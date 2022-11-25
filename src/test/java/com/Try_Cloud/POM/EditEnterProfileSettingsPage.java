package com.Try_Cloud.POM;

import com.Try_Cloud.Utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EditEnterProfileSettingsPage {
    public EditEnterProfileSettingsPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//*[@id=\"expand\"]/div[1]/img")
    public WebElement profileIconButton;

    @FindBy(xpath = "//*[@id=\"expanddiv\"]/ul/li[2]/a")
    public WebElement settingsMenu;

    @FindBy(xpath = "//*[@id=\"displayname\"]")
    public WebElement fullName;

    @FindBy(xpath = "//*[@id=\"email\"]")
    public WebElement email;

    @FindBy(xpath = "//*[@id=\"phone\"]")
    public WebElement phoneNumber;

    @FindBy(xpath = "//*[@id=\"phoneform\"]/h3/div/span/span")
    public WebElement lockButton;

    @FindBy(xpath = "//*[@id=\"phoneform\"]/h3/div/div/ul/li[1]/a/p")
    public WebElement privateButton;

    @FindBy(xpath = "//*[@id=\"address\"]")
    public WebElement addressButton;

    @FindBy(xpath = "//*[@id=\"localeexample\"]/p[1]")
    public WebElement localTime;

    @FindBy(xpath = "//*[@id=\"languageinput\"]")
    public WebElement language;

    @FindBy(xpath = "//*[@id=\"localeinput\"]/option[1]")
    public WebElement languageEnglish;


}

