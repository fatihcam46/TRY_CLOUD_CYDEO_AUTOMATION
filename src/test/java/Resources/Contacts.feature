@CLOUD-1452

  Feature: CLOUD-1452 Contacts Module Functionality

User Story :
As a user, I should be able to create a new contact and edit/delete any contact under Contacts module .

Acceptance Criteria:
1.	User can create a new contact by clicking on the "New Contact"button.
2.	User can see all the contacts as a list inside the middle column by clicking "All Contacts" button and total number of the contacts near the “All Contacts” tab
3.	User can change the profile picture of any contact by clicking "with a previously uploaded picture by using “Choose from files” option
4.	User can delete any selected contact
5.	User can logout by click on "Employee83" button then can choose "Logout" button .


Background: User on the dashboard
  Given the user is logged in
  When user click on the "Contacts" button

  @CLOUD-1553
    Scenario: User click "Contacts" button and click "New Contact" button can create new account..
      Then user can click "New Contact" button and create a new contact


    @CLOUD-1554
    Scenario: User can click "All Contacts" button can see as a list and total number of the contacts.
      Then "All contacts" title is displayed on the contacts page
      And user can see total numbers of all contacts

    @CLOUD-1555
    Scenario: User can change and add profile picture icon from uploaded file.
        When user click on the profile picture icon
        And user can select a picture from list by clicking on "Choose from file"
        Then  "Pick an avatar" title is displayed on the page
        When select a picture and click on the image
        Then click on "choose" button


    @CLOUD-1556
    Scenario: User can delete any selected contact
      When user click on "three point item" icon at the right top of the page
      Then user can click on "Delete" button and can delete any contact

    @CLOUD-1557
    Scenario: User can logout by click on "Employee83" button then can choose "Logout" button .
      When user click on "Employee83" button
      Then user click on "Logout" button can logout



