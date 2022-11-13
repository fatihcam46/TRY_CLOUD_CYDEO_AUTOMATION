@CLOUD-1463
  Feature: Check/Change Profile Settings Functionality
    User Story :

    As a user, I should be able to check or change profile info settings under the Profile module

    Background: For the scenarios in the feature file, user is expected to be on dashboard page
      Given the user is logged in

    @CLOUD-1472
  Scenario: Full name and user name should be the same
    When user click on the profile settings picture
    And user click on the Settings button
    And user click on the profile settings picture to verify username
    Then verify if FullName and username are matching

    @wip
  Scenario: User can change visibility of Full name under Profile Settings page
    When user click on the profile settings picture
    And user click on the Settings button
    And user click on the icon next to Full name
    And user check if status options is displayed
    And user choose another status and provide the valid password
    Then verify if user get changed the status successfully