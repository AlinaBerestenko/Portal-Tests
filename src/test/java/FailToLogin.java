import Data.UserData;
import Pages.LoginPage;
import org.junit.Test;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by berestenko on 20.03.17.
 */
public class FailToLogin extends BasicTest{
    private LoginPage loginPage = PageFactory.initElements(BasicTest.getWebDriver(), LoginPage.class);

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
