
@CLOUD-1505
Feature:
  User Story : US-013 Edit/Enter Profile Settings Functionality (AutomationS4 - FC)
  As a user, I should be able to change profile info settings under the Profile module
  Acceptance Criteria:
1-User can see at least following titles inside personal info under Profile Settings page;
  =>Full name/Email/Phone Number
2-User can change "Full name" info under Profile Settings page
3-User can make "Phone number" info as private under Profile Settings page
4-User cannot pass any characters, except number, into the "Phone Number" inputbox
5-User can see the current local time under the Local dropdown
6-User can make an address on the Address menu
7-User can change a language on the language menu


  Background: User on the try_cloud web page
    Given the user is logged in

  # Given User clicks profile icon
  # Given User clicks on the settings menu
  @CLOUD-1498
  Scenario:US1_1
  1-User can see at least following titles inside personal info under Profile Settings page;
    Given User clicks profile icon
    Given User clicks on the settings menu
    Then user sees Full name or Email or Phone Number

  @CLOUD-1499
  Scenario:US1_2
  2-User can change "Full name" info under Profile Settings page
    Given User clicks profile icon
    Given User clicks on the settings menu
    Then user enters "Employee83" Full name information
  @CLOUD-1500
  Scenario:US1_3
  3-User can make "Phone number" info as private under Profile Settings page
    Given User clicks profile icon
    Given User clicks on the settings menu
    Then user enters "+44 7478 7686 96" Phone number information
    When user clicks to lock button`s arrow
    And user chooses the private button to make Phone number info private
  #  Then user writes password "Employee123" in the authentication required screen

  @CLOUD-1501
  Scenario Outline:US1_4
  4-User cannot pass any characters, except number, into the "Phone Number" inputbox
    Given User clicks profile icon
    Given User clicks on the settings menu
    When user clicks on the Phone Number inputbox
    And user clears his or her phone number
    And user enters "<characters>"  without number
    Then user should not be able to type any "<characters>" except number on the Phone Number inputbox
 #   Then user writes password "Employee123" in the authentication required screen
    Examples:
      | characters      |
      | Employee        |
      | #@{}eee         |
      | ________        |
      | ======          |

  @CLOUD-1502
  Scenario:US1_5
  5-User can see the current local time under the Local dropdown
    Given User clicks profile icon
    Given User clicks on the settings menu
    And sees the current local time under the Local dropdown

  @CLOUD-1503
  Scenario:US1_6
  6-User can make an address on the Address menu
    Given User clicks profile icon
    Given User clicks on the settings menu
    When user clicks on the Address menu
    Then user enters " 25 Queen Street, Birmingham,UK " his or her Address
  #  Then user writes password "Employee123" in the authentication required screen
  @CLOUD-1504
  Scenario:US1_7
  7-User can change a language on the language menu
    Given User clicks profile icon
    Given User clicks on the settings menu
    When user clicks on the language menu
    Then user clicks his or her Turkish language



