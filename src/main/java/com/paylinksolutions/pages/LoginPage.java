package com.paylinksolutions.pages;

import com.paylinksolutions.propertyreader.PropertyReader;
import com.paylinksolutions.uitlity.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.AssertJUnit;

/**
 * @author Vimal Vithalpura
 * @project Paylink_Solutions
 * @created 15/03/2022
 */

/* Homepage extends to Utility for the methods that needs to be performed.
 * Listing all the elements through their locators
 */
public class LoginPage extends Utility {

    //logger defined to print logs
    private static final Logger log = LogManager.getLogger(LoginPage.class.getName());

    //Constructor used to initialise the WebElements with @FindBy annotation to this page
    public LoginPage() {PageFactory.initElements(driver, this);}

    @CacheLookup
    @FindBy (id = "agree")
    WebElement btnCookieAgree;

    @CacheLookup
    @FindBy (id = "username-i")
    WebElement txtUserName;

    @CacheLookup
    @FindBy (id = "password-i")
    WebElement txtPassword;

    @CacheLookup
    @FindBy (id = "login-btn")
    WebElement btnLogin;

    @CacheLookup
    @FindBy (xpath = "//h5[normalize-space()='Share with Embark DEMO']")
    WebElement shareWithEmbarkDemoText;

    @CacheLookup
    @FindBy (xpath = "//div[contains (text(), 'Incorrect username or password')]")
    WebElement msgIncorrectUsernameOrPassword;

    @CacheLookup
    @FindBy (xpath = "//span[contains(text(),'Your username')]")
    WebElement msgYourUsernameRequired;


    // This method will verify the URL
    public void verifyLoginPage(){
        String actualUrl = driver.getCurrentUrl();  // Get Existing url and save into string
        String expectedUrl = PropertyReader.getInstance().getProperty("baseUrl");
        log.info("verifying Login URL. : ");
        AssertJUnit.assertEquals(expectedUrl,actualUrl); //verify actual and expected Url

    }
    public void clickOnAcceptCookiesButton(){
        doClickOnElement(btnCookieAgree);
        log.info("Clicking on Accept Cookie Button : " + btnCookieAgree.toString());
    }

    public String getShareWithEmbarkDemoText(){
        log.info("Getting text for verification : " + shareWithEmbarkDemoText.toString());
        return doGetTextFromElement(shareWithEmbarkDemoText);
    }

    public void enterUsernameIntoUsernameField(String username){
        doSendTextToElement(txtUserName, username);
        log.info("Entering Username into Username Field : " + txtUserName.toString());
    }

    public void enterPasswordIntoPasswordField(String password){
        doSendTextToElement(txtPassword, password);
        log.info("Entering Password into Password Field : " + txtPassword.toString());
    }

    public void clickOnLoginButton(){
        doClickOnElement(btnLogin);
        log.info("Clicking on Login Button : " + btnLogin.toString());
    }

    public String verifyInvalidCredentialMessage(String errorMessage) throws InterruptedException {
        Thread.sleep(1000);
        return doGetTextFromElement(msgIncorrectUsernameOrPassword);
    }

    public String verifyUsernameReqMessage(String errorMessage){
        return doGetTextFromElement(msgYourUsernameRequired);
    }
}
