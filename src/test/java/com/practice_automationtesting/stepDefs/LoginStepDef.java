package com.practice_automationtesting.stepDefs;

import com.practice_automationtesting.pages.MyAccount_RegistrationPage;
import com.practice_automationtesting.utilities.BrowserUtils;
import com.practice_automationtesting.utilities.ConfigurationReader;
import com.practice_automationtesting.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

import static org.junit.Assert.assertEquals;

public class LoginStepDef {

    MyAccount_RegistrationPage myAccountPage = new MyAccount_RegistrationPage();

    @Given("the user is on the login page")
    public void the_user_is_on_the_login_page() {

        String url = ConfigurationReader.get("url");
        Driver.get().get(url);

    }

    @Then("the user click on My Account Menu")
    public void the_user_click_on_My_Account_Menu() {

        myAccountPage.navigateToMenu("My Account");
        BrowserUtils.waitFor(1);

    }

    @Then("the user enter registered Email Address in Email-Address textbox")
    public void the_user_enter_registered_Email_Address_in_Email_Address_textbox() {

        myAccountPage.register("reg_email").sendKeys(ConfigurationReader.get("email"));

    }

    @Then("Enter your own password in password textbox")
    public void enter_your_own_password_in_password_textbox() throws InterruptedException {

        myAccountPage.register("reg_password").sendKeys(ConfigurationReader.get("password"));
        Thread.sleep(1000);

    }

    @Then("Click on Register button")
    public void click_on_Register_button() throws InterruptedException {

        myAccountPage.navigateRegister("register");
        Thread.sleep(1000);

    }

    @Then("User will be registered successfully")
    public void user_will_be_registered_successfully() {

        String actualText = myAccountPage.nameReader(ConfigurationReader.get("name"));
        String expectedText = ConfigurationReader.get("name");
        assertEquals(expectedText, actualText);

    }

    @And("User will be navigated to the Home page")
    public void userWillBeNavigatedToTheHomePage() {myAccountPage.websiteIcon.click();}

    //    *********Empty Email ********


    @Then("Registration should fail with a warning message {string}")
    public void registration_should_fail_with_a_warning_message(String expectedTextError) {

        String actualTextError = myAccountPage.errorValidEmail.getText().substring(6); // --> substring() kullandik cunku, Error: ile birlikte yazdiriyordu.
//        String actualTextError = myAccountPage.errorValidEmail.getText();// --> substring() kullandik cunku, Error: ile birlikte yazdiriyordu.

        assertEquals(expectedTextError, actualTextError);
    }

    @Then("the user enter {string} in Email Adresse textbox")
    public void the_user_enter_in_Email_Adresse_textbox(String email) {
        myAccountPage.register("reg_email").sendKeys(email);
    }

    @And("the user enter registered {string} in Email textbox")
    public void theUserEnterRegisteredInEmailTextbox(String email) {
        myAccountPage.register("reg_email").sendKeys(email);
    }

    @And("Enter your  {string} in password textbox")
    public void enterYourInPasswordTextbox(String password) {
        myAccountPage.PasswordBtn_Rgstr.sendKeys(password);
        BrowserUtils.waitFor(2);
    }

    @Then("The user should be able to see a warning message {string}")
    public void the_user_should_be_able_to_see_a_warning_message(String expectedErrorText) {
        String actualErrorText = myAccountPage.errorValidEmail.getText();

        System.out.println("actualErrorText = " + actualErrorText);
        assertEquals(expectedErrorText,actualErrorText);
    }

    }

