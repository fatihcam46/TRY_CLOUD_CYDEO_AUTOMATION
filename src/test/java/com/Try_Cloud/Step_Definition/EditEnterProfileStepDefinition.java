package com.Try_Cloud.Step_Definition;

import com.Try_Cloud.POM.EditEnterProfileSettingsPage;
import com.Try_Cloud.Utilities.BrowserUtils;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class EditEnterProfileStepDefinition {

    //US1_1
    EditEnterProfileSettingsPage profile = new EditEnterProfileSettingsPage();

    @Given("User clicks profile icon")
    public void user_clicks_profile_icon() {
        BrowserUtils.waitFor(2);
        profile.profileIconButton.click();
    }

    @Given("User clicks on the settings menu")
    public void user_clicks_on_the_settings_menu() {
        profile.settingsMenu.click();
    }

    @Then("user sees Full name or Email or Phone Number")
    public void user_sees_full_name_or_email_or_phone_number() {
        Boolean fullName = profile.fullName.isDisplayed();
        Boolean email = profile.email.isDisplayed();
        Boolean phoneNumber = profile.phoneNumber.isDisplayed();

        Assert.assertTrue(fullName && email && phoneNumber);
        System.out.println("Assertion working");
    }

    //  US1_2
    @Then("user enters {string} Full name information")
    public void userEntersFullNameInformation(String string) {
        profile.fullName.clear();
        profile.fullName.sendKeys(string);
    }
    //  US1_3
    @Then("user enters {string} Phone number information")
    public void userEntersPhoneNumberInformation(String string) {
        profile.phoneNumber.clear();
        profile.phoneNumber.sendKeys(string);
    }
    @When("user clicks to lock button`s arrow")
    public void userClicksToLockButtonSArrow() {
        profile.lockButton.click();
    }

    @And("user chooses the private button to make Phone number info private")
    public void userChoosesThePrivateButtonToMakePhoneNumberInfoPrivate() {
        profile.privateButton.click();
    }

  //  @Then("user writes password {string} in the authentication required screen")
 //   public void userWritesPasswordInTheAuthenticationRequiredScreen(String string) {
 //       profile.fullName.clear();
 //       profile.fullName.sendKeys(string);
//    }

    //  US1_4
    @When("user clicks on the {string}`s menu")
    public void userClicksOnTheSMenu(String arg0) {
        profile.phoneNumber.click();
    }

    @And("user clears his or her phone number")
    public void userClearsHisHerPhoneNumber() {
        profile.phoneNumber.clear();
    }

    @When("user clicks on the Phone Number inputbox")
    public void userClicksOnThePhoneNumberInputbox() {
    }
    @And("user enters {string}  without number")
    public void userEntersWithoutNumber(String characters) {
        profile.phoneNumber.sendKeys(characters);
        BrowserUtils.waitFor(2);
    }

    @Then("user should not be able to type any {string} except number on the Phone Number inputbox")
    public void userShouldNotBeAbleToTypeAnyExceptNumberOnThePhoneNumberInputbox(String characters) {

        for (int i =0; i<characters.length();i++){
            Assert.assertTrue(Character.isDigit(characters.charAt(i)));
            System.out.println(characters.charAt(i)+" is not a number.");
        }
    }
    //  US1_5

    @And("sees the current local time under the Local dropdown")
    public void seesTheCurrentLocalTimeUnderTheLocalDropdown() {
        BrowserUtils.waitFor(2);
        System.out.println("Local Time : " + profile.localTime.getText());

    }
    //  US1_6
    @When("user clicks on the Address menu")
    public void userClicksOnTheAddressMenu() {
        profile.addressButton.click();
    }

    @Then("user enters {string} his or her Address")
    public void userEntersHisOrHerAddress(String string) {
        profile.addressButton.clear();
        profile.addressButton.sendKeys(string);
        BrowserUtils.waitFor(2);
    }
    //  US1_7
    @When("user clicks on the language menu")
    public void userClicksOnTheLanguageMenu() {
        profile.language.click();
    }
    @Then("user clicks his or her Turkish language")
    public void userClicksHisOrHerTurkishLanguage() {
        profile.languageTurkish.click();
    }



}

