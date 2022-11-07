package com.Try_Cloud.Step_Definition.US_002_Steps;

import com.Try_Cloud.POM.LoginPage;
import com.Try_Cloud.POM.US_002;
import com.Try_Cloud.Utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class US2_AC1_TC01 {
    US_002 us_002 = new US_002();


    @Given("the user is logged in")
    public void theUserIsLoggedIn() {
        new LoginPage().logIn();
    }

    @When("Click profile icon")
    public void click_profile_icon() {
        us_002.userProfileIcon.click();
    }

    @When("Click log out button")
    public void click_log_out_button() {
        us_002.logOutButton.click();
    }

    @Then("check user ended up log in page titled {string}")
    public void checkUserEndedUpLogInPageTitled(String pageTitle) {
        Assert.assertEquals(pageTitle, Driver.getDriver().getTitle());
    }

}
