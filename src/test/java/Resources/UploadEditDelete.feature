@CLOUD-1451
  Feature: CLOUD-1451

    User Story :
    As a user, I should be able to upload a file, move or delete any selected file under the Files module

    Acceptance Criteria:
    User can upload a file
    User can create a new folder
    User can move or copy any selected item to any folder and see the item in the selected folder
    User can delete any selected item from its three dots menu
    User can see the total number of files and folders under the files list table
    Delete this line and write your own AC.

Background: User on the dashboard
  Given the user is logged in
@CLOUD-1480
      Scenario: User can upload a file as excel
        When user choose "files" section on dashboard
        Then user click "files"
        And user click "plus" button
        Then user choose "upload file"
       And user choose excel file from computer
       Then user add file under "files"
@CLOUD-1481
  Scenario:User can upload a file2 as jpg
  When user choose "files" section on dashboard
  Then user click "files"
  And user click "plus" button
  Then user choose "upload file"
  And user choose jpg file from computer
  Then user add file under "files"


@CLOUD-1482
    Scenario:User can upload a file3 as png
      When user choose "files" section on dashboard
      Then user click "files"
      And user click "plus" button
      Then user choose "upload file"
      And user choose png file from computer
      Then user add file under "files"

@CLOUD-1483
    Scenario:User can upload a file4 as pptx
      When user choose "files" section on dashboard
      Then user click "files"
      And user click "plus" button
      Then user choose "upload file"
      And user choose pptx file from computer
      Then user add file under "files"

@CLOUD-1484
    Scenario:User can upload a file5 as  MP4
      When user choose "files" section on dashboard
      Then user click "files"
      And user click "plus" button
      Then user choose "upload file"
      And user choose MP4 file from computer
      Then user add file under "files"

@CLOUD-1485
    Scenario:User can upload a file6 as html
      When user choose "files" section on dashboard
      Then user click "files"
      And user click "plus" button
      Then user choose "upload file"
      And user choose html file from computer
      Then user add file under "files"









