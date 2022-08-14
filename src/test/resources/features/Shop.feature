
Feature: Shop-Filter By Price Functionality

  Background:the user on the login and on MyAccount Menu
    Given the user is on the login page
    Then  the user click on Shop Menu


  Scenario:Shop By Price Functionality
    And Adjust the filter by price between number
    And Now click on Filter button
    Then User can view books only between 200 to 450 rps price


  Scenario:Shop-Product Categories Funktionality
    And   Click on any of the product links available in the product category
    Then  The user should be able to see only that particular product

  Scenario Outline:Shop-Default-Sorting Funktionality
    And   Click on Sort and verify the value "Default sorting"
    And   Click on Sort "<orderby>"  item in Default sorting dropdown
    Then  User should be able to view the popular products only
    Examples:
      | orderby                    |
      | Sort by popularity         |
      | Sort by average rating     |
      | Sort by newness            |
      | Sort by price: low to high |
      | Sort by price: high to low |

  Scenario: Shop Read More Functionality
    And  Click on read more button in home page
    And  Read More option indicates the Out Of Stock.
    Then User cannot add the product which has read more option as it was out of stock.

  @Shop
  Scenario: Shop Sale Functionality
    And  Click on Sale written product in home page
    Then User can view the actual price with old price striken for the sale written products

  Scenario: Shop Add to Basket View Basket Functionality
    And Click on the Add To Basket button which adds that book to your basket
    Then User can view that Book in the Menu item with price .
    And  Click on View Basket link which navigates to proceed to check out page.
    Then User can find total and subtotal values just above the Proceed to Checkout button.
    Then The total always < subtotal because taxes are added in the subtotal
    And   Now click on Proceed to Check out button which navigates to payment gateway page.
    Then  User can view Billing Details,Order Details,Additional details and Payment gateway details.
    And   Now user can fill his details in billing details form and can opt any payment in the payment gateway like Direct bank transfer,cheque,cash or paypal.
    Then  User has the feasibility to add coupon in the payment gateway page
    Then  On clicking place-order button user completes the process where the page navigates to Order confirmation page with order details,bank details,customer details and billing details.



















