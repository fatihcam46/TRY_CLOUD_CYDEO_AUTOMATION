package com.Try_Cloud.Step_Definition;

import com.Try_Cloud.POM.Deck_Module_POM;
import com.Try_Cloud.Utilities.BrowserUtils;
import com.Try_Cloud.Utilities.Driver;
import io.cucumber.core.gherkin.Feature;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.util.List;


public class Hooks {

//    @AfterStep
//    void closeDriver(Scenario scenario) {
//        if (scenario.isFailed()) {
//            Driver.closeDriver();
//        }
//    }

    @After(value="not @DeleteCreatedBoards",order = 1)
    public void closeDriverafter(Scenario scenario) {


        if (scenario.isFailed()) {

            byte[] screenshot = ((TakesScreenshot) Driver.getDriver()).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenshot, "image/png", scenario.getName());

        }
        System.out.println("Close working");
        Driver.closeDriver();

    }

    // That is the issue "Ensar"
    @After(value="@DeleteCreatedBoards",order = 2)
    public void deleteBoards(Scenario scenario) {

        if (scenario.isFailed()) {

            byte[] screenshot = ((TakesScreenshot) Driver.getDriver()).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenshot, "image/png", scenario.getName());

        }

        while(true){

            List<WebElement> boards2 = new Deck_Module_POM().createdBoards3Dots;

            boards2.get(boards2.size()-1).click();
            BrowserUtils.sleep(1);
            new Deck_Module_POM().deleteButtonBar.click();
            BrowserUtils.sleep(1);
            new Deck_Module_POM().deleteButtonRedIcon.click();
            Driver.getDriver().navigate().refresh();

            if (boards2.size()==0){
                break;
            }


        }



    }

}
