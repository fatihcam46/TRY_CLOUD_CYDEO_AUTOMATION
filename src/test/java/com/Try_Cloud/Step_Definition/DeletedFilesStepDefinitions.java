package com.Try_Cloud.Step_Definition;

import com.Try_Cloud.POM.DeletedFilesPage;
import com.Try_Cloud.Utilities.BrowserUtils;
import com.Try_Cloud.Utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.ArrayList;
import java.util.List;

public class DeletedFilesStepDefinitions {

    DeletedFilesPage deletedFilesPage = new DeletedFilesPage();

    WebDriverWait wait = new WebDriverWait(Driver.getDriver(),5);

    List<WebElement> deletedFilesAtTrashBin = deletedFilesPage.deletedFilesAtTrashBin;
    Actions actions = new Actions(Driver.getDriver());

    JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();


    @And("user can create several folders name starts with")
    public void user_can_create_several_folders_name_starts_with(List<String>  folderNames) {
        for (int i = 0; i < folderNames.size(); i++) {
            BrowserUtils.sleep(1);
            deletedFilesPage.createFolderWithClick(folderNames.get(i));

            System.out.println("Created Folders = " + folderNames.get(i));
        }
    }
    @Then("user delete all folders name starts with")
    public void user_delete_all_folders_name_starts_with(List<String> deleteFolders) {
        for (int i = 0; i < deleteFolders.size(); i++) {
            BrowserUtils.sleep(2);
            deletedFilesPage.deleteAllFolders(deleteFolders.get(i));
            System.out.println("deleteFolders.size() = " + deleteFolders.size());
            System.out.println("Deleted Folders= " + deleteFolders.get(i));
        }
    }

    @When("user click Files feature on dashboard")
    public void user_click_Files_feature_on_dashboard() {
        deletedFilesPage.filesModule.click();


    }

    @Then("user permanently delete all folders")
    public void user_permanently_delete_all_folders() {

    }
    @When("user clicks on Deleted files button")
    public void user_clicks_on_Deleted_files_button() {
        deletedFilesPage.deletedFilesBtn.click();
    }

    @When("user should be able to see deleted files page")
    public void user_should_be_able_to_see_deleted_files_page(){
        Assert.assertTrue(deletedFilesPage.trashBin.isDisplayed());
    }

    @When("user see all deleted files")
    public void user_see_all_deleted_files () {

    }
    @When("user clicks Deleted button two times to sort files")
    public void user_clicks_Deleted_button_two_times_to_sort_files() {
        actions.doubleClick(deletedFilesPage.sortByDateAtTrashBin).build().perform();
    }
    @Then("user can see recently deleted file.")
    public void user_can_see_recently_deleted_file() {

/*
        for (WebElement each: deletedFilesAtTrashBin ) {
            BrowserUtils.scrollToElement(deletedFilesPage.fileSummary_BottomOfPage_AtDeletedFilesPage );
            BrowserUtils.sleep(2);
            System.out.println("each.getText() = " + each.getText());
        }



        List<String> actualDeletedFiles = BrowserUtils.getElementsText(deletedFilesAtTrashBin);
        System.out.println("actualDeletedFiles.size() = " + actualDeletedFiles.size());


        List<String> expectedDeletedFiles = new ArrayList<>();

        expectedDeletedFiles.add("Denis");
        expectedDeletedFiles.add("1");


        //Assert.assertTrue(actualDeletedFiles.containsAll(expectedDeletedFiles));
 */
    }

    @When("user should be able to see all deleted files from oldest to newest")
    public void user_should_be_able_to_see_all_deleted_files_from_oldest_to_newest() {
        Assert.assertTrue(deletedFilesPage.trashBin.isDisplayed());
    }

    @Then("user should be able to see all deleted files from newest to oldest")
    public void user_should_be_able_to_see_all_deleted_files_from_newest_to_oldest() {

    }

    @When("user click on Name button to sort files alphabetically from Z to A order")
    public void user_click_on_Name_button_to_sort_files_alphabetically_from_Z_to_A_order() {
        deletedFilesPage.sortByNameAtTrashBin.click();

    }
    @When("user click on Name button to sort files alphabetically from A to Z order")
    public void user_click_on_Name_button_to_sort_files_alphabetically_from_A_to_Z_order() {
        deletedFilesPage.sortByNameAtTrashBin.click();
    }

    @When("user click first file on the page")
    public void user_click_first_file_on_the_page() {
        deletedFilesPage.selectFirstFileAtTrashBin.click();
    }

    @When("user click three dots Actions button")
    public void user_click_three_dots_actions_button() {
        deletedFilesPage.actionsMenuThreeDotBtn.click();
    }

    @When("user click Delete Permanently button")
    public void user_click_delete_permanently_button() {
        deletedFilesPage.deletePermanentlyThreeDotBtn.click();
        deletedFilesPage.deletePermanentlyBtn.click();
    }

    @Then("user should be able to see permanently deleted file disappeared")
    public void user_should_be_able_to_see_permanently_deleted_file_disappeared() {

    }

    @When("user click Restore button")
    public void user_click_restore_button() {
        deletedFilesPage.restoreBtnForFirstFileAtTrashBin.click();
    }

    @When("user should be able to see restored file disappeared")
    public void user_should_be_able_to_see_restored_file_disappeared() {

    }

    @When("user clicks All Files button")
    public void user_clicks_all_files_button() {
        deletedFilesPage.allFilesBtn.click();
    }

    @Then("user should be able to see recently restored file is in their original location")
    public void user_should_be_able_to_see_recently_restored_file_is_in_their_original_location() {

    }

    @When("user can create sub-folder under the same folder")
    public void user_can_create_sub_folder_under_the_same_folder(List<String> dataTable) {

    }

    @When("user should be able to see the title of page same as subfolder name")
    public void user_should_be_able_to_see_the_title_of_page_same_as_subfolder_name() {

    }

    @When("user delete subfolder by clicking three dots button")
    public void user_delete_subfolder_by_clicking_three_dots_button() {

    }



}
