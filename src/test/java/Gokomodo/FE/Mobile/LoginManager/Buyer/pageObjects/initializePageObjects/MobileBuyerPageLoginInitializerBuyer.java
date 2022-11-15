package Gokomodo.FE.Mobile.LoginManager.Buyer.pageObjects.initializePageObjects;

import Gokomodo.FE.Mobile.Buyer.controllers.MobileBuyerBaseMethod;
import Gokomodo.FE.Mobile.LoginManager.Buyer.pageObjects.pages.MobileBuyerLoginPage;

import org.openqa.selenium.support.PageFactory;

public class MobileBuyerPageLoginInitializerBuyer extends MobileBuyerBaseMethod {

    public MobileBuyerLoginPage LoginPageTest(){
        return PageFactory.initElements(getDriver(), MobileBuyerLoginPage.class);
    }

//    public MobileBuyerLoginPage LoginPageTest(){
//
//        return this.LoginPageTest();
//    }

}
