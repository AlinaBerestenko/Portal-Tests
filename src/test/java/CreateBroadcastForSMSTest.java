import Data.BroadcastDataForPush;
import Data.BroadcastDataForSMS;
import Data.UserData;
import Pages.CreateBroadcastPage;
import Pages.LoginPage;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by berestenko on 29.03.17.
 */
public class CreateBroadcastForSMSTest extends BasicTest{

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

    //SMS tests
    //Valid test
    @Test
    public void CreateSMS() throws Exception {
        createBroadcast.open();
        BroadcastDataForSMS broadcast = new BroadcastDataForSMS("15", "testPush", "GMSU");
        createBroadcast = createBroadcast.sendSms(broadcast);
        createBroadcast.assertAlertTitle(successTitle);
        createBroadcast.assertAlertText(successText);
    }

    //Invalid tests
    @Test
    public void CreateSMSWithoutAlphaName() throws Exception {
        createBroadcast.open();
        BroadcastDataForSMS broadcast = new BroadcastDataForSMS("15", "testPush", "");
        createBroadcast = createBroadcast.sendSms(broadcast);
        createBroadcast.assertError(error);
    }

    @Test
    public void CreateSMSWithoutText() throws Exception {
        createBroadcast.open();
        BroadcastDataForSMS broadcast = new BroadcastDataForSMS("15", "", "GMSU");
        createBroadcast = createBroadcast.sendSms(broadcast);
        createBroadcast.assertError(error);
    }

}
