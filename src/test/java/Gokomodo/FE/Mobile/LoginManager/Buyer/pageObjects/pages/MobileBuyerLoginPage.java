package Gokomodo.FE.Mobile.LoginManager.Buyer.pageObjects.pages;

import Gokomodo.FE.Mobile.Buyer.controllers.MobileBuyerBaseMethod;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import io.qameta.allure.Step;
import org.openqa.selenium.WebElement;
import java.util.Base64;

import static Gokomodo.FE.Mobile.Buyer.controllers.MobileBuyerInitMethod.*;

public class MobileBuyerLoginPage extends MobileBuyerBaseMethod {

    @AndroidFindBy(xpath = "//*[@resource-id='email-login']")
    @iOSXCUITFindBy(xpath = "//*[@name='login-input-email']")
    private WebElement txtLogin;
    @AndroidFindBy(xpath = "//*[@resource-id='password-login']")
    @iOSXCUITFindBy(xpath = "//*[@name='login-input-password']")
    private WebElement pwdLogin;
    @AndroidFindBy(xpath = "//*[@resource-id='submit-login']")
    @iOSXCUITFindBy(xpath = "//*[@name='submit-login']")
    private WebElement btnLogin;

    @AndroidFindBy(xpath = "//*[@resource-id = 'bottombar-activity']")
    @iOSXCUITFindBy(xpath = "//*[@name='Activity, tab, 2 of 5']")
    private WebElement activityTab;

    @AndroidFindBy(xpath = "//*[@resource-id = 'submit-logistic-tracking']")
    @iOSXCUITFindBy(xpath = "//*[@name='submit-track']")
    private WebElement trackButton;

    String decryptData(String decrptData)
    {
        byte[] decodeBytes = Base64.getDecoder().decode(decrptData.getBytes());
        return(new String(decodeBytes));
    }

    @Step("As a user already input email")
    public MobileBuyerLoginPage InputEmail(){
        clear(txtLogin);
        sendKeys(txtLogin,decryptData(Usrnauseee1));
        return this;
    }

    @Step("As a user already input password")
    public MobileBuyerLoginPage InputPassword(){
        clear(pwdLogin);
        sendKeys(pwdLogin,decryptData(PasswordAccount));
        return this;
    }

    @Step("As a user click button submit")

    public MobileBuyerLoginPage pressLoginButton(){
        click(btnLogin);
        return this;
    }

    @Step("As a user I want to see Activity Page")
    public MobileBuyerLoginPage goToActivityPage() {
        click(activityTab);
        return this;
    }

    @Step("As a user I want to Track my order")
    public MobileBuyerLoginPage clickTrackButton () {
            scrollToElement(trackButton,"down");
            click(trackButton);
            return this;
    }


}
