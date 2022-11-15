package Gokomodo.FE.Mobile.LoginManager.Buyer.tests;

import Gokomodo.FE.Mobile.LoginManager.Buyer.pageObjects.initializePageObjects.MobileBuyerPageLoginInitializerBuyer;
import Gokomodo.FE.Mobile.LoginManager.Buyer.pageObjects.pages.MobileBuyerLoginPage;
import io.qameta.allure.Description;
import org.testng.annotations.Test;


public class MobileLoginBuyer extends MobileBuyerPageLoginInitializerBuyer {

    MobileBuyerLoginPage mobileBuyerLoginPage;


    @Description("Login Test")
    @Test(description = "Mobile buyer login test")
    public void mobileBuyerLogin() {
        mobileBuyerLoginPage = new MobileBuyerLoginPage();
        mobileBuyerLoginPage.InputEmail().InputPassword().pressLoginButton();
//                .goToActivityPage().clickTrackButton();
    }


}
