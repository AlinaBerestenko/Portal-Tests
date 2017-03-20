import Data.UserData;
import Pages.LoginPage;
import org.junit.Test;
import org.openqa.selenium.support.PageFactory;


/**
 * Created by berestenko on 09.03.17.
 */
public class ResetPasswordTest extends BasicTest{

    private LoginPage loginPage = PageFactory.initElements(BasicTest.getWebDriver(), LoginPage.class);

    @Test
    public void ResetPassword() throws Exception {
        loginPage.open();
        UserData user = new UserData("alinaTest");
        loginPage.resetPassword(user);
        String text = "An email has been sent to alina.berestenko@gmail.com. It contains a link you must click to reset your password.";
        String tittle = "Success";
        loginPage.assertAlertText(text);
        loginPage.assertAlertTittle(tittle);
    }

    @Test
    public void ResetPasswordForNonExistingUser() throws Exception{
        loginPage.open();
        UserData user = new UserData("nonExistingUser");
        loginPage.resetPassword(user);
        String text = "The username \"nonExistingUser\" does not exist.";
        String tittle = "Error";
        loginPage.assertAlertTittle(tittle);
        loginPage.assertAlertText(text);
    }


//    @Test
//    "The password for this user has already been requested within the last 24 hours"


}
