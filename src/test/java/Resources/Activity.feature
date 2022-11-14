Feature:

  Background: User on the try_cloud web page
    Given user on the "https://qa.trycloud.net/index.php/login?clear=1"
    When User  enter "Employee83" in user name field
    And enter "Employee123" in password field
    When Click on loginButton
    Then user on on the "https://qa.trycloud.net/index.php/apps/dashboard/"
    When user click activity module

  Scenario:
    And user see all list under activity module

@wip
Scenario:
  Then user click topContainer
  And user click lastContainer
  And user see all items list ordered by newest to oldest

  Scenario:
    And user see "No more events to load"end of the page