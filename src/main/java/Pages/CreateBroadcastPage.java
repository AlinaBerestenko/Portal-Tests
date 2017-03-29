package Pages;

import Data.BroadcastDataForPush;
import Data.BroadcastDataForViber;
import Utils.Config;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static org.junit.Assert.assertEquals;

/**
 * Created by berestenko on 20.03.17.
 */
public class CreateBroadcastPage extends Page {
    public CreateBroadcastPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public void open() {
        driver.get(Config.getProperty("portal_url_create"));
        waitForLoadingPage();
    }


    //Creating WINDOW

    //VIBER SETTINGS
    @FindBy(id = "message_delivery_viber")
    public WebElement viberCheckbox;

    @FindBy(id = "message_delivery_ttlViber")
    public WebElement viberTTL;

    @FindBy(id = "message_delivery_textViber")
    public WebElement viberText;

    @FindBy(id = "message_delivery_viberActionUrl")
    public WebElement viberActionUrl;

    @FindBy(id = "message_delivery_viberCaption")
    public WebElement viberCaption;

    @FindBy(id = "message_delivery_viberImageUrl")
    public WebElement viberImageUrl;

    @FindBy(id = "message_delivery_iosExpirityText")
    public WebElement viberiosExpirityText;



    //PUSH SETTINGS

    @FindBy(id = "message_delivery_push")
    public WebElement pushCheckbox;

    @FindBy(id = "message_delivery_ttlPush")
    public WebElement pushTTL;

    @FindBy(id = "message_delivery_textPush")
    public WebElement pushText;

    @FindBy(id = "message_delivery_pushTitle")
    public WebElement pushTitle;

    @FindBy(id = "message_delivery_pushActionUrl")
    public WebElement pushActionUrl;

    @FindBy(id = "message_delivery_pushCaption")
    public WebElement pushCaption;

    @FindBy(id = "message_delivery_pushImageUrl")
    public WebElement pushImageUrl;



    //SMS SETTINGS
    @FindBy(id = "message_delivery_sms")
    public WebElement smsCheckbox;

    @FindBy(id = "message_delivery_ttlSms")
    public WebElement smsTTL;

    @FindBy(id = "message_delivery_textSms")
    public WebElement smsText;

    @FindBy(id = "message_delivery_alphaName")
    public WebElement smsAlphaNames;



    //GENERAL SETTINGS
    @FindBy(id = "message_delivery_text")
    public WebElement generalText;

    @FindBy(id = "message_delivery_startTime")
    public WebElement startTime;

    @FindBy(id = "message_delivery_phone_number")
    public WebElement phoneNumber;

    @FindBy(id = "message_delivery_tag")
    public WebElement tag;

    @FindBy(css = ".btn.btn-primary.pull-right")
    public WebElement createButton;

    //ALERT

    @FindBy(css =".ui-pnotify-title")
    public WebElement alertTitle;

    @FindBy(css = ".ui-pnotify-text")
    public WebElement alertText;

    //Errors
    @FindBy(css = "ul.list-unstyled.help-block>li")
    public WebElement errorText;


    public CreateBroadcastPage sendPush(BroadcastDataForPush broadcast){
        waitForLoadingPage();
        pushCheckbox.click();
        pushTTL.click();
        type(pushTTL, broadcast.getTTL());
        pushText.click();
        type(pushText, broadcast.getText());
        pushTitle.click();
        type(pushTitle, broadcast.getTitle());
        pushActionUrl.click();
        type(pushActionUrl, broadcast.getActionUrl());
        pushCaption.click();
        type(pushCaption, broadcast.getCaption());
        pushImageUrl.click();
        type(pushImageUrl, broadcast.getImageUrl());

        scrollToBottom();
        phoneNumber.click();
        type(phoneNumber, "380635394010");

        createButton.click();
        waitForLoadingPage();

        return PageFactory.initElements(driver, CreateBroadcastPage.class);
    }

    public CreateBroadcastPage sendViber(BroadcastDataForViber broadcast){
        waitForLoadingPage();
        viberCheckbox.click();
        viberTTL.click();
        type(viberTTL, broadcast.getTTL());
        viberText.click();
        type(viberText, broadcast.getText());
        viberActionUrl.click();
        type(viberActionUrl, broadcast.getActionUrl());
        viberCaption.click();
        type(viberCaption, broadcast.getCaption());
        viberImageUrl.click();
        type(viberImageUrl, broadcast.getImageUrl());
        viberiosExpirityText.click();
        type(viberiosExpirityText, broadcast.getIosExpirityText());

        scrollToBottom();
        phoneNumber.click();
        type(phoneNumber, "380635394010");

        createButton.click();
        waitForLoadingPage();
        return PageFactory.initElements(driver, CreateBroadcastPage.class);
    }



    public CreateBroadcastPage sendSms(BroadcastDataForPush broadcast){
        smsCheckbox.click();
        smsTTL.click();
        type(smsTTL, broadcast.getTTL());
        smsText.click();
        type(smsText, broadcast.getText());
        smsAlphaNames.click();
        //WRITE CHOOSING NAME FROM LIST

        scrollToBottom();
        phoneNumber.click();
        type(phoneNumber, "380635394010");

        createButton.click();

        return PageFactory.initElements(driver, CreateBroadcastPage.class);

    }

    public CreateBroadcastPage assertAlertText(String text){
        assertEquals(text, alertText.getText());
        return PageFactory.initElements(driver, CreateBroadcastPage.class);
    }

    public CreateBroadcastPage assertAlertTitle(String title){
        assertEquals(title, alertTitle.getText());
        return PageFactory.initElements(driver, CreateBroadcastPage.class);
    }

    public CreateBroadcastPage assertError(String text){
        assertEquals(text, errorText.getText());
        return PageFactory.initElements(driver, CreateBroadcastPage.class);
    }




}

