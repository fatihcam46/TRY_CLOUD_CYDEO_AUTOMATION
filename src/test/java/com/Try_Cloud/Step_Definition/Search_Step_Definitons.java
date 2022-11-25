package com.Try_Cloud.Step_Definition;

import com.Try_Cloud.POM.Dashboard;
import com.Try_Cloud.POM.LoginPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.assertj.core.api.Assertions;
import org.junit.Assert;

public class Search_Step_Definitons {
    LoginPage loginPage = new LoginPage();
    Dashboard dashboard = new Dashboard();

    @Given(":User logs in with valid credentials")
    public void userLogsInWithValidCredentials() {
        loginPage.logIn();
    }

    @When("user clicks to magnifying search button")
    public void userClicksToMagnifyingSearchButton() {
        dashboard.searchButton.click();
    }


    @And("user types into search box {string}")
    public void userTypesIntoSearchBox(String search) {
        dashboard.searchBox.sendKeys(search);
    }

    @Then("user should see page {string}")
    public void userShouldSeePage(String details) {
        Assert.assertEquals(dashboard.searchResult.getText(),details);
    }
}


