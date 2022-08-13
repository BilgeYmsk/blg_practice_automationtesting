@Test2
Feature: Home Page Test 2

  Background: the user on the login and on MyAccount Menu
    #User can add a book by clicking on Add To Basket button which adds that book in to his Basket
    Given the user is on the login page
    Then  the user click on Shop Menu
    And   the user click on Home menu button
    Then  Verify The Home page must contains only 3 Arrivals
    And   Now click the image in the Arrivals
    And   User can add a book by clicking on Add To Basket button
    Then  Verify that book in to his Basket
    Then  User can view that Book in the Menu item with price.


  Scenario:Home Page Arrivals-Images-Add to Basket with more books
    And   Select more books than the books in stock.
    #elect more books than the books in stock.Ex if the stock has 20 books, try to add 21.
    And   Click the add to basket button
    And   Now it throws an error prompt like you must enter a value between one and twenty
  #############burada verify edemiyorum alert calismiyor###########

  @rps
  Scenario:Home Page Arrivals-Images-Add to Basket-Items/Coupon/value>450
    And   Now click on Item link which navigates to proceed to basket page.
    #Scenario:Home Page Arrivals-Images-Add to Basket-Items-Coupon
    And   Enter the Coupon code as "krishnasakinala" to get 50rps off on the total.
    Then  Verify 50rps discount with coupon on total price
    #Scenario: Home Page Arrivals-Images-Add to Basket-Items-Coupon value<450
    Then  verify to the total price because the coupon is applicable for the book price > 450 rps
    #Then  Verify  user can not able to apply coupon by entering "krishnasakinala" which is applicable for the book price > 450 rps
    #because the coupon is applicable for the book price > 450 rps

  @Remove
  Scenario:Home Page Arrivals-Images-Add to Basket-Items Remove book and verify invalid coupon_value<450
    And   Now click on Item link which navigates to proceed to basket page.
    And   Now click on Remove this icon in Check out page
    Then  Verify user can remove the book at the time of check out
    And  Click on return to shop button
    Then  Verify  user can not able to apply coupon by entering "krishnasakinala" which is applicable for the book price > 450 rps

  @Update
  Scenario:Home Page Arrivals-Images-Add to Basket-Items-Add book and Check-out-Update Basket
    And   Now click on Item link which navigates to proceed to basket page.
    Then  Verify Update Basket button UnClickable mode
    And   Click on textbox value under quantity in Basket page to add or subtract books.
    And   Now after the above change ‘Update Basket’ button will turn into Clickable mode.
    And   Now click on Update Basket to reflect those changes
    Then  User has the feasibility to Update Basket at the time of check out.

  @Total
  Scenario:Home Page Arrivals-Images-Add to Basket-Items-Check-out-Book Final Price
    And   Now click on Item link which navigates to proceed to basket page.
    Then  Now User can find the Total price of the book in the Check out grid.
    Then  User has the feasibility to find the total price of the books at Basket Totals
    #Then  Now user can find total and subtotal values just above the Proceed to Checkout button.

  @Total&SubTotal
  Scenario:Home Page Arrivals-Images-Add to Basket-Items-Check-out-Total&Sub-Total condition
    And   Now click on Item link which navigates to proceed to basket page.
    And   The total always < subtotal because taxes are added in the subtotal
    #Scenario: Home Page Arrivals-Images-Add to Basket-Items-Check-out functionality
    And   Now click on Proceed to Check out button which navigates to payment gateway page.
    #Scenario: Home Page Arrivals-Images-Add to Basket-Items-Check-out-Payment Gateway
    Then  User can view Billing Details,Order Details,Additional details and Payment gateway details.
    And   Now user can fill his details in billing details form and can opt any payment in the payment gateway like Direct bank transfer,cheque,cash or paypal.
    Then  User has the feasibility to add coupon in the payment gateway page
    #Scenario: Home Page Arrivals-Images-Add to Basket-Items-Check-out-Payment Gateway-Place order
    And   Now click on Place Order button to complete process
    Then  On clicking place-order button user completes the process where the page navigates to Order confirmation page with order details,bank details,customer details and billing details.
