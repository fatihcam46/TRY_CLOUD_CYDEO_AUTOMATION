package com.Try_Cloud.Step_Definition.US_014_Steps;

import com.Try_Cloud.POM.Profile_Settings_Dashboard;
import com.Try_Cloud.Utilities.BrowserUtils;
import com.Try_Cloud.Utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class US14_AC1_TC01 {

    Profile_Settings_Dashboard profile_settings_dashboard = new Profile_Settings_Dashboard();
    @When("user click on the profile settings picture")
    public void user_click_on_the_profile_settings_picture() {
       profile_settings_dashboard.ProfileSettingIcon.click();
    }
    @When("user click on the Settings button")
    public void user_click_on_the_settings_button() {
        profile_settings_dashboard.SettingsButton.click();
    }
    @When("user click on the profile settings picture to verify username")
    public void user_click_on_the_profile_settings_picture_to_verify_username() {

        WebDriverWait wait = new WebDriverWait(Driver.getDriver(),5 );
        wait.until(ExpectedConditions.visibilityOf(profile_settings_dashboard.ProfileSettingIcon));
        profile_settings_dashboard.ProfileSettingIcon.click();
    }

    @Then("verify if FullName and username are matching")
    public void verify_if_full_name_and_username_are_matching() {
    String actualFullName=profile_settings_dashboard.inputFullName.getAttribute("value");
    String iconUserName=profile_settings_dashboard.profileIconUserName.getText();


       Assert.assertEquals("Names are not matching",actualFullName,iconUserName);
    }


    }
