package com.Try_Cloud.Step_Definition.US_001_Steps;


import com.Try_Cloud.POM.US_001;
import com.Try_Cloud.Utilities.Driver;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.assertj.core.api.SoftAssertions;
import org.junit.Assert;
import org.openqa.selenium.Keys;

import javax.xml.crypto.Data;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class US1_AC2_TC03 {





    US_001 us_001 = new US_001();
    SoftAssertions softAssertions = new SoftAssertions();

    @Given("user on the {string}")
    public void user_go_to(String string) {
        Driver.getDriver().get(string);
    }

    @When("User  enter {string} in user name field")
    public void user_enter_in_user_name_field(String string) {
        us_001.username.sendKeys(string);

    }

    @When("enter {string} in password field")
    public void enter_in_password_filed(String string) {
        us_001.password.sendKeys(string);
        System.out.println("Working");
    }

    @When("Press enter")
    public void press_enter() {

        System.out.println("Working");
        us_001.password.sendKeys(Keys.ENTER);
    }

    @Then("Check user encounter massage {string}")
    public void check_user_encounter_massage(String string) {
        System.out.println("Working");
//        try {
            Assert.assertTrue(us_001.errorMessage.getText().equals(string));
//        } catch (Exception e) {
//            softAssertions.assertThat(false).isTrue();
//            softAssertions.assertAll();
//        }


    }
}
