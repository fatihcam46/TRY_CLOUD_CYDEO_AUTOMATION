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
    public WebElement plusIconAddCard;

    @FindBy(xpath = "(//input[@placeholder='List name'])[1]")
    public WebElement cardNamePlaceHolder;

    @FindBy(xpath = "(//input[@type='submit'])[2]")
    public WebElement cardNameSubmitArrowIcon;

    @FindBy(xpath = "//div/h3")
    public List<WebElement> createdCardList;

    @FindBy(xpath = "(//h2)[2]")
    public WebElement boardHeaderForCards;


    public List<String> boardWebElementToListString() {

        List<String> boardText = new ArrayList<>();

        for (int i = 0; i < createdBoards.size(); i++) {
            boardText.add(createdBoards.get(i).getText());
        }

        return boardText;
    }

    public void createCardWithClick(String cardName) {
        plusIconAddCard.click();
        cardNamePlaceHolder.sendKeys(cardName);
        cardNameSubmitArrowIcon.click();
        BrowserUtils.sleep(1);
    }
    public void createCardWithEnter(String cardName) {
        plusIconAddCard.click();
        cardNamePlaceHolder.sendKeys(cardName, Keys.ENTER);
        BrowserUtils.sleep(1);
    }

}
