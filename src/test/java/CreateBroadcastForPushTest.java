import Data.BroadcastDataForPush;
import Data.UserData;
import Pages.CreateBroadcastPage;
import Pages.LoginPage;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by berestenko on 29.03.17.
 */
public class CreateBroadcastForPushTest extends BasicTest{
    private CreateBroadcastPage createBroadcast = PageFactory.initElements(getWebDriver(), CreateBroadcastPage.class);

    String successTitle = "Success";
    String successText = "Message successfully sent";
    String error = "This value should not be blank.";




    @BeforeClass
    public static void Login() throws Exception {
        LoginPage loginPage = PageFactory.initElements(getWebDriver(),LoginPage.class);
        loginPage.open();
        UserData user = new UserData("AlinaTest", "Alina123456");
        loginPage.loginAs(user);
        try {
            Thread.sleep(1000);

        } catch (Throwable error) {

        }

    }


    //Push tests
    //Valid tests
    @Test
    public void CreatePush() throws Exception {
        createBroadcast.open();
        BroadcastDataForPush broadcast = new BroadcastDataForPush("15", "testPush", "Push", "http://hyber.dev", "Go to Hyber", "http://hyber.dev");
        createBroadcast = createBroadcast.sendPush(broadcast);
        createBroadcast.assertAlertTitle(successTitle);
        createBroadcast.assertAlertText(successText);
    }

    @Test
    public void CreatePushWithOnlyText() throws Exception {
        createBroadcast.open();
        BroadcastDataForPush broadcast = new BroadcastDataForPush("15", "testPush", "", "", "", "");
        createBroadcast = createBroadcast.sendPush(broadcast);
        createBroadcast.assertAlertTitle(successTitle);
        createBroadcast.assertAlertText(successText);
    }

    @Test
    public void CreatePushWithOnlyImage() throws Exception {
        createBroadcast.open();
        BroadcastDataForPush broadcast = new BroadcastDataForPush("15", "", "", "", "", "http://hyber.dev");
        createBroadcast = createBroadcast.sendPush(broadcast);
        createBroadcast.assertAlertTitle(successTitle);
        createBroadcast.assertAlertText(successText);
    }

    @Test
    public void CreatePushWithImageAndText() throws Exception {
        createBroadcast.open();
        BroadcastDataForPush broadcast = new BroadcastDataForPush("15", "testPush", "", "", "", "http://hyber.dev");
        createBroadcast = createBroadcast.sendPush(broadcast);
        createBroadcast.assertAlertTitle(successTitle);
        createBroadcast.assertAlertText(successText);
    }

    @Test
    public void CreatePushWithButtonAndImage() throws Exception {
        createBroadcast.open();
        BroadcastDataForPush broadcast = new BroadcastDataForPush("15", "", "", "http://hyber.dev", "Go to Hyber", "http://hyber.dev");
        createBroadcast = createBroadcast.sendPush(broadcast);
        createBroadcast.assertAlertTitle(successTitle);
        createBroadcast.assertAlertText(successText);
    }

    @Test
    public void CreatePushWithOnlyButtonAndText() throws Exception {
        createBroadcast.open();
        BroadcastDataForPush broadcast = new BroadcastDataForPush("15", "testPush", "", "http://hyber.dev", "Go to Hyber", "");
        createBroadcast = createBroadcast.sendPush(broadcast);
        createBroadcast.assertAlertTitle(successTitle);
        createBroadcast.assertAlertText(successText);
    }


    //Invalid tests
    @Test
    public void CreatePushWithOnlyTitle() throws Exception {
        createBroadcast.open();
        BroadcastDataForPush broadcast = new BroadcastDataForPush("15", "", "testPush", "", "", "");
        createBroadcast = createBroadcast.sendPush(broadcast);
        createBroadcast.assertError(error);
    }
}
