package Gokomodo.FE.Mobile.LoginManager.Seller.pageObjects.initializePageObjects;

import Gokomodo.FE.Mobile.LoginManager.Seller.pageObjects.pages.MobileSellerLoginPage;
import Gokomodo.FE.Mobile.Seller.controllers.MobileSellerBaseMethod;
import org.openqa.selenium.support.PageFactory;

public class MobileSellerPageLoginInitializerBuyer extends MobileSellerBaseMethod {

    public MobileSellerLoginPage LoginPageTest(){

        return PageFactory.initElements(getDriver(), MobileSellerLoginPage.class);
    }

}
