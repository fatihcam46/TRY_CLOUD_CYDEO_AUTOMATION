@US-001 @CLOUD-1153 @LogIN
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

  Background: User on the try_cloud web page
    Given user on the "https://qa.trycloud.net/index.php/login?clear=1"


  @CLOUD-1205
  Scenario:US1_AC1_TC01
  1-User can login with valid credentials
    When User  enter "Employee83" in user name field
    And enter "Employee123" in password field
    When Click on log in button
    Then Check  title is "Dashboard - Trycloud QA"

  @CLOUD-1206
  Scenario:US1_AC1_TC02
  1-User can login with valid credentials
    When User  enter "Employee83" in user name field
    And enter "Employee123" in password field
    When Press enter
    Then Check  title is "Dashboard - Trycloud QA"

  @CLOUD-1207
  Scenario Outline:US1_AC2_TC03
  2-User can not login with any invalid credentials
  -"Wrong username or password." should be displayed for invalid credentials
    When User  enter "<Username>" in user name field
    And enter "<Password>" in password field
    When Press enter
    Then Check user encounter massage "Wrong username or password."

    Examples:
      | Username    | Password      |
      | Employee83  | employee123   |
      | Employee83  | 123           |
      | Employee83  | Employee      |
      | Employee83  | *Employee123* |
      | employee83  | Employee123   |
      | employee_83 | Employee123   |
      | employee    | Employee123   |
      | 83          | Employee123   |
      | employee83  | employee123   |
      | employee83  | ****          |
      | emee83      | emple123      |

  @CLOUD-1208
  Scenario Outline:US1_AC2_TC04
  2-User can not login with any invalid credentials
  -"Please fill out this field" message should be displayed if the password or username is empty
    When User  enter "<Username>" in user name field
    And enter "<Password>" in password field
    When Press enter
    Then Check user is encounter massage "Please fill out this field." if  "<Username>" or "<Password>"  is empty
    @Adam
    Examples:
      | Username    | Password      |
      |             | 787           |
      |             | employee123   |
      |             | 123           |
      |             | Employee      |
      |             | *Employee123* |
      | employee83  |               |
    @Ensar
    Examples:
      | Username    | Password      |
      | employee_83 |               |
      | employee    |               |
      | 83          |               |
      |             | employee123   |
      |             | ****          |
      |             | emple123      |
      |             |               |
      | 23          | 12            |
      | 23          | 12            |




  @CLOUD-1209
  Scenario:US1_AC3_TC05
  3-User can see the password in a form of dots by default
    Then check type attribute  is  equal  to "password" copied value

  @CLOUD-1210
  Scenario:US1_AC4_TC06
  4-User can see the password explicitly if needed
    When Click eye icon
    Then check type attribute  is  equal  to "text" copied value

  @CLOUD-1211
  Scenario:US1_AC5_TC07
  5-User can see the "Forgot password?" link on the login page and can see the "Reset Password" button on the next page after clicking on forget password link
    When Check Forgot Password link appears
    And Click on Forgot Password link
    Then Check reset password button appears

  @CLOUD-1212
  Scenario:US1_AC6_TC08
  6-User can see valid placeholders on Username and Password fields
    Then Check Username placeholder is "Username or email" and password placeholder is "Password"





