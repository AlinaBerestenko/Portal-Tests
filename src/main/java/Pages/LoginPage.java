package Pages;

import Data.UserData;
import Utils.Config;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static org.junit.Assert.assertEquals;

/**
 * Created by berestenko on 03.03.17.
 */
public class LoginPage extends Page {
    public LoginPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public void open() {
        driver.get(Config.getProperty("portal_url"));
    }


//AUTORIZE WINDOW
    @FindBy(id = "username")
    public WebElement fieldUsername;

    @FindBy(id = "password")
    public WebElement fieldPassword;

    @FindBy (css =".btn.btn-primary")
    public WebElement buttonSignin;

    @FindBy (css = ".collapse.navbar-collapse")
    public WebElement loggedIn;

    @FindBy (linkText = "Sign in")
    public WebElement loggedOut;


//Allert
    @FindBy (css = ".alert.ui-pnotify-container.alert-danger.ui-pnotify-shadow")
    public WebElement loginAlert;

    @FindBy (css = ".ui-pnotify-text")
    public WebElement alertText;

    @FindBy (css =".ui-pnotify-title")
    public WebElement alertTitle;



//LOGIN METHODS
    public LoginPage loginAs(UserData user){
        fieldUsername.click();
        type(fieldUsername, user.getUsername());
        fieldPassword.click();
        type(fieldPassword, user.getPassword());
        buttonSignin.click();
        waitForLoadingPage();
        return PageFactory.initElements(driver, LoginPage.class);
    }



    public LoginPage assertAlertText(String text){
        assertEquals(text, alertText.getText());
        return PageFactory.initElements(driver, LoginPage.class);
    }

    public LoginPage assertAlertTittle(String title){
        assertEquals(title, alertTitle.getText());
        return PageFactory.initElements(driver, LoginPage.class);
    }



    public void isLoggedIn(){
        isElementPresent(loggedIn);
    }


    public void isLoggedOut(){
        isElementPresent(loggedOut);
    }


    public void logOut(){
        driver.get(Config.getProperty("log_out_url"));
    }


}

