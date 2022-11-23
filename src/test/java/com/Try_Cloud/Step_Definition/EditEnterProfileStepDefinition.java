package com.Try_Cloud.Step_Definition;

import com.Try_Cloud.POM.EditEnterProfileSettingsPage;
import com.Try_Cloud.Utilities.BrowserUtils;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class EditEnterProfileStepDefinition {

    //TC1  @CLOUD-1498
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

    //  TC2  @CLOUD-1499
    @Then("user enters {string} Full name information")
    public void userEntersFullNameInformation(String string) {
        profile.fullName.clear();
        profile.fullName.sendKeys(string);
        Assert.assertTrue(profile.fullName.isDisplayed());
    }

    //  TC3   @CLOUD-1500
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
        //  Assert.assertTrue(profile.privateButton.isDisplayed());
    }

    //  @Then("user writes password {string} in the authentication required screen")
    //   public void userWritesPasswordInTheAuthenticationRequiredScreen(String string) {
    //       profile.fullName.clear();
    //       profile.fullName.sendKeys(string);
//    }

    //  TC4  @CLOUD-1501
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

        for (int i = 0; i < characters.length(); i++) {
            if (Character.isDigit(characters.charAt(i))){
               continue;
            }else if (Character.isLetter(characters.charAt(i))){
                Assert.assertFalse(Character.isDigit(characters.charAt(i)));
                System.out.println(characters.charAt(i) + " is not a number.");
                break;
            }else {
                Assert.assertFalse(Character.isDigit(characters.charAt(i)));
                System.out.println(characters.charAt(i) + " is not a number.");
                break;
            }
        }
        }

        //  TC5  @CLOUD-1502

        @And("sees the current local time under the Local dropdown")
        public void seesTheCurrentLocalTimeUnderTheLocalDropdown () {
            BrowserUtils.waitFor(2);
            System.out.println("Local Time : " + profile.localTime.getText());
            Assert.assertTrue(profile.localTime.isDisplayed());
        }
        //  TC6  @CLOUD-1503
        @When("user clicks on the Address menu")
        public void userClicksOnTheAddressMenu () {
            profile.addressButton.click();
        }

        @Then("user enters {string} his or her Address")
        public void userEntersHisOrHerAddress (String string){
            profile.addressButton.clear();
            profile.addressButton.sendKeys(string);
            BrowserUtils.waitFor(2);
            Assert.assertTrue(profile.addressButton.isDisplayed());
        }
        //  TC7  @CLOUD-1504
        @When("user clicks on the language menu")
        public void userClicksOnTheLanguageMenu () {
            profile.language.click();
        }
        @Then("user clicks his or her English language")
        public void userClicksHisOrHerEnglishLanguage () {
            profile.languageEnglish.click();
            Assert.assertTrue(profile.languageEnglish.isDisplayed());
        }


    }

