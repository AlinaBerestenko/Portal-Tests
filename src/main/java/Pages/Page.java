package Pages;

/**
 * Created by berestenko on 02.03.17.
 */
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public abstract class Page {

    protected WebDriver driver;

    public Page(WebDriver driver) {
        this.driver = driver;
    }

    public void type(WebElement webElement, String text){
        webElement.clear();
        webElement.sendKeys(text);
    }

    public abstract void open();

    public boolean isElementPresent(WebElement element){
        try{
            element.isDisplayed();
            return true;
        } catch (NoSuchElementException e){
            return false;
        }
    }

}
