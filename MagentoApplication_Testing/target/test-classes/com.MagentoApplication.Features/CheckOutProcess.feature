Feature: Checkout Process with Invalid Data Handling

  Scenario Outline: User performs login and checkout actions
    Given User launches the browser
    And User navigates to the webpage url "https://magento.softwaretestingboard.com/"
    When User clicks on the SignIn link
    And User enters valid '<Username>' and '<Password>'
    And User clicks on the Login button
    Then User should be logged in successfully
    And User clicks the cart icon on the homepage  
		And User then clicks the Proceed to checkout button  
		And User enters the shipping address fields with valid data except zip/postal code textbox  
		|Exceldata.xlsx|  
		And User clicks the next button  
		And User clicks the shipping button  
		Then User verifies the '<warning>' displayed under zip/postal code textbox  
		When User re-Enters the valid data in zip/postal code textbox  
		|Exceldata.xlsx|  
		And User clicks the next button  
		And User clicks the place order button  
		Then User verifies the Thank you '<message>'
		Then User Close the browser  

		Examples:  
		|Username|Password| warning | message |  
		|jagadeesh11@gmail.com|Qwer@123456!| Provided Zip/Postal Code seems to be invalid. Example: 12345-6789; 12345. If you believe it is the right one you can ignore this notice. |Checkout|
    