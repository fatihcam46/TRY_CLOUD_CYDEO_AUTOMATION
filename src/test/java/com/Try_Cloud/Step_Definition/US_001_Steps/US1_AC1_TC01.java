package com.Try_Cloud.Step_Definition.US_001_Steps;

import com.Try_Cloud.POM.US_001;
import com.Try_Cloud.Utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class US1_AC1_TC01 {

    US_001 us_001 = new US_001();
    @Then("Click on log in button and end up on dashboard")
    public void click_on_log_in_button() {
        us_001.loginButton.click();
    }
    @Then("Check  title is {string}")
    public void check_title_is(String string) {
        Assert.assertEquals(string, Driver.getDriver().getTitle());
    }

}
