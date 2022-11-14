@wip
Feature: TRYCLOUD Calendar Module Functionality
  Agile story: As a user, I should be able to see Daily-Weekly-Monthly calendar view and
  create a new event under the Calendar module


  Background: For the scenarios in the future file, user is expected to be on dashboard
    Given the user is logged in


    Scenario: User can display daily calendar view
      When User click to the calendar module
      And User click to the view section
      And User click to the Day
      Then User should be able to see daily calendar view





    Scenario: User can display weekly calendar view
      When User click to the calendar module
      And User click to the view section
      And User click to the Week
      Then User should be able to see weekly calendar view


    Scenario: User can display monthly calendar view
      When User click to the calendar module
      And User click to the view section
      And User click to the Month
      Then User should be able to see monthly calendar view




    Scenario: User can create a new event under the Calendar module and see it
    on the related day through the Monthly Calendar view
      When User click to the calendar module
      And User click to the New Event button
      And User enter the Event Title "Kubra Birthday"
      And User click to the start date box
      And User choose the start date from calendar
      And User choose the hour from the time list
      And User choose the minute  from the time list
      And User click to anywhere
      And User click to the end date box
      And User choose the end date from calendar
      And User choose the end hour from the time list
      And User choose the end minute from the time list
      #And User choose the AM_PM from the time list
      And User click to the save button
      And User click to the view section
      And User click to the Month
      Then User should be able to see event day on the monthly calendar



  Scenario: User can create new event without Event title
    When User click to the calendar module
    And User click to the New Event button
    And User left the Event Title blank
    And User click to the start date box
    And User choose the start date from calendar
    And User choose the hour from the time list
    And User choose the minute  from the time list
    And User click to anywhere
    And User click to the end date box
    And User choose the end date from calendar
    And User choose the end hour from the time list
    And User choose the end minute from the time list
    And User click to the save button
    And User click to the view section
    And User click to the Month
    Then User should be able to see event day on the monthly calendar without event title



  Scenario: User can create new event all day
    When User click to the calendar module
    And User click to the New Event button
    And User enter the Event Title "Kubra Birthday"
    And User click to All day box
    And User click to the start date box
    And User choose the start date from calendar
    And User click to the save button
    And User click to the view section
    And User click to the Month
    Then User should be able to see event day on the monthly calendar





    Scenario: User can delete any event through the Monthly Calendar view by clicking on the event and
    then using “more” option
      When User click to the calendar module
      And User click to the New Event button
      And User enter the Event Title "Kubra Birthday"
      And User click to All day box
      And User click to the start date box
      And User choose the start date from calendar
      And User click to the save button
      And User click to the view section
      And User click to the Month
      And User click on the event
      And User click to the more button
      And User click to the three dot button
      And User click to the Delete button
      Then User should be able to delete event







  Scenario: Users can add location to their event if they want
    When User click to the calendar module
    And User click to the New Event button
    And User enter the Event Title "Kubra Birthday"
    And User click to All day box
    And User click to the start date box
    And User choose the start date from calendar
    And User click to the more button
    And User enter the location "Glasgow"
    And User click to update button
    And User click on the event
    Then User should be able add the location













