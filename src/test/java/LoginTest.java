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
        UserData user = new UserData("sample", "sample1");
        loginPage = loginPage.loginAs(user);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        loginPage.isLoggedIn();
        loginPage.logOut();
    }

    @Test
    public void FailToLogin() throws Exception {
        loginPage.open();
        UserData user = new UserData("sample", "sampleууу");
        loginPage = loginPage.loginAs(user);
        String text = "Invalid credentials.";
        String tittle = "Error";
        loginPage.assertAlertText(text);
        loginPage.assertAlertTittle(tittle);
        loginPage.logOut();
    }

}





