package com.Try_Cloud.Step_Definition;

import com.Try_Cloud.POM.Deck_Module_POM;
import com.Try_Cloud.Utilities.BrowserUtils;
import com.Try_Cloud.Utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
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

    @Then("Click on arrow icon and verify expected board name created")
    public void clickOnArrowIconAndVerifyExpectedBoardNameCreated() {
        deck_module_pom.submitArrowIcon.click();
    }


    @When("Create {string} board")
    public void createBoard(String string) {
        deck_module_pom.boardPalaceHolder.sendKeys(string, Keys.ENTER);
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

        List<String> createdBoards = deck_module_pom.boardWebElementToListString();

        for (int i = 0; i < createdBoards.size(); i++) {
            if (boardName.equals(createdBoards.get(i))) {
                deck_module_pom.createdBoards.get(i).click();
                break;
            }
        }
        BrowserUtils.sleep(1);
    }

    static List<String> dataTableCardList;

    @When("Create card with click on arrow icon")
    public void createCardWithClickOnArrowIcon(List<String> cardNames) {
        dataTableCardList = cardNames;
        for (int i = 0; i < cardNames.size(); i++) {
            deck_module_pom.createCardWithClick(cardNames.get(i));
        }

    }

    @Then("Verify expected cards created under {string} board")
    public void verifyExpectedCardsCreatedUnderBoard(String expectedBoardName) {
        List<String> actualCards = new ArrayList<>();

        for (int i = 0; i < deck_module_pom.createdCardList.size(); i++) {
            actualCards.add(deck_module_pom.createdCardList.get(i).getText());
        }

        Assert.assertEquals(dataTableCardList, actualCards);
        String actualBoardName = deck_module_pom.boardHeaderForCards.getText();
        Assert.assertEquals(expectedBoardName, actualBoardName);
    }


    @When("Create card with click on press enter")
    public void createCardWithClickOnPressEnter(List<String> cardNames) {
        dataTableCardList = cardNames;
        for (int i = 0; i < cardNames.size(); i++) {
            deck_module_pom.createCardWithEnter(cardNames.get(i));
        }
    }
}
