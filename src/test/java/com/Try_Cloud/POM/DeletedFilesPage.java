package com.Try_Cloud.POM;

import com.Try_Cloud.Utilities.BrowserUtils;
import com.Try_Cloud.Utilities.Driver;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.ArrayList;
import java.util.List;

public class DeletedFilesPage {

    public DeletedFilesPage() {
        PageFactory.initElements(Driver.getDriver(),this);
    }


    @FindBy(xpath = "//*[@id='appmenu']/li[2]")
    public WebElement filesModule;

    @FindBy(xpath = "//*[@class='nav-icon-trashbin svg']")
    public WebElement deletedFilesBtn;

    @FindBy (xpath = "//*[@class='icon icon-add']")
    public WebElement addFilesBtn;

    @FindBy (xpath = "//span[contains(text(),'New folder')]")
    public WebElement addNewFolder;

    @FindBy (xpath = "//input[@id='view13-input-folder']")
    public WebElement fileNameInput;

    @FindBy (xpath = "//input[@class='icon-confirm']")
    public WebElement fileNameInputConfirm;

    @FindBy (xpath = "//*[@for='select_all_files']")
    public WebElement selectAllFilesBox;


    @FindBy (xpath = "//*[@id='app-content-trashbin']")
    public WebElement trashBin;

    @FindBy (xpath = "//span[@class='nametext extra-data']")
    public List<WebElement> deletedFilesAtTrashBin;

    @FindBy(xpath = "//*[@class=' action-delete-container']")
    public WebElement deleteFileBtn;

    @FindBy(xpath = "//body/div[@id='content']/div[@id='app-content']/div[@id='app-content-trashbin']/table[@id='filestable']/tfoot[1]/tr[1]/td[2]")
    public WebElement fileSummary_BottomOfPage_AtDeletedFilesPage;

    @FindBy (xpath = "//body[1]/div[3]/div[2]/div[2]/table[1]/thead[1]/tr[1]/th[2]/div[1]/a[1]")
    public WebElement sortByNameAtAllFilesPage;

    @FindBy(xpath = "//thead/tr[1]/th[4]/a[1]")
    public WebElement sortByDateAtAllFilesPage;

    @FindBy (xpath = "//body[1]/div[3]/div[2]/div[2]/table[1]/thead[1]/tr[1]/th[2]/div[1]/span[1]/a[1]")
    public WebElement actionsBtn;

    @FindBy (xpath = "//*[@class='action action-menu permanent']")
    public WebElement actionsMenuThreeDotBtn;

    @FindBy (xpath = "//*[@class='selection']")
    public WebElement selectFileBoxes;


    @FindBy(xpath = "//body[1]/div[3]/div[2]/div[13]/table[1]/thead[1]/tr[1]/th[2]/div[1]/a[1]")
    public WebElement sortByNameAtTrashBin;

    @FindBy(xpath = "//body[1]/div[3]/div[2]/div[13]/table[1]/thead[1]/tr[1]/th[3]/a[1]")
    public WebElement sortByDateAtTrashBin;

    @FindBy(xpath = "//body[1]/div[3]/div[2]/div[13]/table[1]/tbody[1]/tr[1]/td[2]/a[1]/span[1]")
    public WebElement selectFirstFileAtTrashBin;

    @FindBy(xpath = "//label[@for='select_all_trash']")
    public WebElement selectAllAtTrashBin;

    @FindBy(xpath = "//body[1]/div[3]/div[2]/div[13]/table[1]/tbody[1]/tr[1]/td[2]/a[1]/span[2]/a[1]/span[2]")
    public WebElement restoreBtnForFirstFileAtTrashBin;

    @FindBy(xpath = "//body[1]/div[3]/div[2]/div[13]/table[1]/thead[1]/tr[1]/th[2]/div[1]/span[1]/a[1]/span[2]")
    public WebElement selectedActionsListBtnAtTrashBin;

    @FindBy(xpath = "//*[@class='action action-menu permanent open']")
    public WebElement deletePermanentlyThreeDotBtn;

    @FindBy (xpath = "//body[1]/div[3]/div[2]/div[13]/table[1]/tbody[1]/tr[1]/td[2]/div[1]/ul[1]/li[1]/a[1]/span[2]")
    public WebElement deletePermanentlyBtn;

    @FindBy (xpath = "//a[contains(text(),'All files')]")
    public WebElement allFilesBtn;


    public void createFolderWithClick(String folderName){
        addFilesBtn.click();
        addNewFolder.click();
        fileNameInput.sendKeys(folderName + Keys.ENTER);
        BrowserUtils.sleep(1);

    }

    public void deleteAllFolders(String allFolders ){
        selectFileBoxes.click();
        actionsMenuThreeDotBtn.click();
        deleteFileBtn.click();
        BrowserUtils.sleep(1);

    }

    public List<String> createListOfDeletedFilesAtTrashBin (List<WebElement> list, String deletedFileNames)  {

        List<String> deletedFile = new ArrayList<>();

        for (int i = 0; i < deletedFilesAtTrashBin.size(); i++) {
            BrowserUtils.scrollToElement(fileSummary_BottomOfPage_AtDeletedFilesPage );
            BrowserUtils.sleep(1);

            String deletedFiles = deletedFilesAtTrashBin.get(i).getText();
            System.out.println("deletedFiles = " + deletedFiles);
           deletedFile.add(deletedFilesAtTrashBin.get(i).getText());
        }


        return deletedFile;
    }













}
