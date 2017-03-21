import Data.BroadcastData;
import Data.UserData;
import Pages.CreateBroadcast;
import Pages.LoginPage;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by berestenko on 21.03.17.
 */
public class CreateBroadcastTest extends BasicTest{
    private CreateBroadcast createBroadcast = PageFactory.initElements(getWebDriver(), CreateBroadcast.class);
    private LoginPage loginPage = PageFactory.initElements(getWebDriver(),LoginPage.class);

    @Before
    public void Login() throws Exception {
        loginPage.open();
        UserData user = new UserData("sample", "sample1");
        loginPage = loginPage.loginAs(user);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    //Push tests
    @Test
    public void CreatePush() throws Exception {
        createBroadcast.open();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        BroadcastData broadcast = new BroadcastData("10", "testPush", "Push", "http://hyber.dev", "Go to Hyber", "http://hyber.dev", "text for ios");
        createBroadcast = createBroadcast.sendViber(broadcast);

    }

}
