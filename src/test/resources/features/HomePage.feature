@HomePage
Feature: Home Page Test 1

  Background: the user on the login and on MyAccount Menu
    Given the user is on the login page
    Then  the user click on Shop Menu
    And   the user click on Home menu button

@sliders
  Scenario:Home Page with three Sliders only
    And   Test whether the Home page has 3 Sliders only
    Then  The Home page must contains only 3 sliders

  @arrivals
  Scenario:Home Page with three Arrivals only
    Then  Verify The Home page must contains only 3 Arrivals
  #Scenario: Home Page-Images in Arrivals should navigate
    And   Now click the image in the Arrivals
    And   User can add a book by clicking on Add To Basket button which adds that book in to his Basket
  #Scenario: Home Page Arrivals-Images-Description
    And   Click on Description tab for the book you clicked on.
    Then  There should be a description regarding that book the user clicked on
  #Scenario: Home Page Arrivals-Images-Reviews
    And   Now click on Reviews tab for the book you clicked on.
    Then  There should be a Reviews regarding that book the user clicked on



