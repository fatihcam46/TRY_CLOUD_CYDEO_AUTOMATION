package com.Try_Cloud.Step_Definition.US_002_Steps;

import com.Try_Cloud.Utilities.Driver;
import io.cucumber.java.en.When;

public class US2_AC2_TC01 {

    @When("Navigate back")
    public void navigate_back() throws InterruptedException {
        Thread.sleep(2500);
        Driver.getDriver().navigate().back();
    }


}
