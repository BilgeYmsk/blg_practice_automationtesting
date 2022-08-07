@Login
Feature: MY ACCOUNT - Login

  Background: the user on the login and on MyAccount Menu
    Given the user is on the login page
    Then  the user click on My Account Menu


  Scenario: Login with valid username and valid password
    And Enter registered username in username textbox
    And Enter password in password textbox
    And Click on login button
    Then User must successfully login to the web page


  Scenario Outline: Negative Login Scenario
    And Enter "<username>" in username textbox
    And Enter "<password>" in password textbox
    And Click on login button
    Then The user should be able to see a warning message "<ExpectedErrorMessage>"
    And write the "<credentials>"
    Examples:
      | username    | password    | ExpectedErrorMessage                                                                                                               | credentials                            |
      | hdiasldkvn  | kjfhdfhldf  | Error: the username hdiasldkvn is not registered on this site. If you are unsure of your username, try your email address instead. | #incorrect username incorrect password |
      | sdet_blg528 |             | Error: Password is required.                                                                                                       | #correct username empty password       |
      |             | sdet_blg501 | Error: Username is required.                                                                                                       | #empty username valid password         |
      |             |             | Error: Username is required.                                                                                                       | #empty username empty password         |
      | sdet_blg528 | kjhdjfhd    | Error: the password you entered for the username sdet_blg528 is incorrect. Lost your password?                                     | #correct username incorrect password   |
      | Sdet_Blg528 | Sdet_Blg501 | Error: the password you entered for the username Sdet_Blg528 is incorrect. Lost your password?                                     | #Login Handles case sensitive          |

    #incorrect username incorrect password
    #correct username empty password
    #empty username valid password
    #empty username empty password
    #correct username incorrect password
    #Login Handles case sensitive

  Scenario:Password should be masked
    And Enter password in password textbox
    Then Verify that the password is not visible on the screen

  Scenario: Login Authentication
    And Enter registered username in username textbox
    And Enter password in password textbox
    And Click on login button
    Then User must successfully login to the web page
    And Once your are logged in, sign out of the site
    And Now press back button
    Then User shouldn’t be signed in to his account rather a general webpage must be visible



