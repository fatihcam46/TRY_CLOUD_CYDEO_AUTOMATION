package com.Try_Cloud.POM;

import com.Try_Cloud.Utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Dashboard {
    public Dashboard(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(className = "header-menu__trigger")
    public WebElement searchButton;
}
