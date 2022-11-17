package com.Try_Cloud.Step_Definition;

import com.Try_Cloud.POM.Dashboard;
import com.Try_Cloud.POM.LoginPage;
import com.Try_Cloud.Utilities.BrowserUtils;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.assertj.core.api.Assertions;
import org.junit.Assert;
import org.openqa.selenium.support.ui.Select;

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



    @And("user should click on searchresult")
    public void userShouldClickOnSearchresult() {
        dashboard.searchResult.click();
        BrowserUtils.waitFor(3);
    }

    @Then("user should see file {string}")
    public void userShouldSeeFile(String details) {
        System.out.println("dashboard.resultText.getText() = " + dashboard.resultText.getText());
        BrowserUtils.waitFor(1);
        Assert.assertTrue(dashboard.resultText.getText().contains(details));
    }

    @When("user clicks on contacts icon")
    public void userClicksOnContactsIcon() {
        dashboard.contactIcon.click();
    }

    @And("user types into contacts search box {string}")
    public void userTypesIntoContactsSearchBox(String searchContacts) {
        dashboard.contactSearch.sendKeys(searchContacts);
        BrowserUtils.waitFor(2);

    }

    @Then("user should see searched contact result {string}")
    public void userShouldSeeSearchedContactResult(String searchedContact) {

        System.out.println(dashboard.contactResult.getText());
        Assert.assertTrue(dashboard.contactResult.getText().contains(searchedContact));
    }

    @When("user clicks on files button")
    public void userClicksOnFilesButton() {
        dashboard.filesApp.click();
    }

    @And("user clicks on upload menu button")
    public void userClicksOnUploadMenuButton() {
       dashboard.plusButton.click();
       BrowserUtils.sleep(3);


    }

    @And("user uploads a picture")
    public void userUploadsAPicture() {
        BrowserUtils.sleep(4);
        String path = "C:\\Users\\yeknu\\Desktop\\Software\\Bug Description.png";
        dashboard.uploadButton.sendKeys(path);
        BrowserUtils.sleep(4);
        if (dashboard.conflictAlert.isDisplayed()){
            dashboard.newFiles.click();
            dashboard.continueButton.click();
        }
        BrowserUtils.sleep(4);
    }

    @And("user clicks to photos button")
    public void userClicksToPhotosButton() {
        dashboard.photosApp.click();
    }

    @Then("user should be able to see uploaded picture")
    public void userShouldBeAbleToSeeUploadedPicture() {
        System.out.println("dashboard.uploadedPhoto.isDisplayed() = " + dashboard.uploadedPhoto.isDisplayed());
    }
}


