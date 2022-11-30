package com.Try_Cloud.Step_Definition;

import com.Try_Cloud.POM.Deck_Module_POM;
import com.Try_Cloud.Utilities.BrowserUtils;
import com.Try_Cloud.Utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck_Module_Ensar {

    Deck_Module_POM deck_module_pom = new Deck_Module_POM();
    List<WebElement> board = deck_module_pom.createdBoards;
    List<String> boardText = new ArrayList<>();


    @When("User click on deck module")
    public void user_click_on_deck_module() {
        deck_module_pom.deckModuleIcon.click();
    }

    @When("Click on  add board bar")
    public void click_on_add_board_bar() {

        if (deck_module_pom.menuExpantButton.getAttribute("aria-expanded").equalsIgnoreCase("false")) {
            deck_module_pom.menuExpantButton.click();
        }
        deck_module_pom.addBoard.click();
    }

    @Test
    public void dnm(){
        System.out.println("asdas");
    }

    @When("Write down  {string} in placeholder as board names")
    public void write_down_in_placeholder_as_board_names(String string) {

        deck_module_pom.boardPalaceHolder.sendKeys(string);
    }

    @Then("Press enter on keyboard and verify {string} board name created")
    public void pressEnterOnKeyboardAndVerifyBoardNameCreated(String boardName) {
        deck_module_pom.boardPalaceHolder.sendKeys(Keys.ENTER);
        Driver.getDriver().navigate().refresh();

        for (int i = 0; i < board.size(); i++) {
            boardText.add(board.get(i).getText());
        }

        for (int i = 0; i < boardText.size(); i++) {
            if (!boardText.contains(boardName)) {
                Assert.assertTrue(false);
            }
        }


    }


    @When("Create {string} board")
    public void createBoard(String boardName) {
        deck_module_pom.createBoardWithClick(boardName);
    }


    @Then("Check doesnt have same board name")
    public void checkDoesntHaveSameBoardName() {


        for (int i = 0; i < board.size(); i++) {
            boardText.add(board.get(i).getText());
        }

        for (int i = 0; i < board.size(); i++) {
            Assert.assertEquals("2 same board created", 1, Collections.frequency(boardText, boardText.get(i)));
        }


    }

    @Then("Check nameless board should not be created under board table")
    public void checkNamelessBoardDoesntCreatedUnderBoardTable() {

        Driver.getDriver().navigate().refresh();


        for (int i = 0; i < deck_module_pom.boardWebElementToListString().size(); i++) {

            if (deck_module_pom.boardWebElementToListString().get(i).isBlank()) {
                Assert.assertTrue("White Space Board Name Appears!", false);
            }

        }

    }


    @And("Click on {string} board")
    public void clickOnBoard(String boardName) {

        BrowserUtils.sleep(1);
        List<String> createdBoards = deck_module_pom.boardWebElementToListString();

        for (int i = 0; i < createdBoards.size(); i++) {
            if (boardName.equals(createdBoards.get(i))) {
                deck_module_pom.createdBoards.get(i).click();
                break;
            }
        }

    }

    static List<String> dataTableCardList;

    @When("Create list with click on arrow icon")
    public void listCardWithClickOnArrowIcon(List<String> cardNames) {
        dataTableCardList = cardNames;
        for (int i = 0; i < cardNames.size(); i++) {
            deck_module_pom.createListWithClick(cardNames.get(i));
        }

    }

    @Then("Verify expected lists created under {string} board")
    public void verifyExpectedCardsCreatedUnderBoard(String expectedBoardName) {
        List<String> actualCards = new ArrayList<>();

        for (int i = 0; i < deck_module_pom.createdListList.size(); i++) {
            actualCards.add(deck_module_pom.createdListList.get(i).getText());
        }

        Assert.assertEquals(dataTableCardList, actualCards);
        String actualBoardName = deck_module_pom.boardHeaderForLists.getText();
        Assert.assertEquals(expectedBoardName, actualBoardName);
    }


    @When("Create list with click on press enter")
    public void listCardWithClickOnPressEnter(List<String> cardNames) {
        dataTableCardList = cardNames;
        for (int i = 0; i < cardNames.size(); i++) {
            deck_module_pom.createListWithEnter(cardNames.get(i));
        }
    }

    @Then("Click on arrow icon and verify {string} board name created")
    public void clickOnArrowIconAndVerifyBoardNameCreated(String boardName) {
        deck_module_pom.submitArrowIcon.click();

        Driver.getDriver().navigate().refresh();

        for (int i = 0; i < board.size(); i++) {
            boardText.add(board.get(i).getText());
        }

        for (int i = 0; i < boardText.size(); i++) {
            if (!boardText.contains(boardName)) {
                Assert.assertTrue(false);
            }
        }
    }

    @Then("Create lists")
    public void createLists(List<String> a) {

        for (int i = 0; i < a.size(); i++) {
            BrowserUtils.sleep(1);
            deck_module_pom.createListWithEnter(a.get(i));
        }


    }


    @Then("Create cards with click enter under every list")
    public void createCardsWithClickEnterUnderEveryList(List<String> cardNames) {

        for (int i = 0; i < cardNames.size(); i++) {

            deck_module_pom.createCardWithEnter(cardNames.get(i));

            BrowserUtils.sleep(1);
        }

    }

    @And("Clean deck board")
    public void cleanDeckBoard() {
        BrowserUtils.sleep(2);
        if (deck_module_pom.menuExpantButton.getAttribute("aria-expanded").equalsIgnoreCase("false")) {
            deck_module_pom.menuExpantButton.click();
        }

        while (true) {
            List<WebElement> boards2 = new Deck_Module_POM().createdBoards3Dots;

            if (boards2.size() == 0) {
                break;
            }
            BrowserUtils.sleep(1);
            boards2.get(boards2.size() - 1).click();
            BrowserUtils.sleep(2);
            new Deck_Module_POM().deleteButtonBar.click();
            BrowserUtils.sleep(1);
            new Deck_Module_POM().deleteButtonRedIcon.click();
            Driver.getDriver().navigate().refresh();

            if (boards2.size() == 0) {
                break;
            }


        }

    }


    @Then("Create cards with click click on arrow icon under every list")
    public void createCardsWithClickClickOnArrowIconUnderEveryList(List<String> cardNames) {
        for (int i = 0; i < cardNames.size(); i++) {

            deck_module_pom.createCardWithClick(cardNames.get(i));

            BrowserUtils.sleep(1);
        }
    }

    @Then("Create {string} list")
    public void createList(String listName) {
        deck_module_pom.createListWithClick(listName);
    }

    @When("Create {string} card")
    public void createCard(String arg0) {
        deck_module_pom.createCardWithClick(arg0);
    }

    @And("click on {int} dot icon")
    public void clickOnDotIcon(int arg0) {
        deck_module_pom.cards3DotIcon.get(0).click();
    }

    @When("click on assign to me button")
    public void clickOnAssignToMeButton() {
        deck_module_pom.cardAssignToMe.click();
    }


    @Then("verify profile icon appears in card section")
    public void verifyProfileIconAppearsInCardSection() {
        Assert.assertTrue(deck_module_pom.cardAvatarIcon.isDisplayed());
    }

    @When("click on move to bar")
    public void clickOnMoveToBar() {
        deck_module_pom.moveToCard.click();

    }

    @Then("click on select bar")
    public void clickOnSelectBar() {
        deck_module_pom.selectBoard.click();
        BrowserUtils.sleep(10);
    }

    @When("Created {string} card")
    public void createdCard(String arg0) {
        deck_module_pom.createCardFromSracth(arg0);
    }

    @Then("Verify boards  match with select board list")
    public void verifyBoardsMatchWithSelectBoardList() {
        List<String> boardWebElementToListString = deck_module_pom.boardWebElementToListString();
        List<String> moveBoardsTextStrings = deck_module_pom.moveBoardsTextStrings();
        Collections.sort(boardWebElementToListString);
        Collections.sort(moveBoardsTextStrings);
        Assert.assertEquals(boardWebElementToListString, moveBoardsTextStrings);

    }

    @When("Click on {string}")
    public void clickOn(String arg0) {
        
    }

    @And("Click on Select list")
    public void clickOnSelectList() {
        
    }

    @Then("Click on {string} under list")
    public void clickOnUnderList(String arg0) {
        
    }

    @When("Click on move card button")
    public void clickOnMoveCardButton() {
        
    }

    @Then("Verify expected card moved under expected list")
    public void verifyExpectedCardMovedUnderExpectedList() {
    }

    @Then("Click on tree dot icon")
    public void clickOnTreeDotIcon() {
     deck_module_pom.createdBoards3Dots.get(0).click();
    }

    @And("Click on delete board")
    public void clickOnDeleteBoard() {
        deck_module_pom.deleteButtonBar.click();
    }

    @And("click red delete button")
    public void clickRedDeleteButton() {
        deck_module_pom.deleteButtonRedIcon.click();
    }

    @Then("Verify {string} deleted board disappeared from boards")
    public void verifyDeletedBoardDisappearedFromBoards(String boardName) {
        Assert.assertTrue(deck_module_pom.boardWebElementToListString().contains(boardName));
    }
}
