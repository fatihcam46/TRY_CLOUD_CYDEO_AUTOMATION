package com.Try_Cloud.POM;

import com.Try_Cloud.Utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CalendarModulePage {
    public CalendarModulePage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }


    @FindBy(xpath = "//ul[@id='appmenu']/li[9]")
    public WebElement calendarModule;


    @FindBy(xpath = "//button[@class='button primary new-event']")
    public WebElement newEvent;

    @FindBy(xpath = "//span[@class='action-button__icon icon-view-day']")
    public WebElement dayButton;

    @FindBy(xpath = "//span[@class='action-button__icon icon-view-week']")
    public WebElement weekButton;

    @FindBy(xpath = "//span[.='Month']")
    public WebElement monthButton;

    @FindBy(xpath = "//input[@placeholder='Event title']")
    public WebElement eventTitle;


    @FindBy(xpath = "//*[@class='mx-datepicker'][1]")
    public WebElement blankStartDate;

    @FindBy(xpath = "//td[@class='cell today active']")
    //table[@class='mx-table mx-table-date']/tbody/tr[2]/td[2]
    public WebElement startDate;

    @FindBy(xpath = "//ul[@data-type='hour']/li[12]")
    public WebElement startTime;

    @FindBy(xpath = "//ul[@data-type='minute']/li[4]")
    public WebElement startTime1;

    @FindBy(xpath = "//tr[@class='mx-date-row'][3]/td[3]/div")
    public WebElement endDate;

    @FindBy(xpath = "//ul[@data-type='hour']/li[12]")
    public WebElement endTime;

    @FindBy(xpath = "//ul[@data-type='minute']/li[4]")
    public WebElement endTime1;

    @FindBy(xpath = "//ul[@data-type='ampm']/li[1]")
    public WebElement anPm;

    @FindBy(xpath = "//*[@for='allDay']")
    public WebElement allDay;


    @FindBy(xpath = "//div[@class='event-popover__buttons']/button[1]")
    public WebElement eventMoreButton;

    @FindBy(xpath = "//div[@class='event-popover__buttons']/button[2]")
    public WebElement eventSaveButton;

    @FindBy(xpath = "//textarea[@placeholder='Add a location']")
    public WebElement addLocation;

    @FindBy(xpath = "//div[@class='action-item app-sidebar-header__menu']")
    public WebElement threeDots;

    @FindBy(xpath = "//span[.='Delete']")
    public WebElement deleteButton;

    @FindBy(xpath = "//div[@class='fc-event-title']")
    public WebElement eventOnTheMonthly;

    @FindBy(xpath = "//button[@class='icon action-item__menutoggle icon-view-module']")
    public WebElement viewSection;


    @FindBy(xpath = "//a[@class='fc-col-header-cell-cushion ']")
    public WebElement isDisplay;

    @FindBy(xpath = "//button[@class='datepicker-button-section__datepicker-label button datepicker-label']")
    public WebElement weekDisplayed;

    @FindBy(xpath = "//button[@class='datepicker-button-section__datepicker-label button datepicker-label']")
    public WebElement monthDisplayed;


    @FindBy(xpath = "//*[@id=\"tab-app-sidebar-tab-details\"]/div[2]/button")
    public WebElement locationSaveButton;


    @FindBy(xpath = "//div[@class='event-popover__buttons']/button[2]")
    public WebElement saveButton;


    @FindBy(xpath = "//*[@class='fc-event-title-container']")
    public WebElement clickEvent;


    @FindBy(xpath = "//*[@class='mx-datepicker'][2]")
    public WebElement blankEndDate;

    @FindBy(xpath = "//div[@class='illustration-header']")
    public WebElement clickAnywhere;

    @FindBy(xpath = "//div[.='Kubra Birthday']")
    public WebElement eventViewMonthly;

    @FindBy(xpath = "//div[@class='fc-event-main-frame']/div[2]/div")
    public WebElement untitledEvent;

    @FindBy(xpath = "//*[@class='fc-daygrid-day fc-day fc-day-mon fc-day-today ']")
    public WebElement deletedEvent;


    @FindBy(xpath = "//div[@class='fc-daygrid-event-harness'][1]")
    public WebElement locationBox;


}
