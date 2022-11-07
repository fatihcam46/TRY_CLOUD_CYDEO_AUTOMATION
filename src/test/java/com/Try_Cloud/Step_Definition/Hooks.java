package com.Try_Cloud.Step_Definition;

import com.Try_Cloud.Utilities.Driver;
import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;


public class Hooks {

//    @AfterStep
//    void closeDriver(Scenario scenario) {
//        if (scenario.isFailed()) {
//            Driver.closeDriver();
//        }
//    }

    @After
   public void closeDriverafter(Scenario scenario) {

        if (scenario.isFailed()) {

            byte[] screenshot = ((TakesScreenshot) Driver.getDriver()).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenshot, "image/png", scenario.getName());

        }
        System.out.println("Close working");
       Driver.closeDriver();
    }

}
