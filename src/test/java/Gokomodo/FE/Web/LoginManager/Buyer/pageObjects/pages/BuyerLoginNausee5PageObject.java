package Gokomodo.FE.Web.LoginManager.Buyer.pageObjects.pages;

import Gokomodo.FE.Web.Buyer.utils.BuyerAllureAttachments;
import Gokomodo.FE.Web.LoginManager.Buyer.pageObjects.initializePageObjects.BuyerPageLoginInitializerBuyer;
import io.qameta.allure.Step;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.Base64;

public class BuyerLoginNausee5PageObject extends BuyerPageLoginInitializerBuyer {

    @FindBy(id = "email-login")
    private  WebElement txtLogin;
    @FindBy(id = "password-login")
    private  WebElement pwdLogin;
    @FindBy(id = "submit-login")
    private WebElement btnLogin;
    String decryptData(String decrptData)
    {
        byte[] decodeBytes = Base64.getDecoder().decode(decrptData.getBytes());
        return(new String(decodeBytes));
    }
    @Step("As a user already input email")
    public BuyerLoginNausee5PageObject InputEmail() throws InterruptedException {
        Thread.sleep(1000);
        BuyerAllureAttachments.saveWebElement(getWebDriver(),txtLogin);
        highlightElement(txtLogin);
        txtLogin.sendKeys(decryptData(appConfig.getUserNausee5()));
        return this;
    }

    @Step("As a user already input password")
    public BuyerLoginNausee5PageObject InputPassword(){

        highlightElement(pwdLogin);
        pwdLogin.sendKeys(decryptData(appConfig.getPasswordAccount()));
        return this;
    }

    @Step("As a user click button submit")
    public BuyerLoginNausee5PageObject btnLogin(){
        highlightElement(btnLogin);
        btnLogin.click();
        return this;
    }
}
