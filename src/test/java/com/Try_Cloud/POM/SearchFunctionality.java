package com.Try_Cloud.POM;

import com.Try_Cloud.Utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class SearchFunctionality {
    public SearchFunctionality(){
        PageFactory.initElements(Driver.getDriver(),this);
    }


    @FindBy(className = "header-menu__trigger")
    public WebElement searchButton;
    @FindBy(xpath = "//input[@type = 'search']")
    public WebElement searchBox;

    @FindBy(xpath = "//span[@class = 'unified-search__result-content']")
    public WebElement searchResult;

    @FindBy(xpath = "//*[@id=\"app-sidebar-vue\"]/header/div[1]/div[2]/div[2]/h2")
    public WebElement resultText;

    @FindBy(xpath = "//div[@class ='icon-contacts menutoggle']")
    public WebElement contactIcon;
    @FindBy(id = "contactsmenu-search")
    public WebElement contactSearch;

    @FindBy(xpath = "//*[@id=\"contactsmenu-contacts\"]/div/div/div/div[1]")
    public WebElement contactResult;

    @FindBy(xpath = "//*[@id=\"appmenu\"]/li[2]/a")
    public WebElement filesApp;

    @FindBy(xpath="//span[@class='icon icon-add']")
    public WebElement plusButton;

    @FindBy(id="file_upload_start")
    public WebElement uploadButton;

    @FindBy(xpath = "//*[@id=\"appmenu\"]/li[3]/a")
    public WebElement photosApp;

    @FindBy(xpath = "//img[@alt =\"Bug Description.png\"]")
    public WebElement uploadedPhoto;

    @FindBy(className = "oc-dialog-title")
    public WebElement conflictAlert;

    @FindBy(xpath = "//label[@for='checkbox-allnewfiles']")
    public WebElement newFiles;

    @FindBy(className = "continue")
    public WebElement continueButton;

    @FindBy(id = "nextcloud")
    public  WebElement tcicon;

    @FindBy(xpath = "//a[@href = '/index.php/apps/dashboard/']")
    public WebElement dashboardButton;











}
