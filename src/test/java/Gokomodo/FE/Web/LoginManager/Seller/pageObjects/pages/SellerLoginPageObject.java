package Gokomodo.FE.Web.LoginManager.Seller.pageObjects.pages;

import Gokomodo.FE.Web.Buyer.utils.BuyerAllureAttachments;
import Gokomodo.FE.Web.LoginManager.Seller.pageObjects.initializePageObjects.SellerPageLoginInitializer;
import io.qameta.allure.Step;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.Base64;

public class SellerLoginPageObject extends SellerPageLoginInitializer {

    @FindBy(xpath = "/html/body/div/div/main/div/div/div[1]/div[2]/form/div[1]/input")
    private  WebElement txtLogin;
    @FindBy(xpath = "/html/body/div/div/main/div/div/div[1]/div[2]/form/div[2]/div/input")
    private  WebElement pwdLogin;
    @FindBy(xpath = "/html/body/div/div/main/div/div/div[1]/div[2]/form/div[3]/button")
    private WebElement btnLogin;
    String decryptData(String decrptData)
    {
        byte[] decodeBytes = Base64.getDecoder().decode(decrptData.getBytes());
        return(new String(decodeBytes));
    }
    @Step("As a user already input email")
    public SellerLoginPageObject InputEmail() throws InterruptedException {
        Thread.sleep(1000);
        BuyerAllureAttachments.saveWebElement(getWebDriver(),txtLogin);
        highlightElement(txtLogin);
        txtLogin.sendKeys(decryptData(appConfig.getUsrSeller()));
        return this;
    }

    @Step("As a user already input password")
    public SellerLoginPageObject InputPassword(){

        highlightElement(pwdLogin);
        pwdLogin.sendKeys(decryptData(appConfig.getPwdSeller()));
        return this;
    }

    @Step("As a user click button submit")
    public SellerLoginPageObject btnLogin(){
        highlightElement(btnLogin);
        btnLogin.click();
        return this;
    }

}
