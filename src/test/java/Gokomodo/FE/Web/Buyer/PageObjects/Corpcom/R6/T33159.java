package Gokomodo.FE.Web.Buyer.PageObjects.Corpcom.R6;

import Gokomodo.FE.Web.Buyer.controllers.BuyerInitMethod;
import Gokomodo.FE.Web.Buyer.controllers.BuyerWebDriverFactory;
import Gokomodo.FE.Web.LoginManager.Buyer.pageObjects.pages.BuyerLoginCommerce1PageObject;
import Gokomodo.FE.Web.Seller.utils.AllureAttachments;
import io.qameta.allure.Step;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.Base64;

public class T33159 extends BuyerLoginCommerce1PageObject {
    //============== Login ==================//
    @FindBy(xpath = "//body/div[@id='root']/div[1]/main[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/form[1]/div[1]/input[1]")
    private WebElement inputEmail;
    @FindBy(xpath = "//body/div[@id='root']/div[1]/main[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/form[1]/div[2]/div[1]/input[1]")
    private WebElement inputPassword;
    @FindBy(xpath = "//button[contains(text(),'Masuk')]")
    private WebElement btnLoginCorpcom;
    //============== Step ==================//
    @FindBy(id = "react-select-2-input")
    private WebElement SearchProduct;

    @FindBy(xpath = "//img[@class='img-fluid css-l4fru9']") //Firefox
    //@FindBy(xpath = "//body/div[@id='root']/div[1]/main[1]/div[1]/div[1]/div[1]/div[1]/div[4]/button[1]") //Chrome
    private WebElement chooseprd;

    @FindBy(xpath = "/html/body/div[1]/div/main/div[1]/div/div/div[1]/div[1]/div[1]")
    private WebElement detailsproduct;

    @FindBy(xpath = "/html/body/div[1]/div/main/div[1]/div/div/div[1]/div[1]/div[1]/div/img")
    private WebElement clkprd;
    @FindBy(xpath = "/html/body/div[3]/div/div[1]/div/div")
    private WebElement Popupdetails;


    String decryptData(String decrptData) {
        byte[] decodeBytes = Base64.getDecoder().decode(decrptData.getBytes());
        return (new String(decodeBytes));
    }
        @Step("As a user already input email")
        public T33159 InputEmail() throws InterruptedException {
            Thread.sleep(1000);
            highlightElement(inputEmail);
            inputEmail.sendKeys(decryptData(BuyerInitMethod.appConfig.getUserCommerce1()));
            return this;
        }

        @Step("As a user already input password")
        public T33159 InputPassword() {
            highlightElement(inputPassword);
            inputPassword.sendKeys(decryptData(BuyerInitMethod.appConfig.getPasswordAccount()));
            return this;
        }

        @Step("As a user click button login")
        public T33159 BtnLoginCorp() throws InterruptedException {
            highlightElement(btnLoginCorpcom);
            btnLoginCorpcom.click();
            Thread.sleep(5000);
            return this;
        }
         @Step("As a user search product")
         public T33159 searchPrd() throws InterruptedException {
            highlightElement(SearchProduct);
             AllureAttachments.saveWebElement(BuyerWebDriverFactory.getWebDriver(), SearchProduct);
             SearchProduct.sendKeys("Pelumas", Keys.ENTER);
            Thread.sleep(5000);
            return this;
        }
        @Step("As a user click product")
        public T33159 ChsPrd() throws InterruptedException {
            highlightElement(chooseprd);
            AllureAttachments.saveWebElement(BuyerWebDriverFactory.getWebDriver(), chooseprd);
            chooseprd.click();
            Thread.sleep(5000);
            return this;
        }
        @Step("As a user want to click brand product")
        public T33159 clickprd() {
            highlightElement(clkprd);
            AllureAttachments.saveWebElement(BuyerWebDriverFactory.getWebDriver(), clkprd);
            clkprd.click();
            return this;
        }
        @Step ("T33159 -  the Buyer should be able to filter products based on the brand")
          public T33159 evidenceT33159(){
                highlightElement(Popupdetails);
                AllureAttachments.saveWebElement(BuyerWebDriverFactory.getWebDriver(), Popupdetails);
                return this;


    }
}
