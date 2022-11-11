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

        String filePath="/Users/gokceeksioglu/Desktop/1.xlsx";

        uploadEditDeletePage.Uploadbutton.sendKeys(filePath);
        System.out.println("uploadEditDeletePage.Uploadbutton = " + uploadEditDeletePage.Uploadbutton.isSelected());


    }
    @Then("user add file under {string}")
    public void user_add_file_under(String string) {

    }

    @Then("user choose jpg file from computer")
    public void user_choose_jpg_file_from_computer() {
        String filePath2="/Users/gokceeksioglu/Desktop/HTML class/OlafVlog/olaf image.jpeg";
        uploadEditDeletePage.Uploadbutton.sendKeys(filePath2);

    }

    @Then("user choose png file from computer")
    public void user_choose_png_file_from_computer() {
        String filePath3 = "/Users/gokceeksioglu/Desktop/HTML class/Champion League/Ajax.png";
        uploadEditDeletePage.Uploadbutton.sendKeys(filePath3);

    }
}
