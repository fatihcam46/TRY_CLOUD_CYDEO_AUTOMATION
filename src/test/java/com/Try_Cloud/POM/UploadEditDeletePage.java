package com.Try_Cloud.POM;

import com.Try_Cloud.Utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UploadEditDeletePage {

    public UploadEditDeletePage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//li[@*='files']")
    public WebElement files;

    @FindBy(xpath="//span[@class='icon icon-add']")
    public WebElement plusButton;

    @FindBy(id="file_upload_start")
    public WebElement Uploadbutton;









}
