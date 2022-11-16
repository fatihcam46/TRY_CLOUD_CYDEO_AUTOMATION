package com.Try_Cloud.Step_Definition;

import com.Try_Cloud.POM.CalendarModulePage;
import com.Try_Cloud.Utilities.BrowserUtils;
import com.Try_Cloud.Utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.assertj.core.api.Assertions;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Wait;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class CalendarModuleStepDef {

    CalendarModulePage calendarModulePage = new CalendarModulePage();
    @When("User click to the calendar module")
    public void user_click_to_the_calendar_module() {
        calendarModulePage.calendarModule.click();

    }
    @When("User click to the view section")
    public void user_click_to_the_view_section() {
        BrowserUtils.waitForClickablility(calendarModulePage.viewSection,10);
        calendarModulePage.viewSection.click();


    }
    @When("User click to the Day")
    public void user_click_to_the_day() {
        calendarModulePage.dayButton.click();

    }
    @Then("User should be able to see daily calendar view")
    public void user_should_be_able_to_see_daily_calendar_view() {

        Assert.assertTrue(calendarModulePage.isDisplay.isDisplayed());

    }


    @When("User click to the Week")
    public void user_click_to_the_week() {

        calendarModulePage.weekButton.click();

    }
    @Then("User should be able to see weekly calendar view")
    public void user_should_be_able_to_see_weekly_calendar_view() {
        Assert.assertTrue(calendarModulePage.weekDisplayed.isDisplayed());

    }


    @When("User click to the Month")
    public void user_click_to_the_month() {
        BrowserUtils.waitForClickablility(calendarModulePage.monthButton,10);
        calendarModulePage.monthButton.click();

    }
    @Then("User should be able to see monthly calendar view")
    public void user_should_be_able_to_see_monthly_calendar_view() {

        Assert.assertTrue(calendarModulePage.monthDisplayed.isDisplayed());

    }


    @When("User click to the New Event button")
    public void user_click_to_the_new_event_button() {
        calendarModulePage.newEvent.click();

    }
    @When("User enter the Event Title {string}")
    public void user_enter_the_event_title(String string) {
        calendarModulePage.eventTitle.sendKeys(string);



    }


    @When("User click to the start date box")
    public void user_click_to_the_start_date_box() throws InterruptedException {
        Driver.getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        calendarModulePage.blankStartDate.click();

    }

    @When("User choose the start date from calendar")
    public void user_choose_the_start_date_from_calendar() throws InterruptedException {
        //Driver.getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        BrowserUtils.waitForClickablility(calendarModulePage.startDate,10);
        calendarModulePage.startDate.click();
        //System.out.println();

      }

    @When("User choose the hour from the time list")
    public void user_choose_the_hour_from_the_time_list() {
        calendarModulePage.startTime.click();

    }
    @When("User choose the minute  from the time list")
    public void user_choose_the_minute_from_the_time_list() {
        calendarModulePage.startTime1.click();

    }
    @When("User click to anywhere")
    public void user_click_to_anywhere() {
        calendarModulePage.clickAnywhere.click();

    }

    @When("User click to the end date box")
    public void user_click_to_the_end_date_box() throws InterruptedException {
        Thread.sleep(4000);
        BrowserUtils.waitForClickablility(calendarModulePage.blankEndDate,10);
        calendarModulePage.blankEndDate.click();
    }
    @When("User choose the end date from calendar")
    public void user_choose_the_end_date_from_calendar() {
        BrowserUtils.waitForClickablility(calendarModulePage.endDate,10);
        WebElement and = Driver.getDriver().findElement(By.xpath("//tr[@class='mx-date-row'][3]/td[3]/div"));
        calendarModulePage.endDate.click();

    }

    @When("User choose the end hour from the time list")
    public void user_choose_the_end_hour_from_the_time_list() {
        BrowserUtils.waitForClickablility(calendarModulePage.endTime,10);
        calendarModulePage.endTime.click();

    }
    @When("User choose the end minute from the time list")
    public void user_choose_the_end_minute_from_the_time_list() {
        BrowserUtils.waitForClickablility(calendarModulePage.endTime1,10);
        calendarModulePage.endTime1.click();

    }
    @When("User choose the AM_PM from the time list")
    public void user_choose_the_am_pm_from_the_time_list() {
        BrowserUtils.waitForClickablility(calendarModulePage.anPm,10);
        calendarModulePage.anPm.click();

    }

    @When("User click to the save button")
    public void user_click_to_the_save_button() {
        BrowserUtils.waitForClickablility(calendarModulePage.saveButton,10);
        calendarModulePage.saveButton.click();


    }
    @Then("User should be able to see event day on the monthly calendar")
    public void user_should_be_able_to_see_event_day_on_the_monthly_calendar() {
        BrowserUtils.waitForVisibility(calendarModulePage.eventViewMonthly,10);
        Assert.assertTrue(calendarModulePage.eventViewMonthly.isDisplayed());

    }

    @When("User left the Event Title blank")
    public void user_left_the_event_title_blank() {
        calendarModulePage.eventTitle.sendKeys("");

    }

    @Then("User should be able to see event day on the monthly calendar without event title")
    public void user_should_be_able_to_see_event_day_on_the_monthly_calendar_without_event_title() {
        BrowserUtils.waitForVisibility(calendarModulePage.untitledEvent,10);
        Assert.assertTrue(calendarModulePage.untitledEvent.isDisplayed());





    }

    @When("User click to All day box")
    public void user_click_to_all_day_box() {
        calendarModulePage.allDay.click();

    }

    @When("User click on the event through the monthly calendar view")
    public void user_click_on_the_event_through_the_monthly_calendar_view() {


    }

    @When("User click on the event")
    public void user_click_on_the_event() {
        BrowserUtils.waitForClickablility(calendarModulePage.clickEvent,10);
        calendarModulePage.clickEvent.click();

    }
    @When("User click to the more button")
    public void user_click_to_the_more_button() {
        BrowserUtils.waitForClickablility(calendarModulePage.eventMoreButton,10);
        calendarModulePage.eventMoreButton.click();

    }
    @When("User click to the three dot button")
    public void user_click_to_the_three_dot_button() {
        BrowserUtils.waitForClickablility(calendarModulePage.threeDots,10);
        calendarModulePage.threeDots.click();

    }
    @When("User click to the Delete button")
    public void user_click_to_the_delete_button() {
        BrowserUtils.waitForClickablility(calendarModulePage.deleteButton,10);
        calendarModulePage.deleteButton.click();

    }
    @Then("User should be able to delete event")
    public void user_should_be_able_to_delete_event() {
       // BrowserUtils.waitForVisibility(calendarModulePage.deletedEvent,10);
        Assert.assertTrue(calendarModulePage.clickEvent.isEnabled());


    }



    @When("User enter the location {string}")
    public void user_enter_the_location(String string) {

        calendarModulePage.addLocation.sendKeys(string);

    }

    @When("User click to update button")
    public void user_click_to_update_button() {
        BrowserUtils.waitForClickablility(calendarModulePage.locationSaveButton,10);
        calendarModulePage.locationSaveButton.click();

    }

    @Then("User should be able add the location")
    public void user_should_be_able_add_the_location() {


        Assert.assertTrue(calendarModulePage.locationBox.isDisplayed());


    }









}
