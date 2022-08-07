package com.practice_automationtesting.stepDefs;

import com.practice_automationtesting.pages.LoginPage;
import com.practice_automationtesting.pages.MyAccount_RegistrationPage;
import com.practice_automationtesting.utilities.ConfigurationReader;
import com.practice_automationtesting.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import static org.junit.Assert.*;

public class LoginUserStepDef {

    LoginPage login=new LoginPage();
    MyAccount_RegistrationPage myAccountPage=new MyAccount_RegistrationPage();

    @Then("Enter registered username in username textbox")
    public void enter_registered_username_in_username_textbox() {login.login("username");}

    @Then("Enter password in password textbox")
    public void enter_password_in_password_textbox() {login.login("password");}

    @Then("Click on login button")
    public void click_on_login_button() {login.loginBtn.click();}

    @Then("User must successfully login to the web page")
    public void user_must_successfully_login_to_the_web_page() {
        String actualText = myAccountPage.nameReader(ConfigurationReader.get("name"));
        String expectedText = ConfigurationReader.get("name");
        assertEquals(expectedText, actualText);

    }

    @Then("Verify that the password is not visible on the screen")
    public void verifyThatThePasswordIsNotVisibleOnTheScreen() {

        String actualtext = login.passwordBtn.getText();
        System.out.println("actualtext = " + actualtext);
        String expectedtext="";
        assertEquals(expectedtext,actualtext);

    }

    @And("Enter {string} in username textbox")
    public void enterInUsernameTextbox(String email) {
        login.usernameBtn.sendKeys(email);
    }

    @And("Enter {string} in password textbox")
    public void enterInPasswordTextbox(String password) {
        login.passwordBtn.sendKeys(password);
    }

    @And("write the {string}")
    public void writeThe(String message) {System.out.println("text = " + message);}

    @Then("Once your are logged in, sign out of the site")
    public void once_your_are_logged_in_sign_out_of_the_site() {login.signOutBtn.click();}

    @Then("Now press back button")
    public void now_press_back_button() {Driver.get().navigate().back();}

    @Then("User shouldn’t be signed in to his account rather a general webpage must be visible")
    public void user_shouldn_t_be_signed_in_to_his_account_rather_a_general_webpage_must_be_visible() {
        String actualtext = login.loginTextBtn.getText();
        String expectedtext="Login";
        assertEquals(expectedtext,actualtext);

    }

}
