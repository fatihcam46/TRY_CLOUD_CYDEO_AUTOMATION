package com.Try_Cloud.Step_Definition;

import com.Try_Cloud.POM.ActivityPage;
import com.Try_Cloud.POM.US_001;
import com.Try_Cloud.Step_Definition.US_001_Steps.US1_AC1_TC01;
import com.Try_Cloud.Utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class login_functionality {

    ActivityPage activityPage = new ActivityPage();

    @When("Click on loginButton")
    public void clickOnLoginButton() {
        activityPage.loginButton.click();
    }


    @Then("user click activity module")
    public void userClickActivityModule() {
        activityPage.ActivityModule.click();
    }

    @When("user on on the {string}")
    public void userOnOnThe(String string) {
        Driver.getDriver().get(string);

    }


    @And("user see all list under activity module")
    public void userSeeAllListUnderActivityModule() {
        System.out.println("user see all list under activity module");
    }


    @Then("user click topContainer")
    public void userClickTopContainer() {
        activityPage.firstContainer.click();
    }

    @And("user click lastContainer")
    public void userClickLastContainer() {
        activityPage.lastContainer.click();
    }

    @And("user see all items list ordered by newest to oldest")
    public void userSeeAllItemsListOrderedByNewestToOldest() {
        System.out.println("user see all items list ordered by newest to oldest");

    }

    @And("user see {string}end of the page")
    public void userSeeEndOfThePage(String string) {
        Assert.assertEquals(string,Driver.getDriver().getTitle());
    }
}
