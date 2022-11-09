package com.Try_Cloud.POM;

import com.Try_Cloud.Utilities.Driver;
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

    @FindBy(xpath = "(//*[@class='action-button focusable'])[6]")
    public WebElement deleteButtonBar;

    @FindBy(xpath = "//*[text()='Delete']")
    public WebElement deleteButtonRedIcon;


    public  List<String> boardWebElementToListString(){
        List<String> boardText = new ArrayList<>();

        for (int i = 0; i < createdBoards.size(); i++) {
            boardText.add(createdBoards.get(i).getText());
        }

        return boardText;
    }




}
