Feature: Login with Valid & Invalid Credentials

  Scenario Outline: User attempts to log in with different credentials
    Given User launches the browser
    And User navigates to the webpage url "https://magento.softwaretestingboard.com/"
    When User clicks on the SignIn link
    And User enters  '<invalidUsername>' and '<invalidPassword>'
    And User clicks on the Login button
    Then User verifies '<error>' message displayed under the email textbox
    When User re-enter '<validUsername>' and '<validPassword>'
    And User clicks on the Login button
    Then User verifies thank you '<message>' in the next page
    Then User Close the browser

Examples:
    | invalidUsername | invalidPassword|error| validUsername| validPassword| message  |
    | jagadeesh       | qwer@123455|Please enter a valid email address (Ex: johndoe@domain.com). |jagadeesh1@gmail.com|Qwer@123456!|Home Page|