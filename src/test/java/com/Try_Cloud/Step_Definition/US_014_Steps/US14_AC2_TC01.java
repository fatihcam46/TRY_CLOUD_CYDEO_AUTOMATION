package com.Try_Cloud.Step_Definition.US_014_Steps;

import com.Try_Cloud.POM.Profile_Settings_Dashboard;
import com.Try_Cloud.Utilities.BrowserUtils;
import com.Try_Cloud.Utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class US14_AC2_TC01 {

    Profile_Settings_Dashboard profile_settings_dashboard = new Profile_Settings_Dashboard();
    WebDriverWait wait = new WebDriverWait(Driver.getDriver(),10);

    @When("user click on the icon next to Full name")
    public void user_click_on_the_icon_next_to_full() {

        wait.until(ExpectedConditions.elementToBeClickable(profile_settings_dashboard.iconVisibilityFullName));
        profile_settings_dashboard.iconVisibilityFullName.click();

    }
    @When("user choose public status and provide the valid password")
    public void user_choose_public_status_and_provide_the_valid_password() {
        try {
            BrowserUtils.waitFor(5);
            profile_settings_dashboard.publicStatus.click();
        }catch (Exception e){
            wait.until(ExpectedConditions.visibilityOf(profile_settings_dashboard.inputAuthentication));
            profile_settings_dashboard.inputAuthentication.sendKeys("Employee123");
            profile_settings_dashboard.confirmButton.click();
        }

    }

    @Then("refresh the page to see if status changed successfully")
    public void refresh_the_page_to_see_if_status_changed_successfully() {
        Driver.getDriver().navigate().refresh();
        BrowserUtils.waitFor(5);

    }

    @Then("replace back the default status")
    public void replace_back_the_default_status() {
       profile_settings_dashboard.iconVisibilityFullName.click();
       BrowserUtils.waitFor(5);
       profile_settings_dashboard.trustedStatus.click();
    }





}
