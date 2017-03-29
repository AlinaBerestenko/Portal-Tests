import Data.UserData;
import Pages.LoginPage;
import org.junit.Test;
import org.openqa.selenium.support.PageFactory;


/**
 * Created by berestenko on 03.03.17.
 */
public class LoginTest extends BasicTest {
    private LoginPage loginPage = PageFactory.initElements(getWebDriver(), LoginPage.class);


    @Test
    public void Login() throws Exception {
        loginPage.open();
        UserData user = new UserData("AlinaTest", "Alina123456");
        loginPage = loginPage.loginAs(user);
        loginPage.isLoggedIn();
        loginPage.logOut();
    }

    @Test
    public void FailToLogin() throws Exception {
        loginPage.open();
        UserData user = new UserData("AlinaTest", "alfsf");
        loginPage = loginPage.loginAs(user);
        String text = "Invalid credentials.";
        String tittle = "Error";
        loginPage.assertAlertText(text);
        loginPage.assertAlertTittle(tittle);
        loginPage.logOut();
    }

}





