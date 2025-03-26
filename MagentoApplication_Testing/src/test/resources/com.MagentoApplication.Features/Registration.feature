Feature: Checking User Registration

  Scenario Outline: To check the Creating New customer account page with valid and invalid data
    Given User launches the browser
    And User navigates to the webpage url "https://magento.softwaretestingboard.com/" 
    When User clicks the link Create an account link
    And User enters the valid '<FirstName>' in firstname textbox
    And User enters the valid '<LastName>' in lastname textbox
    And User enters the invalid '<InvalidEmail>' in email textbox
    And User enters the valid '<Password>' in password textbox
    And User enters the valid '<ConfirmPassword>' in confirm password textbox
    And User clicks the Create an account button.
    Then User verifies the '<error>' message displayed under the email textbox
    When User re-enters the email with valid data '<ValidEmail>'
    And User clicks the Create an account button.
    Then User verifies thank you '<message>' in the next page
    Then User Close the browser
  Examples:
    | FirstName | LastName | InvalidEmail  | Password    |ConfirmPassword| error | ValidEmail | message |
    | Alla      | Jagadeesh| jagadeesh     | Qwer@123456! | Qwer@123456! | Please enter a valid email address (Ex: johndoe@domain.com).| jagadeesh19@gmail.com |My Account|
    



