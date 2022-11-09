Feature:
  As a user, I should be able to manage my works by creating a new board/list/card and modifying them under Deck Module.

  **

  Acceptance Criteria

  1- User can create a new board
  2- User can create a new list of card/task under any board
  3- User can add a new card/task on any list on the current board
  4- User can assign any card/task to himself/herself by using the three dots on the related card
  5- User can move any card on the current board to any other list of other board
  6- Delete this line and write your own AC.

  Background:
    Given the user is logged in
    When User click on deck module

  @DeleteCreatedBoards
  Scenario Outline: US4_AC01_TC01
  AC01_TC01-User can create a new board with any letter trough enter functionality

    And Click on  add board bar
    Then Write down  "<Board names>" in placeholder as board names
    When Press enter on keyboard and verify "<Board names>" board name created
    Examples:
      | Board names  |
      | Ensar Folder |
      | Ensar123     |
#      | *Ensar*      |
#      | 1234         |
#      | ____**___    |

  @DeleteCreatedBoards
  Scenario Outline:US4_AC01_TC02
  AC01_TC02-User can create a new board with any letter trough arrow  functionality

    And Click on  add board bar
    When Write down  "<Board names>" in placeholder as board names
    Then Click on arrow icon and verify expected board name created
    Examples:
      | Board names  |
      | Ensar Folder |
      | Ensar123     |
#      | *Ensar*      |
#      | 1234         |
#      | ____**___    |


  @DeleteCreatedBoards
  Scenario:US4_AC01_TC03
  AC01_TC03-User can not create a new board with same name

    And Click on  add board bar
    When Create "School" board
    And Click on  add board bar
    When Create "School" board
    Then Check doesnt have same board name

  @DeleteCreatedBoards
  Scenario:US4_AC01_TC04
  AC01_TC04-User can not create a new board with white space

    And Click on  add board bar
    When Create "    " board
    Then Check nameless board should not be created under board table

  @DeleteCreatedBoards @wip
  Scenario:US4_AC02_TC01
  AC02_TC01 User can create a new list of card/task under any board with click arrow
    And Click on  add board bar
    When Create "School" board
    And Click on "School" board
    When Create card with click on arrow icon
      | Ensar  |
      | Ensar2 |
      | Ensar3 |
      | Ensar4 |
      | Ensar5 |
    Then Verify expected cards created under "School" board

  @DeleteCreatedBoards @wip
  Scenario:US4_AC02_TC02
  AC02_TC02 User can create a new list of card/task under any board with press enter
    And Click on  add board bar
    When Create "School" board
    And Click on "School" board
    When Create card with click on press enter
      | Ensar  |
      | Ensar2 |
      | Ensar3 |
      | Ensar4 |
      | Ensar5 |
    Then Verify expected cards created under "School" board
