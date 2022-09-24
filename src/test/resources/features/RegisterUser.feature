
Feature: MY ACCOUNT - REGISTRATION

  Background: the user on the login and on MyAccount Menu
    Given the user is on the login page
    When  the user click on My Account Menu

  @rgs
  Scenario: Registration-Sign-in (positive)
    And   the user enter registered Email Address in Email-Address textbox
    And   Enter your own password in password textbox
    And   Click on Register button
    Then  User will be registered successfully
    And   User will be navigated to the Home page


  Scenario: the user enters the empty email and valid password
    Then  the user enter "" in Email Adresse textbox
    Then  Enter your own password in password textbox
    And   Click on Register button
    And   Registration should fail with a warning message " Please provide a valid email address."

  @registeren
  Scenario Outline: All Registration-Sign-in (negative)
    And   the user enter registered "<email>" in Email textbox
    And   Enter your  "<password>" in password textbox
    And   Click on Register button
    Then  The user should be able to see a warning message "<expectedErrorMsg>"
    Examples:
      | email                 | password    | expectedErrorMsg                                                               |
      | sdet_526@gmail.com    |             | Error: An account is already registered with your email address. Please login. |
      | sdet_blg590@gmail.com |             | Error: Please enter an account password.                                       |
      |                       |             | Error: Please provide a valid email address.                                   |
      |                       | sdet_blg501 | Error: Please provide a valid email address.                                   |
  #Negative Scenario
  #valid Email(schon bereits) empty password
  #valid Email                empty password
  #empty Email                empty Password
  #empty Email                valid Password









