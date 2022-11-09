package com.Try_Cloud.POM;

import com.Try_Cloud.Utilities.BrowserUtils;
import com.Try_Cloud.Utilities.Driver;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.ArrayList;
import java.util.List;

public class Deck_Module_POM {

    public Deck_Module_POM() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//li[@data-id='deck']")
    public WebElement deckModuleIcon;

    @FindBy(xpath = "//span[@title='Add board']")
    public WebElement addBoard;

    @FindBy(xpath = "//input[@placeholder='Board name']")
    public WebElement boardPalaceHolder;

    @FindBy(xpath = "//a[@class='app-navigation-toggle']")
    public WebElement menuExpantButton;

    @FindBy(xpath = "//input[@placeholder='Board name']/../input[@type='submit']")
    public WebElement submitArrowIcon;

    @FindBy(xpath = "//ul[@class='app-navigation-entry__children']/li//button")
    public List<WebElement> createdBoards3Dots;

    @FindBy(xpath = "//ul[@class='app-navigation-entry__children']/li")
    public List<WebElement> createdBoards;

    @FindBy(xpath = "//button[@class='action-button focusable']/span[text()='Delete board']")
    public WebElement deleteButtonBar;

    @FindBy(xpath = "//*[text()='Delete']")
    public WebElement deleteButtonRedIcon;

    @FindBy(xpath = "(//button[@rel='noreferrer noopener'])[1]")
    public WebElement plusIconAddList;

    @FindBy(xpath = "(//input[@placeholder='List name'])[1]")
    public WebElement listNamePlaceHolder;

    @FindBy(xpath = "(//input[@type='submit'])[2]")
    public WebElement listNameSubmitArrowIcon;

    @FindBy(xpath = "//div/h3")
    public List<WebElement> createdListList;

    @FindBy(xpath = "(//h2)[2]")
    public WebElement boardHeaderForLists;

    @FindBy(xpath = "(//div/button[@rel='noreferrer noopener'])[4]")
    public WebElement cardPlusIcon;

    @FindBy(xpath = "//input[@id='new-stack-input-main']")
    public WebElement cardPlaceHolder;

    @FindBy(xpath = "//input[@class='icon-confirm']")
    public WebElement cardArrowIcon;


    @FindBy(xpath = "//div[@class='badges']//div[@class='trigger']")
    public List<WebElement> cards3DotIcon;

    @FindBy(xpath = "//*[text()='Assign to me']")
    public WebElement cardAssignToMe;

    @FindBy(xpath = "//div[@class='avatar-list']//img")
    public WebElement cardAvatarIcon;

    @FindBy(xpath = "//*[text()='Move card']")
    public WebElement moveToCard;

    @FindBy(xpath = "//*[@placeholder='Select a board']")
    public WebElement selectBoard;



    public List<String> boardWebElementToListString() {

        List<String> boardText = new ArrayList<>();

        for (int i = 0; i < createdBoards.size(); i++) {
            boardText.add(createdBoards.get(i).getText());
        }

        return boardText;
    }


    public void createBoardWithClick(String boardName) {
        if (menuExpantButton.getAttribute("aria-expanded").equalsIgnoreCase("false")) {
            menuExpantButton.click();
        }
        addBoard.click();
        boardPalaceHolder.sendKeys(boardName);
        submitArrowIcon.click();
        BrowserUtils.sleep(1);

    }

    public void createListWithClick(String listName) {
        plusIconAddList.click();
        listNamePlaceHolder.sendKeys(listName);
        listNameSubmitArrowIcon.click();
        BrowserUtils.sleep(1);
    }

    public void createListWithEnter(String listName) {
        plusIconAddList.click();
        listNamePlaceHolder.sendKeys(listName, Keys.ENTER);
        BrowserUtils.sleep(1);
    }


    public void createCardWithClick(String cardName) {
        cardPlusIcon.click();
        cardPlaceHolder.sendKeys(cardName);
        cardArrowIcon.click();

    }

    public void createCardWithEnter(String cardName) {
        cardPlusIcon.click();
        cardPlaceHolder.sendKeys(cardName, Keys.ENTER);
    }


}
