package com.Try_Cloud.Step_Definition.US_001_Steps;

import com.Try_Cloud.POM.US_001;
import io.cucumber.java.en.When;

public class US1_AC4_TC06 {

    US_001 us_001 = new US_001();

    @When("Click eye icon")
    public void click_eye_icon() {
        us_001.eyeIcon.click();
    }

}

