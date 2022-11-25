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

    @FindBy(xpath = "//span[@class='icon icon-folder svg']")
    public WebElement newFolder;

    @FindBy(xpath = "//input[@class='icon-confirm']")
    public WebElement submitIcon;

    @FindBy(xpath = "/html/body/div[3]/div[2]/div[2]/table/tbody/tr[7]/td[1]")
    public WebElement checkBox;

    @FindBy(id="selectedActionsList")
    public WebElement actionButton;

    @FindBy(xpath = "//span[@class='label'][1]")
    public WebElement moveOrCopy;

    @FindBy(xpath = "/html/body/div[9]/div[1]/div/table/tbody/tr[3]/td[1]")
    public WebElement selectFolder;

    @FindBy(xpath = "//button[@class='primary']")
    public WebElement moveButton;









}
