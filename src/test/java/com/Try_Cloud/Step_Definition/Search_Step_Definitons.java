package com.Try_Cloud.Step_Definition;

import com.Try_Cloud.POM.SearchFunctionality;
import com.Try_Cloud.POM.LoginPage;
import com.Try_Cloud.Utilities.BrowserUtils;
import com.Try_Cloud.Utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class Search_Step_Definitons {
    LoginPage loginPage = new LoginPage();
    SearchFunctionality searchFunctionality = new SearchFunctionality();

    @Given("the user is logged in")
    public void theUserIsLoggedIn() {
        new LoginPage().logIn();
    }

    @When("user clicks to magnifying search button")
    public void userClicksToMagnifyingSearchButton() {
        searchFunctionality.searchButton.click();
    }


    @And("user types into search box {string}")
    public void userTypesIntoSearchBox(String search) {
        searchFunctionality.searchBox.sendKeys(search);
    }



    @And("user should click on searchresult")
    public void userShouldClickOnSearchresult() {
        searchFunctionality.searchResult.click();
        BrowserUtils.waitFor(3);
    }

    @Then("user should see file {string}")
    public void userShouldSeeFile(String details) {
        System.out.println("dashboard.resultText.getText() = " + searchFunctionality.resultText.getText());
        BrowserUtils.waitFor(1);
        Assert.assertTrue(searchFunctionality.resultText.getText().contains(details));
    }

    @When("user clicks on contacts icon")
    public void userClicksOnContactsIcon() {
        searchFunctionality.contactIcon.click();
    }

    @And("user types into contacts search box {string}")
    public void userTypesIntoContactsSearchBox(String searchContacts) {
        searchFunctionality.contactSearch.sendKeys(searchContacts);
        BrowserUtils.waitFor(2);

    }

    @Then("user should see searched contact result {string}")
    public void userShouldSeeSearchedContactResult(String searchedContact) {

        System.out.println(searchFunctionality.contactResult.getText());
        Assert.assertTrue(searchFunctionality.contactResult.getText().contains(searchedContact));
    }

    @When("user clicks on files button")
    public void userClicksOnFilesButton() {
        searchFunctionality.filesApp.click();
    }

    @And("user clicks on upload menu button")
    public void userClicksOnUploadMenuButton() {
       searchFunctionality.plusButton.click();
       BrowserUtils.sleep(3);


    }

    @And("user uploads a picture")
    public void userUploadsAPicture() {
        BrowserUtils.sleep(4);
        String path = "C:\\Users\\yeknu\\Desktop\\Software\\Bug Description.png";
        searchFunctionality.uploadButton.sendKeys(path);
        BrowserUtils.sleep(4);
        if (searchFunctionality.conflictAlert.isDisplayed()){
            searchFunctionality.newFiles.click();
            searchFunctionality.continueButton.click();
        }
        BrowserUtils.sleep(4);
    }

    @And("user clicks to photos button")
    public void userClicksToPhotosButton() {
        searchFunctionality.photosApp.click();
    }

    @Then("user should be able to see uploaded picture")
    public void userShouldBeAbleToSeeUploadedPicture() {
        System.out.println("dashboard.uploadedPhoto.isDisplayed() = " +
                searchFunctionality.uploadedPhoto.isDisplayed());
    }

    @When("user clicks on Trycloud icon")
    public void userClicksOnTrycloudIcon() {
        searchFunctionality.tcicon.click();
    }

    @Then("user should be back to Dashboard page")
    public void userShouldBeBackToDashboardPage() {
        Driver.getDriver().getTitle().contains("dashboard");
    }

    @And("user clicks to dashboard button")
    public void userClicksToDashboardButton() {
        searchFunctionality.dashboardButton.click();
    }
}


