
Feature: User should be able to use library in good condition

Background:
  Given Open browser go to "url" url
  And User clicks the Login button
  And User enters username and  password
  And User clicks the Sing in button

Scenario: The user should be able to book a book and return it back
  When User clicks Details on the book they should be able to see that the book is available
  And User should be able to click on available to book the book
  And User should see that a book that is taken is not available
  And User should be able to click on return it back and return the book

  Scenario: The user should be able to search the book
    When User clicks on search bar they should click on it
    Then User should be able to search for a book



