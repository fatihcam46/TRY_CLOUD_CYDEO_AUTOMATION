@US-002 @CLOUD-1225
Feature:CLOUD-1154
  US-002 Log out Functionality [AutomationS3-EEZ]

  User Story :

  As a user, I should be able to log out.



  Acceptance Criteria:

  1-User can log out and ends up in login page
  2-User can not go to home page again by clicking step back button after successfully logged out.

  Background: User on the try_cloud web page
    Given user on the "https://qa.trycloud.net/index.php/login?clear=1"
    When User  enter "Employee83" in user name field
    And enter "Employee123" in password field
    Then Click on log in button and end up on dashboard

  @CLOUD-1222
  Scenario:US2_AC1_TC01
  1-User can log out and ends up in login page
    When Click profile icon
    And Click log out button
    Then check user ended up log in page titled "Trycloud QA"
  @CLOUD-1223
  Scenario:US2_AC1_TC02
  1_2- User can log out from any menu page
    When Click  manus by one by
    And Click profile icon
    Then Click log out button
    Then check user ended up log in page titled "Trycloud QA"

  @CLOUD-1224
  Scenario:US2_AC2_TC01
  2-User can not go to home page again by clicking step back button after successfully logged out.
    When Click profile icon
    And Click log out button
    And Navigate back
    Then check user ended up log in page titled "Trycloud QA"
