package com.Try_Cloud.Step_Definition.US_001_Steps;

import com.Try_Cloud.POM.US_001;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class US1_AC5_TC07 {

    US_001 us_001 = new US_001();

    @When("Check Forgot Password link appears")
    public void check_forgot_password_link_appears() {
        Assert.assertTrue(us_001.forgotPassword.isDisplayed());
    }

    @When("Click on Forgot Password link")
    public void click_on_forgot_password_link() {
        us_001.forgotPassword.click();
    }

    @Then("Check reset password button appears")
    public void check_reset_password_button_appears() throws InterruptedException {
        Thread.sleep(2000);
        Assert.assertTrue(us_001.restPasswordButton.isDisplayed());
    }

}
