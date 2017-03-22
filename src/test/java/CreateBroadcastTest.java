import Data.BroadcastData;
import Data.UserData;
import Pages.CreateBroadcast;
import Pages.LoginPage;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by berestenko on 21.03.17.
 */
public class CreateBroadcastTest extends BasicTest{
    private CreateBroadcast createBroadcast = PageFactory.initElements(getWebDriver(), CreateBroadcast.class);


    @BeforeClass
    public static void Login() throws Exception {
        LoginPage loginPage = PageFactory.initElements(getWebDriver(),LoginPage.class);
        loginPage.open();
        UserData user = new UserData("sample", "sample1");
        loginPage.loginAs(user);

    }

    //Viber tests
    //Valid tests
    @Test
    public void CreateViber() throws Exception {
        createBroadcast.open();
        BroadcastData broadcast = new BroadcastData("15", "testPush", "Push", "http://hyber.dev", "Go to Hyber", "http://hyber.dev", "text for ios");
        createBroadcast = createBroadcast.sendViber(broadcast);

    }

    @Test
    public void CreateViberWithOnlyText() throws Exception {
        createBroadcast.open();
        BroadcastData broadcast = new BroadcastData("15", "testPush", "", "", "", "", "");
        createBroadcast = createBroadcast.sendViber(broadcast);
    }

    @Test
    public void CreateViberWithTextAndButton() throws Exception {
        createBroadcast.open();
        BroadcastData broadcast = new BroadcastData("15", "testPush", "", "http://hyber.dev", "Go to Hyber", "", "");
        createBroadcast = createBroadcast.sendViber(broadcast);
    }

    @Test
    public void CreateViberWithImageAndIostext() throws Exception {
        createBroadcast.open();
        BroadcastData broadcast = new BroadcastData("15", "", "", "", "", "http://hyber.dev", "text for ios");
        createBroadcast = createBroadcast.sendViber(broadcast);
    }

    @Test
    public void CreateViberWithTextAndIostext() throws Exception {
        createBroadcast.open();
        BroadcastData broadcast = new BroadcastData("15", "testPush", "", "", "", "", "text for ios");
        createBroadcast = createBroadcast.sendViber(broadcast);
    }




    //Invalid tests





//Push tests
    //Valid tests



    //Invalid tests



//SMS tests
    //Valid tests

    //Invalid tests

}