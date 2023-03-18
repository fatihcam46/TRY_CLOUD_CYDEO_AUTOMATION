
Feature:CLOUD-1153
US_001 Login Functionality [AutomationS3-EEZ]

User Story :
As a user, I should be able to login so that I can land on the dashboard page.

Acceptance Criteria:
1-User can login with valid credentials (either clicking on the "Login button" or hitting the "Enter" key from the keyboard as the last step)
2-User can not login with any invalid credentials
-"Wrong username or password." should be displayed for invalid credentials
-"Please fill out this field" message should be displayed if the password or username is empty
3-User can see the password in a form of dots by default
4-User can see the password explicitly if needed
5-User can see the "Forgot password?" link on the login page and can see the "Reset Password" button on the next page after clicking on forget password link
6-User can see valid placeholders on Username and Password fields

Background: User on the Try_cloud web page
Given User on the "https://qa.trycloud.net/index.php/login?clear=1"

  Scenario:US1_AC1_TC01
  1-User can login with valid credentials
    When User  enters "Employee83" in user name field
    And enters "Employee123" in password field
    When Clicks on log in button
    Then Checks  title is "Dashboard - Trycloud QA"