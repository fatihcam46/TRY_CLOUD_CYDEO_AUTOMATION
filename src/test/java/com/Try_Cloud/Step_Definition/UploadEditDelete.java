package com.Try_Cloud.Step_Definition;

import com.Try_Cloud.POM.LoginPage;
import com.Try_Cloud.POM.UploadEditDeletePage;
import com.Try_Cloud.Utilities.BrowserUtils;
import com.Try_Cloud.Utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.interactions.Actions;

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

        String filePath = "/Users/gokceeksioglu/Desktop/1.xlsx";

        uploadEditDeletePage.Uploadbutton.sendKeys(filePath);
        System.out.println("uploadEditDeletePage.Uploadbutton = " + uploadEditDeletePage.Uploadbutton.isSelected());


    }

    @Then("user add file under {string}")
    public void user_add_file_under(String string) {

    }

    @Then("user choose jpg file from computer")
    public void user_choose_jpg_file_from_computer() {
        String filePath2 = "/Users/gokceeksioglu/Desktop/HTML class/OlafVlog/olaf image.jpeg";
        uploadEditDeletePage.Uploadbutton.sendKeys(filePath2);

    }

    @Then("user choose png file from computer")
    public void user_choose_png_file_from_computer() {
        String filePath3 = "/Users/gokceeksioglu/Desktop/HTML class/Champion League/Ajax.png";
        uploadEditDeletePage.Uploadbutton.sendKeys(filePath3);

    }

    @Then("user choose pptx file from computer")
    public void user_choose_pptx_file_from_computer() {
        String filePath4 = "/Users/gokceeksioglu/Desktop/Cydeo/project 3/Project_-_EU9_TryCloud_Sprint-3_Planning.pptx";
        uploadEditDeletePage.Uploadbutton.sendKeys(filePath4);
    }

    @Then("user choose MP4 file from computer")
    public void user_choose_mp4_file_from_computer() {
        String filePath5 = "/Users/gokceeksioglu/Desktop/Cydeo/project 3/Project_Import_Result_IJ_to_JIRA-1.mp4";
        uploadEditDeletePage.Uploadbutton.sendKeys(filePath5);
    }

    @Then("user choose html file from computer")
    public void user_choose_html_file_from_computer() {
        String filePath6 = "/Users/gokceeksioglu/Desktop/Cydeo/java/day1 java/Cybertek School _ Learn.html";
        uploadEditDeletePage.Uploadbutton.sendKeys(filePath6);
    }

    @Then("user choose sql file from computer")
    public void user_choose_sql_file_from_computer() {
        String filePath7 = "/Users/gokceeksioglu/Desktop/Cydeo/SQL/day1/group_by.sql";
        uploadEditDeletePage.Uploadbutton.sendKeys(filePath7);
    }

    @Then("user choose {string} and click on it")
    public void user_choose_and_click_on_it(String string) {



    }

    @Then("user create new name")
    public void user_create_new_name() {
        Actions actions=new Actions(Driver.getDriver());
        actions.sendKeys(uploadEditDeletePage.newFolder,"Gokce's folder").perform();
        uploadEditDeletePage.submitIcon.click();

    }

}
