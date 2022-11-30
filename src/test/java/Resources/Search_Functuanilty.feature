@CLOUD-1458
Feature:
  As a user, I should be able to search file or contact from the Dashboard and
  see the photos under Photos Module

  @CLOUD-1569
  Background: User should be logged in to the dashboard
    Given the user is logged in

  @CLOUD-1570
  Scenario Outline:
  User can search file typing its name through the magnifying glass icon inside
  any Module and see the details side page of the file when clicked on it.
    When user clicks to magnifying search button
    And user types into search box "<search>"
    And user should click on searchresult
    Then user should see file "<details>"
    Examples:
      | search | details      |
      | readme | Readme.md    |
      | group  | group_by.sql |
      | java   | Java         |

  @CLOUD-1571
  Scenario Outline:
  User can search contacts by clicking on the contacts icon and typing its name
    When user clicks on contacts icon
    And user types into contacts search box "<searchcontact>"
    Then user should see searched contact result "<searchedcontact>"
    Examples:
      | searchcontact | searchedcontact |
      | blue          | Blue            |
      | employee13    | Employee13      |

  @CLOUD-1572
  Scenario:
  User can also see the images files under the Photos module when uploaded them.
    When user clicks on files button
    And  user clicks on upload menu button
    And user uploads a picture
    And user clicks to photos button
    Then  user should be able to see uploaded picture

  @CLOUD-1573
  Scenario:
  User can navigate to the Dashboard page whenever clicking the
  TryCloud icon at the top left corner on the page
    When user clicks on Trycloud icon
    Then user should be back to Dashboard page

   @CLOUD-1574
    Scenario:
      User can navigate to the Dashboard page whenever clicking the dashboard button
      When user clicks to photos button
      And user clicks to dashboard button
      Then user should be back to Dashboard page















