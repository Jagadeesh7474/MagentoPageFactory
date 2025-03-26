Feature: Login, Product Search, and Add to Cart

   Scenario Outline: User logs in, searches for a product, and adds it to the cart
    Given User launches the browser
    And User navigates to the webpage url "https://magento.softwaretestingboard.com/"
    When User clicks on the SignIn link
    And User enters valid '<Username>' and '<Password>'
    And User clicks on the Login button
    Then User should be logged in successfully
    When User searches for '<SearchTerm>'
    And User selects '<SuggestedItem>' from the auto-suggestions and click on it
    And User cliks on the product
    And User selects Size ,Color and Quantity of the product
    |ExcelData.xlsx|
    And User clicks on Add To Cart button
    And Verify wheather product added to cart '<message>' 
    Then User Close the browser
    

  Examples:
    | Username            | Password      | SearchTerm| SuggestedItem | message |
    | jagadeesh3@gmail.com | Qwer@123456!  | Shirts    |  shirts for men| you added product Sucessfully|