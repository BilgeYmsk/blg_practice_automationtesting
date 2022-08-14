@HomePage
Feature: Home Page Test 1

  Background: the user on the login and on MyAccount Menu
    Given the user is on the login page
    Then  the user click on Shop Menu
    And   the user click on Home menu button

@sliders
  Scenario:Home Page with three Sliders only
    And   Test whether the Home page has 3 Sliders only
    Then  Verify The Home page must contains only 3 sliders

  @arrivals
  Scenario:Home Page with three Arrivals only
    Then  Verify The Home page must contains only 3 Arrivals
  #Scenario: Home Page-Images in Arrivals should navigate
    And   Now click the image in the Arrivals
    #//Image should be clickable and shoul navigate to next page where user can add that book to his basket
    And   User can add a book by clicking on Add To Basket button
    Then  Verify that book in to his Basket
  #Scenario: Home Page Arrivals-Images-Description
    And   Click on Description tab
    Then  Verify to There should be a description regarding that book the user clicked on
  #Scenario: Home Page Arrivals-Images-Reviews
    And   Now click on Reviews tab for the book you clicked on.
    Then  Verify to There should be a Reviews regarding that book the user clicked on



