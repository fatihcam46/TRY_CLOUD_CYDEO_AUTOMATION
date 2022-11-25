
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

  @CLOUD-1546
  Scenario: User can change visibility of Full name under Profile Settings page
    When user click on the profile settings picture
    And user click on the Settings button
    And user click on the icon next to Full name to check actualStatus
    And user choose public status and provide the valid password
    Then refresh the page to verify if status changed successfully

  @CLOUD-1564
  Scenario Outline: User enter a invalid e-mail to Email input box
    When user click on the profile settings picture
    And user click on the Settings button
    And user click email input box and clear the existing email
    And user write a "<invalid email>"
    Then verify if email input box is empty
    Examples:
        | invalid email  |
        | @wrong.outlook |
        | abcd.yahoo.us  |
        | example1.@.pl  |

  @CLOUD-1565
  Scenario Outline: User can enter a proper e-mail to Email input box
    When user click on the profile settings picture
    And user click on the Settings button
    And user click email input box and clear the existing email
    And user write a "<proper email address>" that has an "<accountName>","<domain>" and "<top-level domain>"
    Then verify if email input box contains the "<proper email address>"
  Examples:
    | proper email address    | accountName  | domain     | top-level domain |
    | example@gmail.com       | example      | @gmail     | .com             |
    | abc@google.uk           | abc          | @google    | .uk              |
    | something234@yahoo.ro   | something234 | @yahoo     | .ro              |
    | 2222@333.444            | 2222         | @333       | .444             |
    | andrian@dailymail.co.uk | andrian      | @dailymail | .co.uk           |


    @CLOUD-1566
    Scenario Outline: User can change Language
    When user click on the profile settings picture
    And user click on the Settings button
    And user click to language placeholder to check the default language
    Then User chose a different language "<value>" and verify if is changed successfully
  Examples:
      | value |
      | fr    |
      | da    |
      | ro    |

  @CLOUD-1567
  Scenario Outline: User can change Local settings
    When user click on the profile settings picture
    And user click on the Settings button
    And user click to location placeholder to check the default language
    Then User chose a different location "<value>" and verify if is changed successfully
  Examples:
      | value |
      | bg_BG |
      | it_SM |
      | es_MX |

  @CLOUD-1568
  Scenario: User can restore all default settings
    When user click on the profile settings picture
    And user click on the Settings button
    And user reset the profile visibility to default settings
    And user reset the email input box to default settings
    And user reset the language to default settings
    Then user reset the location to default settings
