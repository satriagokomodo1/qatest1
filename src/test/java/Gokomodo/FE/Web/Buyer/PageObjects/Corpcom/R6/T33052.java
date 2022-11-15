package Gokomodo.FE.Web.Buyer.PageObjects.Corpcom.R6;


import Gokomodo.FE.Web.Buyer.controllers.BuyerInitMethod;
import Gokomodo.FE.Web.Buyer.controllers.BuyerWebDriverFactory;
import Gokomodo.FE.Web.LoginManager.Buyer.pageObjects.pages.BuyerLoginCommerce1PageObject;
import Gokomodo.FE.Web.Seller.utils.AllureAttachments;
import io.qameta.allure.Step;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.Base64;

public class T33052 extends BuyerLoginCommerce1PageObject {

    //============== Login ==================//
    @FindBy(xpath = "//body/div[@id='root']/div[1]/main[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/form[1]/div[1]/input[1]")
    private WebElement inputEmail;
    @FindBy(xpath = "//body/div[@id='root']/div[1]/main[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/form[1]/div[2]/div[1]/input[1]")
    private WebElement inputPassword;
    @FindBy(xpath = "//button[contains(text(),'Masuk')]")
    private WebElement btnLoginCorpcom;

    String decryptData(String decrptData) {
        byte[] decodeBytes = Base64.getDecoder().decode(decrptData.getBytes());
        return (new String(decodeBytes));
    }

    //========================================//

    //=======================================//

    @FindBy(xpath = "/html/body/div[1]/div/main/div/div/div/div[1]/div[3]/div[2]/img")
    private WebElement clickLogoRFQ;

    @FindBy(xpath = "/html/body/div[1]/div/main/div/div[3]/div[1]/div/div[1]/div/div[2]/input")
    private WebElement inputRFQName;
    //
    @FindBy(xpath = "/html/body/div[1]/div/main/div/div[3]/table/tbody/tr/td[1]")
    private WebElement clickTheRFQName;
    @FindBy(xpath = "/html/body/div[1]/div/main/div/div[1]/div[2]/div/div/div[2]/div/span/button")
    private WebElement clickActionbtn;


    //=======================================//

    //============ test ====================//

    @Step("As a user already input email")
    public T33052 InputEmail() throws InterruptedException {
        Thread.sleep(1000);
        highlightElement(inputEmail);
        inputEmail.sendKeys(decryptData(BuyerInitMethod.appConfig.getUserCommerce1()));
        return this;
    }

    @Step("As a user already input password")
    public T33052 InputPassword() {
        highlightElement(inputPassword);
        inputPassword.sendKeys(decryptData(BuyerInitMethod.appConfig.getPasswordAccount()));
        return this;
    }

    @Step("As a user click button login")
    public T33052 BtnLoginCorp() throws InterruptedException {
        highlightElement(btnLoginCorpcom);
        btnLoginCorpcom.click();
        Thread.sleep(5000);
        return this;
    }

    @Step("As a user click RFQ Icon")
    public T33052 clickLogoRFQBtnCorpcomm() {
        highlightElement(clickLogoRFQ);
        clickLogoRFQ.click();
        return this;
    }

    @Step("As a user Input RFQ name RFQ/2022/09/135")
    public T33052 inputRFQNameCorpcomm() {
        highlightElement(inputRFQName);
        inputRFQName.sendKeys("RFQ/2022/09/135");
        return this;
    }

    @Step("As a user click The RFQ Choosen")
    public T33052 clickTheRFQNameCorpcomm() {
        highlightElement(clickTheRFQName);
        clickTheRFQName.click();
        return this;
    }

    @Step("As a user click The RFQ Choosen")
    public T33052 clickActionbtnCorpcomm() throws Exception {
        highlightElement(clickActionbtn);
        clickActionbtn.click();
        Thread.sleep(3000);
        AllureAttachments.saveWebElement(BuyerWebDriverFactory.getWebDriver(), clickActionbtn);
        Thread.sleep(3000);
        robotScreenCapture("ExpectedT33052");
        return this;
    }


}
