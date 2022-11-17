
Feature: :
  As a user, I should be able to search file or contact from the Dashboard and
  see the photos under Photos Module

  Background: User should be logged in to the dashboard
    Given :User logs in with valid credentials

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


  Scenario Outline:
  User can search contacts by clicking on the contacts icon and typing its name
    When user clicks on contacts icon
    And user types into contacts search box "<searchcontact>"
    Then user should see searched contact result "<searchedcontact>"
    Examples:
      | searchcontact | searchedcontact |
      | blue          | Blue            |
      | employee13    | Employee13      |

  @Search
  Scenario:
    User can also see the images files under the Photos module when uploaded them.
      When user clicks on files button
      And  user clicks on upload menu button
      And user uploads a picture
      And user clicks to photos button
      Then  user should be able to see uploaded picture
















