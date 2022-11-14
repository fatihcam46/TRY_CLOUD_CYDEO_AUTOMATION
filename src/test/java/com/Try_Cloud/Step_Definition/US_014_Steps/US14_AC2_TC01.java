package com.Try_Cloud.Step_Definition.US_014_Steps;

import com.Try_Cloud.POM.Profile_Settings_Dashboard;
import com.Try_Cloud.Utilities.BrowserUtils;
import com.Try_Cloud.Utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class US14_AC2_TC01 {

    Profile_Settings_Dashboard profile_settings_dashboard = new Profile_Settings_Dashboard();
    WebDriverWait wait = new WebDriverWait(Driver.getDriver(),10);

    @When("user click on the icon next to Full name and check status options are displayed")
    public void user_click_on_the_icon_next_to_full_name_and_check_status_options_are_displayed() {
        BrowserUtils.waitFor(5);
        try {
            wait.until(ExpectedConditions.elementToBeClickable(profile_settings_dashboard.iconVisibilityFullName));
            profile_settings_dashboard.iconVisibilityFullName.click();
        }catch (Exception NoSuchElementException){
            Assert.assertTrue(profile_settings_dashboard.optionVisibilityFullName.isDisplayed());
        }
    }

    @When("user choose another status and provide the valid password")
    public void user_choose_another_status_and_provide_the_valid_password() {
       try {
           profile_settings_dashboard.privateStatus.click();

       }catch (Exception e){

           wait.until(ExpectedConditions.visibilityOf(profile_settings_dashboard.inputAuthentication));
           profile_settings_dashboard.inputAuthentication.sendKeys("Employee123");
           profile_settings_dashboard.confirmButton.click();
       }

    }
    @Then("verify if user changed the status successfully")
    public void verify_if_user_changed_the_status_successfully() {

//        String actualStatus = profile_settings_dashboard.trustedStatus.getText();
//        String expectedStatus = profile_settings_dashboard.privateStatus.getAttribute("strong");
//        System.out.println("expectedStatus = " + expectedStatus);
//        System.out.println("actualStatus = " + actualStatus);
//
//        Assert.assertEquals(expectedStatus,actualStatus);

        Assert.assertTrue("Status did not change",profile_settings_dashboard.privateStatus.isSelected());

    }




}
