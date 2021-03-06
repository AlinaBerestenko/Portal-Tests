import Utils.Config;
import org.junit.After;
import org.junit.AfterClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


import java.util.concurrent.TimeUnit;


/**
 * Created by berestenko on 03.03.17.
 */
public class BasicTest {
    protected static WebDriver driver;

    protected static WebDriver getWebDriver() {
        if (driver == null) {
//          if you need to test in FF

          System.setProperty("webdriver.gecko.driver", Config.getProperty("url_to_driver"));
          driver = new FirefoxDriver();
//          driver.manage().window().maximize();

//          if you need to test in Chrome

//         System.setProperty("webdriver.chrome.driver", Config.getProperty("url_to_driver"));
//            driver = new ChromeDriver();
            //driver.manage().window().maximize();
         }
        return driver;
    }


    @AfterClass
    public static void LastClass() throws Exception {
        driver.quit();
    }
}
