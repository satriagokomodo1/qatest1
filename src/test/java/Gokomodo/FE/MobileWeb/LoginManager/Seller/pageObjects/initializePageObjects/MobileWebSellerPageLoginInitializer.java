package Gokomodo.FE.MobileWeb.LoginManager.Seller.pageObjects.initializePageObjects;

import Gokomodo.FE.MobileWeb.LoginManager.Seller.pageObjects.pages.MobileWebSellerLoginPage;
import Gokomodo.FE.MobileWeb.Seller.controllers.MobileWebSellerBaseMethod;
import org.openqa.selenium.support.PageFactory;

public class MobileWebSellerPageLoginInitializer extends MobileWebSellerBaseMethod {

    public MobileWebSellerLoginPage LoginPageTest(){

        return PageFactory.initElements(getDriver(), MobileWebSellerLoginPage.class);
    }

}
