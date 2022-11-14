package com.Try_Cloud.Step_Definition.US_001_Steps;

import com.Try_Cloud.POM.US_001;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class US1_AC3_TC05 {

    US_001 us_001 = new US_001();


    @Then("check type attribute  is  equal  to {string} copied value")
    public void checkTypeAttributeIsEqualToCopiedValue(String appearceOfPassword) {
        Assert.assertEquals(appearceOfPassword, us_001.password.getAttribute("type"));
    }

    @When("Click on log in button")
    public void clickOnLogInButton() {
        us_001.loginButton.click();
    }
}
