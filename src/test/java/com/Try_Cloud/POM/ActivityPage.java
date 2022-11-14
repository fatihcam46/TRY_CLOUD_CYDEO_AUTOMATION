package com.Try_Cloud.POM;

import com.Try_Cloud.Utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ActivityPage {

  public ActivityPage(){PageFactory.initElements(Driver.getDriver(),this);}

@FindBy(xpath = "//*[@id=\"submit-form\"]")
public WebElement loginButton;


     @FindBy(xpath ="//*[@id=\"appmenu\"]/li[4]/a")
    public WebElement ActivityModule;

     @FindBy(xpath = "//*[@id=\"no_more_activities\"]")
    public WebElement NoMoreActivity;

   @FindBy(xpath ="//*[@id=\"container\"]/div[1]/div[2]/div/span")
    public WebElement firstContainer;

   @FindBy(xpath ="//*[@id=\"container\"]/div[1]/div[6]/div/span")
    public WebElement lastContainer;

}
