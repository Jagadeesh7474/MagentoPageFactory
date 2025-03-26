Feature: Adding Multiple products and verifies the product and price

  Scenario Outline: User performs login and add multiple products
    Given User launches the browser
    And User navigates to the webpage url "https://magento.softwaretestingboard.com/"
    When User clicks on the SignIn link
    And User enters valid '<Username>' and '<Password>'
    And User clicks on the Login button
    Then User should be logged in successfully
    When User mouse hover on Men option
    Then User moves to top option
    Then User moves to Jacket option and Click
    And User cliks on the product
    And User selects Size ,Color and Quantity of the product
    |ExcelData.xlsx|
    And User clicks on Add To Cart button
    And Verify wheather product added to cart '<message>' 
    When User mouse hover on Men option
    Then User moves to top option
    Then User moves to Tees option and Click 
    And User cliks on the product
    And User selects Size ,Color and Quantity of the product
    |ExcelData.xlsx|
    And User clicks on Add To Cart button
    And Verify wheather product added to cart '<message>' 
    And User clicks the cart icon on the homepage
    And User clicks on ViewAndEditCart
		Then User Verify that the correct '<product>' and '<price>' are displayed
		Then User Close the browser
    Examples:
		|Username|Password|product|price|
		|jagadeesh3@gmail.com|Qwer@123456!|Jupiter All-Weather Trainer|$56.99|