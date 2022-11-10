package com.Try_Cloud.Step_Definition;

import com.Try_Cloud.POM.LoginPage;
import com.Try_Cloud.POM.UploadEditDeletePage;
import com.Try_Cloud.Utilities.BrowserUtils;
import com.Try_Cloud.Utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class UploadEditDelete {

    UploadEditDeletePage uploadEditDeletePage = new UploadEditDeletePage();

    @Given("the user is logged in")
    public void theUserIsLoggedIn() {
        new LoginPage().logIn();
    }


    @When("user choose {string} section on dashboard")
    public void user_choose_section_on_dashboard(String string) {
        uploadEditDeletePage.files.click();


    }
    @Then("user click {string}")
    public void user_click(String string) {

    }
    @Then("user click {string} button")
    public void user_click_button(String string) {
     uploadEditDeletePage.plusButton.click();

    }
    @Then("user choose {string}")
    public void user_choose(String string) {

        BrowserUtils.sleep(3);
        //uploadEditDeletePage.Uploadbutton.click();
    }
    @Then("user choose excel file from computer")
    public void user_choose_excel_file_from_computer() {
        BrowserUtils.sleep(4);

        String abc=System.getProperty("1.xlsx");
        System.out.println("abc = " + abc);

        //String FilesPath="\\Desktop\\1.xlsx";

        uploadEditDeletePage.Uploadbutton.sendKeys(abc+"\\File\\");
        System.out.println("uploadEditDeletePage.Uploadbutton = " + uploadEditDeletePage.Uploadbutton.isSelected());


    }
    @Then("user add file under {string}")
    public void user_add_file_under(String string) {

    }

    @Then("user choose file from computer")
    public void user_choose_file_from_computer() {

    }
}
