@Shop
Feature: Shop-Filter By Price Functionality

  Background: the user on the login and on MyAccount Menu
    Given the user is on the login page
    Then  the user click on Shop Menu


  Scenario: Shop By Price Functionality
    And Adjust the filter by price between number
    And Now click on Filter button
    Then User can view books only between 200 to 450 rps price


