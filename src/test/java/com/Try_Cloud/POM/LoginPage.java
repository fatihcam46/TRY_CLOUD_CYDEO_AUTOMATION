package com.Try_Cloud.POM;

import com.Try_Cloud.Utilities.Configuration_Reader;
import com.Try_Cloud.Utilities.Driver;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    public LoginPage() {

        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//*[@id='user']")
    public WebElement username;

    @FindBy(xpath = "//*[@id='password']")
    public WebElement password;

    public  void logIn(){
        Driver.getDriver().get(Configuration_Reader.getProperties("url"));
        username.sendKeys(Configuration_Reader.getProperties("username"));
        password.sendKeys(Configuration_Reader.getProperties("password"), Keys.ENTER);
    }


}
