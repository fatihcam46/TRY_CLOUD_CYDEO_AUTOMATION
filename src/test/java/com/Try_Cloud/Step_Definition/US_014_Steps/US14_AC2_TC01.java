package com.Try_Cloud.Step_Definition.US_014_Steps;

import com.Try_Cloud.POM.Profile_Settings_Dashboard;
import com.Try_Cloud.Utilities.BrowserUtils;
import com.Try_Cloud.Utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class US14_AC2_TC01 {

    Profile_Settings_Dashboard profile_settings_dashboard = new Profile_Settings_Dashboard();
    @When("user click on the icon next to Full name")
    public void user_click_on_the_icon_next_to_full_name() {
    profile_settings_dashboard.iconVisibilityFullName.click();
    }
    @When("user check if status options is displayed")
    public void user_check_if_status_options_is_displayed() {
        Driver.getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    profile_settings_dashboard.optionVisibilityFullName.isDisplayed();
    }

    @When("user choose another status and provide the valid password")
    public void user_choose_another_status_and_provide_the_valid_password() {
       try {
           BrowserUtils.waitFor(5);
        profile_settings_dashboard.trustedStatus.click();
        profile_settings_dashboard.publicStatus.click();
       }catch (Exception e){
           WebDriverWait wait = new WebDriverWait(Driver.getDriver(),10);
           wait.until(ExpectedConditions.visibilityOf(profile_settings_dashboard.inputAuthentication));
           profile_settings_dashboard.inputAuthentication.sendKeys("Employee123");
           profile_settings_dashboard.confirmButton.click();
       }
    }
    @Then("verify if user get changed the status successfully")
    public void verify_if_user_get_changed_the_status_successfully() {
        BrowserUtils.waitFor(5);
    Assert.assertTrue("Status did not change",profile_settings_dashboard.publicStatus.isSelected());
    }




}
