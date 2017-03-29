import Data.BroadcastDataForViber;
import Data.UserData;
import Pages.CreateBroadcastPage;
import Pages.LoginPage;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by berestenko on 21.03.17.
 */
public class CreateBroadcastForViberTest extends BasicTest{
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

//VIBER
    //Valid tests
    @Test
    public void CreateViber() throws Exception {
        createBroadcast.open();
        BroadcastDataForViber broadcast = new BroadcastDataForViber("15", "testViber", "http://hyber.dev", "Go to Hyber", "http://hyber.dev", "text for ios");
        createBroadcast = createBroadcast.sendViber(broadcast);
        createBroadcast.assertAlertTitle(successTitle);
        createBroadcast.assertAlertText(successText);


    }

    @Test
    public void CreateViberWithOnlyText() throws Exception {
        createBroadcast.open();
        BroadcastDataForViber broadcast = new BroadcastDataForViber("15", "testViber", "", "", "", "");
        createBroadcast = createBroadcast.sendViber(broadcast);
        createBroadcast.assertAlertTitle(successTitle);
        createBroadcast.assertAlertText(successText);
    }

    @Test
    public void CreateViberWithOnlyImage() throws Exception {
        createBroadcast.open();
        BroadcastDataForViber broadcast = new BroadcastDataForViber("15", "", "", "", "http://hyber.dev", "");
        createBroadcast = createBroadcast.sendViber(broadcast);
        createBroadcast.assertAlertTitle(successTitle);
        createBroadcast.assertAlertText(successText);
    }

    @Test
    public void CreateViberWithTextAndButton() throws Exception {
        createBroadcast.open();
        BroadcastDataForViber broadcast = new BroadcastDataForViber("15", "testViber", "http://hyber.dev", "Go to Hyber", "http://hyber.dev", "");
        createBroadcast = createBroadcast.sendViber(broadcast);
        createBroadcast.assertAlertTitle(successTitle);
        createBroadcast.assertAlertText(successText);
    }

    @Test
    public void CreateViberWithImageAndIostext() throws Exception {
        createBroadcast.open();
        BroadcastDataForViber broadcast = new BroadcastDataForViber("15", "", "", "", "http://hyber.dev", "text for ios");
        createBroadcast = createBroadcast.sendViber(broadcast);
        createBroadcast.assertAlertTitle(successTitle);
        createBroadcast.assertAlertText(successText);
    }

    @Test
    public void CreateViberWithTextAndIostext() throws Exception {
        createBroadcast.open();
        BroadcastDataForViber broadcast = new BroadcastDataForViber("15", "testPush", "", "", "", "text for ios");
        createBroadcast = createBroadcast.sendViber(broadcast);
        createBroadcast.assertAlertTitle(successTitle);
        createBroadcast.assertAlertText(successText);
    }


    //Invalid tests
    @Test
    public void CreateViberWithoutCaption() throws Exception {
        createBroadcast.open();
        BroadcastDataForViber broadcast = new BroadcastDataForViber("15", "", "http://hyber.dev", "", "", "");
        createBroadcast = createBroadcast.sendViber(broadcast);
        createBroadcast.assertError(error);
    }






//SMS tests
    //Valid tests

    //Invalid tests

}