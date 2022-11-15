package Gokomodo.FE.Web.LoginManager.Admin.pageObjects.pages;

import Gokomodo.FE.Web.Buyer.utils.BuyerAllureAttachments;
import Gokomodo.FE.Web.LoginManager.Admin.pageObjects.initializePageObjects.AdminPageLoginInitializerBuyer;
import io.qameta.allure.Step;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.Base64;

public class AdminLoginCommerce1PageObject extends AdminPageLoginInitializerBuyer {

    @FindBy(xpath = "//body/div[@id='root']/div[1]/div[1]/div[1]/form[1]/div[1]/input[1]")
    private  WebElement txtLogin;
    @FindBy(xpath = "//body/div[@id='root']/div[1]/div[1]/div[1]/form[1]/div[2]/input[1]")
    private  WebElement pwdLogin;
    @FindBy(xpath = "//button[contains(text(),'Login')]")
    private WebElement btnLogin;
    String decryptData(String decrptData)
    {
        byte[] decodeBytes = Base64.getDecoder().decode(decrptData.getBytes());
        return(new String(decodeBytes));
    }
    @Step("As a user already input email")
    public AdminLoginCommerce1PageObject InputEmail() throws InterruptedException {
        Thread.sleep(1000);
        BuyerAllureAttachments.saveWebElement(getWebDriver(),txtLogin);
        highlightElement(txtLogin);
        txtLogin.sendKeys(decryptData(appConfig.getUserAdmin()));
        return this;
    }

    @Step("As a user already input password")
    public AdminLoginCommerce1PageObject InputPassword(){

        highlightElement(pwdLogin);
        pwdLogin.sendKeys(decryptData(appConfig.getPassAdmin()));
        return this;
    }

    @Step("As a user click button submit")
    public AdminLoginCommerce1PageObject btnLogin() throws InterruptedException {
        highlightElement(btnLogin);
        btnLogin.click();
        return this;
    }
}
