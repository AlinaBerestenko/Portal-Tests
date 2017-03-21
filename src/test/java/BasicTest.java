import Utils.Config;
import org.junit.After;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;



/**
 * Created by berestenko on 03.03.17.
 */
public class BasicTest {
    protected static WebDriver driver;

    protected static WebDriver getWebDriver() {
        if (driver == null) {
//          if you need to test in FF
          System.setProperty("webdriver.gecko.driver","/home/berestenko/Desktop/geckodriver");
          driver = new FirefoxDriver();
          driver.manage().window().maximize();

//          if you need to test in Chrome
//         System.setProperty("webdriver.chrome.driver", Config.getProperty("url_to_driver"));
//            driver = new ChromeDriver();
        }
        return driver;
    }

    @After
    public void LastTest() throws Exception {
        driver.close();
    }
}
