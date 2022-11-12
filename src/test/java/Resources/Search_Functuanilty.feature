@Search
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
    Then user should see page "<details>"
    Examples:
      | search   | details  |
      | files    | Files    |
      | photos   | Photos   |
      | activity | Activity |

    Scenario:
    User can search contacts by clicking on the contacts icon and typing its name











