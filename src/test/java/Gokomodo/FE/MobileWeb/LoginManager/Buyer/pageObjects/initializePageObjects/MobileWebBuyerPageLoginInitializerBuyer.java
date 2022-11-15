package Gokomodo.FE.MobileWeb.LoginManager.Buyer.pageObjects.initializePageObjects;

import Gokomodo.FE.MobileWeb.Buyer.controllers.MobileWebBuyerBaseMethod;
import Gokomodo.FE.MobileWeb.LoginManager.Buyer.pageObjects.pages.MobileWebBuyerLoginPage;
import org.openqa.selenium.support.PageFactory;
public class MobileWebBuyerPageLoginInitializerBuyer extends MobileWebBuyerBaseMethod {

    public MobileWebBuyerLoginPage LoginPageTest(){

        return PageFactory.initElements(getDriver(), MobileWebBuyerLoginPage.class);
    }

}
