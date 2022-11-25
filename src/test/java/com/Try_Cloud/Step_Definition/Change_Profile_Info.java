package com.Try_Cloud.Step_Definition;

import com.Try_Cloud.POM.Profile_Settings_Dashboard;
import com.Try_Cloud.Utilities.BrowserUtils;
import com.Try_Cloud.Utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;




public class Change_Profile_Info {

    //AC01
    Profile_Settings_Dashboard profile_settings_dashboard = new Profile_Settings_Dashboard();
    WebDriverWait wait = new WebDriverWait(Driver.getDriver(),8);
    @When("user click on the profile settings picture")
    public void user_click_on_the_profile_settings_picture() {
        profile_settings_dashboard.ProfileSettingIcon.click();
    }
    @When("user click on the Settings button")
    public void user_click_on_the_settings_button() {
        profile_settings_dashboard.SettingsButton.click();
    }
    @When("user click on the profile settings picture to verify username")
    public void user_click_on_the_profile_settings_picture_to_verify_username() {


        wait.until(ExpectedConditions.visibilityOf(profile_settings_dashboard.ProfileSettingIcon));
        profile_settings_dashboard.ProfileSettingIcon.click();
        BrowserUtils.waitFor(5);
    }

    @Then("verify if FullName and username are matching")
    public void verify_if_full_name_and_username_are_matching() {
        String actualFullName=profile_settings_dashboard.inputFullName.getAttribute("value");
        String iconUserName=profile_settings_dashboard.profileIconUserName.getText();


        Assert.assertEquals("Names are not matching",actualFullName,iconUserName);
    }

    //AC02

    @When("user click on the icon next to Full name to check actualStatus")
    public void user_click_on_the_icon_next_to_full_to_check_actualStatus() {

        wait.until(ExpectedConditions.elementToBeClickable(profile_settings_dashboard.iconVisibilityFullName));
        profile_settings_dashboard.iconVisibilityFullName.click();

        String actualStatus= profile_settings_dashboard.statusSelected.getAttribute("value");
        System.out.println("actualStatus = " + actualStatus);
    }
    @When("user choose public status and provide the valid password")
    public void user_choose_public_status_and_provide_the_valid_password() {
        try {
            BrowserUtils.waitFor(5);
            profile_settings_dashboard.publicStatus.click();
            if (profile_settings_dashboard.authenticationRequired.isDisplayed()) {
                try {
                    BrowserUtils.Authentication();
                    System.out.println("Authentication handled in try block ");
                } catch (NoSuchElementException e) {
                    System.out.println("Exception wasn't handled in try block");
                }
            }
        }catch (NoSuchElementException e){
            System.out.println("Exception got executed");
        }



    }

    @Then("refresh the page to verify if status changed successfully")
    public void refresh_the_page_to_verify_if_status_changed_successfully() {
        Driver.getDriver().navigate().refresh();
        BrowserUtils.waitFor(3);
        String selected= profile_settings_dashboard.statusSelected.getAttribute("value");
        System.out.println("selected = " + selected);
        Assert.assertTrue("Status did not change",profile_settings_dashboard.statusSelected.getAttribute("value").contains("public"));
    }

    //TC03

    @When("user click email input box and clear the existing email")
    public void user_click_email_input_box_and_clear_the_existing_email() {
        try {
            wait.until(ExpectedConditions.elementToBeClickable(profile_settings_dashboard.inputBoxEmail));
            profile_settings_dashboard.inputBoxEmail.click();
            //profile_settings_dashboard.inputBoxEmail.sendKeys(Keys.CONTROL,"a",Keys.BACK_SPACE);
            profile_settings_dashboard.inputBoxEmail.clear();
            BrowserUtils.waitFor(5);
            if (profile_settings_dashboard.authenticationRequired.isDisplayed()) {
                try {
                    BrowserUtils.Authentication();
                    System.out.println("Authentication handled in try block ");
                } catch (NoSuchElementException e) {
                    System.out.println("Exception wasn't handled in try block");
                }
            }
        }catch (NoSuchElementException e){
            System.out.println("Exception got executed");
        }




    }


    @When("user write a {string}")
    public void user_write_a(String invalidEmail) {
        try {
            wait.until(ExpectedConditions.visibilityOf(profile_settings_dashboard.inputBoxEmail));
            profile_settings_dashboard.inputBoxEmail.click();
            profile_settings_dashboard.inputBoxEmail.sendKeys(invalidEmail);
            Driver.getDriver().navigate().refresh();
            if (profile_settings_dashboard.authenticationRequired.isDisplayed()) {
                try {
                    BrowserUtils.Authentication();
                    System.out.println("Authentication handled in try block ");
                } catch (NoSuchElementException e) {
                    System.out.println("Exception wasn't handled in try block");
                }
            }
        }catch (NoSuchElementException e){
            System.out.println("Exception got executed");
        }





    }
    @Then("verify if email input box is empty")
    public void verify_if_email_input_box_is_empty() {
        try {
            String msg = profile_settings_dashboard.inputBoxEmail.getAttribute("validationMessage");
            System.out.println(msg);
            Assert.assertTrue(profile_settings_dashboard.inputBoxEmail.getAttribute("validationMessage").contains(msg));

            Assert.assertTrue(profile_settings_dashboard.inputBoxEmail.getAttribute("value").isEmpty());
        }catch (NoSuchElementException e){
            System.out.println("Exception got executed");
        }


    }


    //TC04
    @When("user write a {string} that has an {string},{string} and {string}")
    public void user_write_a_that_has_an_and(String email, String accountName, String domain, String top_level_domain) {
        try {
            wait.until(ExpectedConditions.visibilityOf(profile_settings_dashboard.inputBoxEmail));
            profile_settings_dashboard.inputBoxEmail.click();
            profile_settings_dashboard.inputBoxEmail.sendKeys(accountName, domain, top_level_domain);
            if (profile_settings_dashboard.authenticationRequired.isDisplayed()) {
                try {
                    BrowserUtils.Authentication();
                    System.out.println("Authentication handled in try block ");
                } catch (NoSuchElementException e) {
                    System.out.println("Exception wasn't handled in try block");
                }
            }
            Assert.assertTrue("Email address does not have all the elements", BrowserUtils.CheckEmailCharacters(email));
            BrowserUtils.waitFor(3);
        } catch (NoSuchElementException e) {
            System.out.println("Exception got executed");
        }
    }

    @Then("verify if email input box contains the {string}")
    public void verify_if_email_input_box_contains_the(String email) {


        String valueEmail = profile_settings_dashboard.inputBoxEmail.getAttribute("value");
        Assert.assertTrue("Email input box is not empty",valueEmail.contains(email));

    }

    //TC05
    @When("user click to language placeholder to check the default language")
    public void user_click_to_language_placeholder_to_check_the_default_language() {
        wait.until(ExpectedConditions.elementToBeClickable(profile_settings_dashboard.languageInput));
        Select language = new Select(profile_settings_dashboard.languageInput);
        String defaultLanguage = language.getFirstSelectedOption().getText();
        System.out.println("defaultLanguage = " + defaultLanguage);

    }

    @Then("User chose a different language {string} and verify if is changed successfully")
    public void user_chose_a_different_language_and_verify_if_is_changed_successfully(String idValue) {
       try {
           Select language = new Select(profile_settings_dashboard.languageInput);
           wait.until(ExpectedConditions.elementToBeClickable(profile_settings_dashboard.languageInput)).click();
           language.selectByValue(idValue);

            String chosenLanguage = profile_settings_dashboard.languageInput.getAttribute("value");
           System.out.println("chosenLanguage = " + chosenLanguage);
           Assert.assertTrue("Language did not change",idValue.contains(chosenLanguage));

           if (profile_settings_dashboard.authenticationRequired.isDisplayed()) {
               try {
                   BrowserUtils.Authentication();
                   System.out.println("Authentication handled in try block ");
               } catch (NoSuchElementException e) {
                   System.out.println("Exception wasn't handled in try block");
               }
           }
       }catch (NoSuchElementException e){
           System.out.println("Exception block get executed");
       }

    }

    //TC06
    @When("user click to location placeholder to check the default language")
    public void user_click_to_location_placeholder_to_check_the_default_language() {
        wait.until(ExpectedConditions.elementToBeClickable(profile_settings_dashboard.locationInput));
        Select location = new Select(profile_settings_dashboard.locationInput);
        String defaultLocation = location.getFirstSelectedOption().getText();
        System.out.println(defaultLocation);
    }
    @Then("User chose a different location {string} and verify if is changed successfully")
    public void user_chose_a_different_location_and_verify_if_is_changed_successfully(String locationValue) {
        try {
            Select location = new Select(profile_settings_dashboard.locationInput);
            wait.until(ExpectedConditions.elementToBeClickable(profile_settings_dashboard.locationInput)).click();
            location.selectByValue(locationValue);

            String chosenLocation = profile_settings_dashboard.locationInput.getAttribute("value");
            System.out.println("chosenLocation = " + chosenLocation);
            Assert.assertTrue("Location did not change",locationValue.contains(chosenLocation));


            if (profile_settings_dashboard.authenticationRequired.isDisplayed()) {
                try {
                    BrowserUtils.Authentication();
                    System.out.println("Authentication handled in try block ");
                } catch (NoSuchElementException e) {
                    System.out.println("Exception wasn't handled in try block");
                }
            }
        }catch (NoSuchElementException e){
            System.out.println("Exception block get executed");
        }


    }

    //TC07
    @When("user reset the profile visibility to default settings")
    public void user_reset_the_profile_visibility_to_default_settings() {
        try {
            wait.until(ExpectedConditions.elementToBeClickable(profile_settings_dashboard.iconVisibilityFullName));
            profile_settings_dashboard.iconVisibilityFullName.click();
            profile_settings_dashboard.trustedStatus.click();
            if (profile_settings_dashboard.authenticationRequired.isDisplayed()) {
                try {
                    BrowserUtils.Authentication();
                    System.out.println("Authentication handled in try block ");
                } catch (NoSuchElementException e) {
                    System.out.println("Exception wasn't handled in try block");
                }
            }
        }catch (NoSuchElementException e){
        System.out.println("Exception got executed");
        }
    }

    @When("user reset the email input box to default settings")
    public void user_reset_the_email_input_box_to_default_settings() {
        try {
            wait.until(ExpectedConditions.elementToBeClickable(profile_settings_dashboard.inputBoxEmail)).click();
            profile_settings_dashboard.inputBoxEmail.sendKeys(Keys.CONTROL,"a",Keys.BACK_SPACE);
            BrowserUtils.waitFor(3);


            if (profile_settings_dashboard.authenticationRequired.isDisplayed()) {
                try {
                    BrowserUtils.Authentication();
                    System.out.println("Authentication handled in try block ");
                } catch (NoSuchElementException e) {
                    System.out.println("Exception wasn't handled in try block");
                }
            }
        }catch (NoSuchElementException e){
            System.out.println("Exception got executed");
        }
    }
    @When("user reset the language to default settings")
    public void user_reset_the_language_to_default_settings() {
        try {
            Select location = new Select(profile_settings_dashboard.languageInput);
            wait.until(ExpectedConditions.elementToBeClickable(profile_settings_dashboard.languageInput)).click();
            location.selectByVisibleText("English (US)");
            BrowserUtils.waitFor(3);

            if (profile_settings_dashboard.authenticationRequired.isDisplayed()) {
                try {
                    BrowserUtils.Authentication();
                    System.out.println("Authentication handled in try block ");
                } catch (NoSuchElementException e) {
                    System.out.println("Exception wasn't handled in try block");
                }
            }
        }catch (NoSuchElementException e){
            System.out.println("Exception got executed");
        }

    }
    @Then("user reset the location to default settings")
    public void user_reset_the_location_to_default_settings() {
        try {
            Select location = new Select(profile_settings_dashboard.locationInput);
            wait.until(ExpectedConditions.elementToBeClickable(profile_settings_dashboard.locationInput)).click();
            location.selectByVisibleText("English (United Kingdom)");
            BrowserUtils.waitFor(3);

            if (profile_settings_dashboard.authenticationRequired.isDisplayed()) {
                try {
                    BrowserUtils.Authentication();
                    System.out.println("Authentication handled in try block ");
                } catch (NoSuchElementException e) {
                    System.out.println("Exception wasn't handled in try block");
                }
            }
        }catch (NoSuchElementException e){
            System.out.println("Exception got executed");
        }

    }




}


