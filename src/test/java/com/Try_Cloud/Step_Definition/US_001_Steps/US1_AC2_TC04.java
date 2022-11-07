package com.Try_Cloud.Step_Definition.US_001_Steps;

import com.Try_Cloud.POM.US_001;
import io.cucumber.java.en.Then;
import org.assertj.core.api.SoftAssertions;
import org.junit.Assert;

public class US1_AC2_TC04 {

    US_001 us_001 = new US_001();
    String usernameMessage = "";
    String passwordMessage = "";

    SoftAssertions softAssertions = new SoftAssertions();

    @Then("Check user is encounter massage {string} if  {string} or {string}  is empty")
    public void check_user_is_encounter_massage_if_or_is_empty(String message, String username, String password) throws InterruptedException {

        if (username.isBlank()) {
            usernameMessage = us_001.username.getAttribute("validationMessage");
            Assert.assertEquals(usernameMessage,message);
            Thread.sleep(8000);
        }

        if (password.isBlank()) {
            passwordMessage = us_001.password.getAttribute("validationMessage");
            Assert.assertEquals(passwordMessage,message);
        }



    }


}
