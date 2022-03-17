package com.paylinksolutions.cucumber.stepdefs;

import com.paylinksolutions.pages.LoginPage;
import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.junit.Assert;

import java.util.List;

/**
 * @author Vimal Vithalpura
 * @project Paylink_Solutions
 * @created 15/03/2022
 */
public class LoginPageSteps {

    @Given("^User is on Login Page$")
    public void userIsOnLoginPage() {
        new LoginPage().clickOnAcceptCookiesButton();
        new LoginPage().verifyLoginPage(); // Verify user is on account page
    }

    @And("^User enters valid USERNAME and PASSWORD$")
    public void user_enters_valid_USERNAME_and_PASSWORD(DataTable table)  {
        List<List<String>> data = table.raw();
        for (int i = 1; i < data.size(); i++) { //start i from 1 to ignore the header row
            //  getting data from row 1 and column 0
            new LoginPage().enterUsernameIntoUsernameField(data.get(i).get(0));
            new LoginPage().enterPasswordIntoPasswordField(data.get(i).get(1));
        }
    }

    @And("^User click on Login Button$")
    public void user_click_on_Login_Button()  {
        new LoginPage().clickOnLoginButton();
    }

    @Then("^Verify user is on account page$")
    public void verify_user_is_on_account_page()  {
        Assert.assertEquals(new LoginPage().getShareWithEmbarkDemoText(),"Share with Embark DEMO");
    }

    @And("^User enters invalid \"([^\"]*)\" and \"([^\"]*)\"$")
    public void userEntersInvalidAnd(String username, String password) {
       new LoginPage().enterUsernameIntoUsernameField(username);
       new LoginPage().enterPasswordIntoPasswordField(password);
    }

    @Then("^Verify error message is displayed \"([^\"]*)\"$")
    public void verifyErrorMessageIsDisplayed(String errorMessage) throws InterruptedException {
        Assert.assertEquals(new LoginPage().verifyInvalidCredentialMessage(errorMessage), errorMessage);
    }
}
