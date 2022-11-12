package com.Try_Cloud.Runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

// My loved code (git push origin HEAD --force) & (git reset --hard HEAD~1) ctrl shift and r
// clean install -e Goals in jenkins
@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {
                "json:target/cucumber.json",
                "html:target/cucumber-report.html",
                "rerun:target/rerun.txt",
                "me.jvt.cucumber.report.PrettyReports:target/cucumber"
        },
        glue = "com/Try_Cloud/Step_Definition",
        features = "src/test/java/Resources",
        dryRun = false,
        tags = "@CLOUD-1208"

)
public class CukesRunner {

}
