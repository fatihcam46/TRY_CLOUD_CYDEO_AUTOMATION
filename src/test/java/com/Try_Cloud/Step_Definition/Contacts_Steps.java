package com.Try_Cloud.Step_Definition;

import com.Try_Cloud.POM.ContactsPage;
import com.Try_Cloud.Utilities.BrowserUtils;
import com.Try_Cloud.Utilities.Configuration_Reader;
import com.Try_Cloud.Utilities.Driver;
import com.google.common.base.Equivalence;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.w3c.dom.html.HTMLInputElement;

import java.util.List;

public class Contacts_Steps {

    ContactsPage contactsPage = new ContactsPage();

    @Given("user on the https://qa.trycloud.net/index.php/apps/dashboard/")
    public void user_on_the_https_qa_tryCloud_net_index_php_apps_dashboard() {

        String url = Configuration_Reader.getProperties("url");
        Driver.getDriver().get(url);
        contactsPage.contacts.click();

        }


    @Then("user can see all contacts as a list and their total numbers")
    public void user_can_see_all_contacts_as_a_list_and_their_total_numbers() {
        System.out.println("All contacts total");

    }

    @When("user click on the profile picture icon")
    public void user_click_on_the_profile_picture_icon() {
        contactsPage.profilePictureIcon.click();

    }


    @When("user can select a picture from list by clicking on {string}")
    public void user_can_select_a_picture_from_list_by_clicking_on(String string) {
        BrowserUtils.waitFor(5);
        BrowserUtils.waitForClickablility(contactsPage.chooseFromFileButton,20);
        contactsPage.chooseFromFileButton.click();


    }
    @When("select a picture and click on the image")
   public void select_a_picture_and_click_on_the_image() {
        contactsPage.ajaxProfilePicture.click();


    }
    @Then("click on {string} button")
    public void click_on_button(String string) {
        contactsPage.chooseButton.click();

    }

    @Then("user click on {string} button can logout")
    public void user_click_on_button_can_logout(String logOut) {
        contactsPage.logoutButton.click();

    }

    @Then("user can click {string} button and create a new contact")
    public void userCanClickButtonAndCreateANewContact(String newContacts) {
        contactsPage.newContact.click();
    }

    List<WebElement> contactList;
    @When("user click on {string} icon at the right top of the page")
    public void userClickOnIconAtTheRightTopOfThePage(String threePointItem) {
        contactList=contactsPage.listOfContacts;
        if(contactList.size()>1){
            contactList.get(1).click();
            BrowserUtils.waitFor(5);
            contactsPage.threePointItem.click();

        }

    }

    @Then("user can click on {string} button and can delete any contact")
    public void userCanClickOnButtonAndCanDeleteAnyContact(String delete) {
        if(contactList.size()>1){
            BrowserUtils.waitForClickablility(contactsPage.deleteButton,10);
            contactsPage.deleteButton.click();

        }
    }
    @Then("user click on the Contacts button")
    public void userClickOnTheContactsButton() {
        BrowserUtils.waitFor(2);
        contactsPage.contacts.click();
    }

        @When("user click on {string} button")
    public void userClickOnButton(String arg0) {
        contactsPage.profileSettingsButton.click();
    }

    @Then("{string} title is displayed on the contacts page")
    public void titleIsDisplayedOnTheContactsPage(String expectedTitle) {
        String actualTitle=contactsPage.allContactsTitle.getText();
        System.out.println(actualTitle);
        Assert.assertEquals(expectedTitle,actualTitle);
    }


    @And("user can see total numbers of all contacts")
    public void userCanSeeTotalNumbersOfAllContacts() {
        int numberOfAllContacts= Integer.parseInt(contactsPage.allContactsTotal.getText());
        System.out.println(numberOfAllContacts);
        Assert.assertTrue(numberOfAllContacts>0);
    }

    @Then("{string} title is displayed on the page")
    public void titleIsDisplayedOnThePage(String expectedTitle) {
        Assert.assertEquals(expectedTitle,contactsPage.pickAnAvatarTitle.getText());

    }


}