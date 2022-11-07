package com.Try_Cloud.Step_Definition.US_001_Steps;

import com.Try_Cloud.POM.US_001;
import io.cucumber.java.en.Then;
import org.junit.Assert;

public class US1_AC6_TC08 {

    US_001 us_001 = new US_001();

    @Then("Check Username placeholder is {string} and password placeholder is {string}")
    public void check_username_placeholder_is_and_password_placeholder_is(String username_placeholder, String password_placeholder) {

        Assert.assertEquals(username_placeholder, us_001.username.getAttribute("placeholder"));
        Assert.assertEquals(password_placeholder, us_001.password.getAttribute("placeholder"));
        System.out.println("username_placeholder = " + username_placeholder);
        System.out.println("password_placeholder = " + password_placeholder);
    }

}
