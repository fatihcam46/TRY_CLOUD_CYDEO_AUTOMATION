
Feature: Deleted Files Tab Functionality
  User Story : As a user, I should be able to see all deleted files and delete/restore them permanently under the Deleted Files tab.

  Acceptance Criteria:
  1. User can see the most recent deleted file in the first line of the deleted file list when deleted files are ordered by newest to oldest
  2. User can order the all deleted files by newest to oldest or visa versa
  3. User can order alphabetically all the deleted files based on their names
  4. User can delete any deleted file permanently by using the three dots icon in the file’s line
  5. User can restore any deleted file and see it again under the All Files tab
  6. User can find restored files in their original location under the All Files tab

  Background:
    Given the user is logged in

  Scenario: This scenario is the preliminary step to be able succeed for the remaining scenarios

    When user click Files feature on dashboard
    And user can create several folders name starts with
      | Abc |
      | 123 |

    Then user delete all folders name starts with
      | Abc |
      | 123 |

  Scenario: AC-1 User can see recent deleted file
    When user click Files feature on dashboard
    And user clicks on Deleted files button
    And user should be able to see deleted files page
    And user clicks Deleted button two times to sort files
    Then user can see recently deleted file.

  Scenario: AC-2 User can order all deleted files
    When user click Files feature on dashboard
    And user clicks on Deleted files button
    And user should be able to see deleted files page
    And user should be able to see all deleted files from oldest to newest
    And user clicks Deleted button two times to sort files
    Then user should be able to see all deleted files from newest to oldest


  Scenario: AC-3 User can order alphabetically all the deleted files
    When user click Files feature on dashboard
    And user clicks on Deleted files button
    And user should be able to see deleted files page
    And user should be able to see all deleted files from oldest to newest
    And user click on Name button to sort files alphabetically from Z to A order
    And user click on Name button to sort files alphabetically from A to Z order

  Scenario: AC-4 User can delete any deleted file permanently by using the three dots icon in the file’s line
    When user click Files feature on dashboard
    And user clicks on Deleted files button
    And user should be able to see deleted files page
    And user click first file on the page
    And user click three dots Actions button
    And user click Delete Permanently button
    Then user should be able to see permanently deleted file disappeared

  Scenario: AC-5 User can restore any deleted file and see it again under the All Files tab
    When user click Files feature on dashboard
    And user clicks on Deleted files button
    And user should be able to see deleted files page
    And user click first file on the page
    And user click three dots Actions button
    And user click Restore button
    And user should be able to see restored file disappeared
    And user clicks All Files button
    Then user should be able to see recently restored file is in their original location

  Scenario: AC-6 User can find restored files in their original location under the All Files tab
    When user click Files feature on dashboard
    And user can create several folders name starts with
    | OFY |
    And user can create sub-folder under the same folder
    | OFY-SubFolder |
    And user should be able to see the title of page same as subfolder name
    And user delete subfolder by clicking three dots button
    And user clicks on Deleted files button
    And user should be able to see deleted files page
    And user should be able to see all deleted files from oldest to newest
    And user clicks Deleted button two times to sort files
    And user click first file on the page
    And user click three dots Actions button
    And user click Restore button
    And user should be able to see restored file disappeared
    And user clicks All Files button
    Then user should be able to see recently restored file is in their original location
