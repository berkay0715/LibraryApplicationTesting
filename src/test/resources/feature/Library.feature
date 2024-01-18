Feature: The user should be able to Login to the application
  Scenario: The user should be able to Login to the application

    Given Open browser go to "url" url
    And User clicks the Login button
    And User enters "e-mail" to email adress box and  "password" to password box
    And User clicks the Sing up button
    And User clicks to the Terms of Service and Privacy Policy checkbox
    And User clicks the Create Account button
    And User open the email adress and clicks the "verify my Email"
    And User verifies that Sign in page open "https://app.securityforeveryone.com/sign-in"