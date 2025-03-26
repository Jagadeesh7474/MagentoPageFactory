Feature: verifies that user is logged out



Scenario Outline: User logs out and verifies session end
    Given User launches the browser
    And User navigates to the webpage url "https://magento.softwaretestingboard.com/"
    When User clicks on the SignIn link
    And User enters valid '<ValidUsername>' and '<ValidPassword>'
    And User clicks on the Login button
    When User clicks on "Sign Out" from "My Account"
    Then User verifies session ends and the user is redirected to the homepage 
    Then User Close the browser

  Examples:
    | ValidUsername            | ValidPassword      |
    | jagadeesh1@gmail.com      | Qwer@123456!       |