@DeckMod
Feature:
  As a user, I should be able to manage my works by creating a new board/list/card and modifying them under Deck Module.

  **

  Acceptance Criteria

  +1- User can create a new board
  +2- User can create a new list of card/task under any board
  +3- User can add a new card/task on any list on the current board
  +4- User can assign any card/task to himself/herself by using the three dots on the related card
  +5- User can move any card on the current board to any other list of other board
  6- Delete this line and write your own AC.

  Background:
    Given the user is logged in
    When User click on deck module
    And Clean deck board

  @positive
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

  @positive
  Scenario Outline:US4_AC01_TC02
  AC01_TC02-User can create a new board with any letter trough arrow  functionality

    And Click on  add board bar
    When Write down  "<Board names>" in placeholder as board names
    Then Click on arrow icon and verify "<Board names>" board name created
    Examples:
      | Board names  |
      | Ensar Folder |
      | Ensar123     |
#      | *Ensar*      |
#      | 1234         |
#      | ____**___    |


  @positive
  Scenario:US4_AC01_TC03
  AC01_TC03-User can not create a new board with same name

    And Click on  add board bar
    When Create "School" board
    And Click on  add board bar
    When Create "School" board
    Then Check doesnt have same board name

  @positive
  Scenario:US4_AC01_TC04
  AC01_TC04-User can not create a new board with white space

    And Click on  add board bar
    When Create "    " board
    Then Check nameless board should not be created under board table

  @positive
  Scenario:US4_AC02_TC01
  AC02_TC01 User can create a new list of card/task under any board with click arrow
    When Create "School" board
    And Click on "School" board
    When Create list with click on arrow icon
      | List-1    |
      | List-1 _2 |
      | *List*    |
      | 123       |
      | -*-       |
      | list      |

    Then Verify expected lists created under "School" board

  @positive
  Scenario:US4_AC02_TC02
  AC02_TC02 User can create a new list of card/task under any board with press enter
    When Create "School" board
    And Click on "School" board
    When Create list with click on press enter
      | List-1    |
      | List-1 _2 |
      | *List*    |
      | 123       |
      | -*-       |
      | list      |
    Then Verify expected lists created under "School" board

  @positive @wip
  Scenario:US4_AC03_TC01
  AC03_TC01 User can add a new card/task on any list on the current board
    When Create "School" board
    And Click on "School" board
    Then Create lists
      | List-1    |
      | List-1 _2 |
      | *List*    |
      | 123       |
      | -*-       |
      | list      |

    Then Create cards with click enter under every list
      | Card-1 |
      | *Card* |
      | _11_   |
      | card   |
      | 223    |
      | CARD   |
      | ""     |

  @positive
  Scenario:US4_AC03_TC02
  AC03_TC02 User can add a new card/task on any list on the current board
    When Create "School" board
    And Click on "School" board
    Then Create lists
      | List-1    |
      | List-1 _2 |
      | *List*    |
      | 123       |
      | -*-       |
      | list      |

    Then Create cards with click click on arrow icon under every list
      | Card-1 |
      | *Card* |
      | _11_   |
      | card   |
      | 223    |
      | CARD   |
      | ""     |


  @positive
  Scenario:US4_AC04_TC01
  AC04_TC01 User can assign any card/task to himself/herself by using the three dots on the related card
    When Create "School" board
    And Click on "School" board
    Then Create "List-1" list
    When Create "Card_1" card
    And click on 3 dot icon
    When click on assign to me button
    Then verify profile icon appears in card section

  @positive
  Scenario:US4_AC05_TC01
  AC05_TC01 User can move any card on the current board to any other list of other board
    When Create "School" board
    And Click on "School" board
    Then Create "List-1" list
    When Create "Card_1" card
    When Create "Student" board
    And Click on "Student" board
    Then Create "Student-List-1" list
    When Create "Student_Card_1" card
    And click on 3 dot icon
    When click on move to bar
    Then click on select bar






