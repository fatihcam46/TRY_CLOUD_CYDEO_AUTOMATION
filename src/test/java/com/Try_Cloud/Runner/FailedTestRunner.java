package com.Try_Cloud.Runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(

        glue = "com/Try_Cloud/Step_Definition",
        features = "@target/rerun.txt"


)
public class FailedTestRunner {


}
