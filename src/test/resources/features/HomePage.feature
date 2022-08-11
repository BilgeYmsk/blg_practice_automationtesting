@HomePage
Feature: Home Page Test

  Background: the user on the login and on MyAccount Menu
    Given the user is on the login page
    Then  the user click on Shop Menu
    And   the user click on Home menu button

  @wip
  Scenario:Home Page with three Sliders only
    And   Test whether the Home page has 3 Sliders only
    Then  The Home page must contains only 3 sliders

  Scenario:Home Page with three Arrivals only
    And   Test whether the Home page has Three Arrivals only
    Then  The Home page must contains only three Arrivals
  #Scenario: Home Page-Images in Arrivals should navigate
    And   Now click the image in the Arrivals
    And   Test whether it is navigating to next page where the user can add that book into his basket.
    Then  Image should be clickable and shoul navigate to next page where user can add that book to his basket
  #Scenario: Home Page Arrivals-Images-Description
    And   Click on Description tab for the book you clicked on.
    Then  There should be a description regarding that book the user clicked on
  #Scenario: Home Page Arrivals-Images-Reviews
    And   Now clock on Reviews tab for the book you clicked on.
    Then  There should be a Reviews regarding that book the user clicked on

  Scenario:Home Page Arrivals-Images-Add to Basket
    And   Test whether the Home page has Three Arrivals only
    Then  The Home page must contains only three Arrivals
    And   Now click the image in the Arrivals
    And   Test whether it is navigating to next page where the user can add that book into his basket.
    Then  Image should be clickable and shoul navigate to next page where user can add that book to his basket
    And   Click on the Add To Basket button which adds that book to your basket
    Then  User can view that Book in the Menu item with price.
    And   User can add a book by clicking on Add To Basket button which adds that book in to his Basket
  #Scenario: Home Page Arrivals-Images-Add to Basket with more books
    And   Select more books than the books in stock.Ex if the stock has 20 books, try to add 21.
    And   Click the add to basket button
    And   Now it throws an error prompt like you must enter a value between 1 and 20

  Scenario:Home Page Arrivals-Images-Add to Basket-Items
    And   Test whether the Home page has Three Arrivals only
    Then  The Home page must contains only three Arrivals
    And   Now click the image in the Arrivals
    And   Test whether it is navigating to next page where the user can add that book into his basket.
    Then  Image should be clickable and shoul navigate to next page where user can add that book to his basket
    And   Click on the Add To Basket button which adds that book to your basket
    Then  User can view that Book in the Menu item with price.
    And   Now click on Item link which navigates to proceed to check out page.
    Then  User can click on the Item link in menu item after adding the book in to the basket which leads to the check out page
    #Scenario:Home Page Arrivals-Images-Add to Basket-Items-Coupon
    And   Enter the Coupon code as ‘krishnasakinala’ to get 50rps off on the total.
    Then  User can able to apply coupon by entering ‘krishnasakinala’ in the coupon textbox which give 50rps off on the total price
    #Scenario: Home Page Arrivals-Images-Add to Basket-Items-Coupon value<450
    Then  User can able to apply coupon by entering ‘krishnasakinala’ in the coupon textbox which give 50rps off on the total price because the coupon is applicable for the book price > 450 rps

  Scenario:Home Page Arrivals-Images-Add to Basket-Items Remove book
    And   Test whether the Home page has Three Arrivals only
    Then  The Home page must contains only three Arrivals
    And   Now click the image in the Arrivals
    And   Test whether it is navigating to next page where the user can add that book into his basket.
    Then  Image should be clickable and shoul navigate to next page where user can add that book to his basket
    And   Click on the Add To Basket button which adds that book to your basket
    Then  User can view that Book in the Menu item with price.
    And   Now click on Item link which navigates to proceed to check out page.
    And   Now click on Remove this icon in Check out page which removes that book from the grid.
    Then  User has the feasibility to remove the book at the time of check out also

  Scenario:Home Page Arrivals-Images-Add to Basket-Items-Add book and Check-out-Update Basket
    And   Test whether the Home page has Three Arrivals only
    Then  The Home page must contains only three Arrivals
    And   Now click the image in the Arrivals
    And   Test whether it is navigating to next page where the user can add that book into his basket.
    Then  Image should be clickable and shoul navigate to next page where user can add that book to his basket
    And   Click on the Add To Basket button which adds that book to your basket
    Then  User can view that Book in the Menu item with price.
    And   Now click on Item link which navigates to proceed to check out page.
    And   Click on textbox value under quantity in Check out page to add or subtract books.
    And   Now after the above change ‘Update Basket’ button will turn into Clickable mode.
    And   Now click on Update Basket to reflect those changes
    Then  User has the feasibility to Update Basket at the time of check out.

  Scenario:Home Page Arrivals-Images-Add to Basket-Items-Check-out-Book Final Price
    And   Test whether the Home page has Three Arrivals only
    Then  The Home page must contains only three Arrivals
    And   Now click the image in the Arrivals
    And   Test whether it is navigating to next page where the user can add that book into his basket.
    Then  Image should be clickable and shoul navigate to next page where user can add that book to his basket
    And   Click on the Add To Basket button which adds that book to your basket
    Then  User can view that Book in the Menu item with price.
    And   Now click on Item link which navigates to proceed to check out page.
    Then  Now User can find the Total price of the book in the Check out grid.
    Then  User has the feasibility to find the total price of the books at to find the total price of the books at the time of check out

  Scenario:Home Page Arrivals-Images-Add to Basket-Items-Check-out-Total&Sub-Total condition
    And   Test whether the Home page has Three Arrivals only
    Then  The Home page must contains only three Arrivals
    And   Now click the image in the Arrivals
    And   Test whether it is navigating to next page where the user can add that book into his basket.
    Then  Image should be clickable and shoul navigate to next page where user can add that book to his basket
    And   Click on the Add To Basket button which adds that book to your basket
    Then  User can view that Book in the Menu item with price.
    And   Now click on Item link which navigates to proceed to check out page.
    Then  Now user can find total and subtotal values just above the Proceed to Checkout button.
    And   The total always < subtotal because taxes are added in the subtotal
    Then  Total
    #Scenario: Home Page Arrivals-Images-Add to Basket-Items-Check-out functionality
    And   Now click on Proceed to Check out button which navigates to payment gateway page.
    And   Clicking on Proceed to Checkout button leads to payment gateway page
    #Scenario: Home Page Arrivals-Images-Add to Basket-Items-Check-out-Payment Gateway
    Then  User can view Billing Details,Order Details,Additional details and Payment gateway details.
    And   Now user can fill his details in billing details form and can opt any payment in the payment gateway like Direct bank transfer,cheque,cash or paypal.
    Then  User has the feasibility to add coupon in the payment gateway page and also he can find billing,order and additional details.
    #Scenario: Home Page Arrivals-Images-Add to Basket-Items-Check-out-Payment Gateway-Place order
    And   Now click on Place Order button to complete process
    Then  On clicking place-order button user completes the process where the page navigates to Order confirmation page with order details,bank details,customer details and billing details.


