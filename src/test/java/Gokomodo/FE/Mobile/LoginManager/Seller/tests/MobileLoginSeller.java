package Gokomodo.FE.Mobile.LoginManager.Seller.tests;

import Gokomodo.FE.Mobile.LoginManager.Seller.pageObjects.initializePageObjects.MobileSellerPageLoginInitializerBuyer;
import Gokomodo.FE.Mobile.LoginManager.Seller.pageObjects.pages.MobileSellerLoginPage;
import io.qameta.allure.Description;
import org.testng.annotations.Test;


public class MobileLoginSeller extends MobileSellerPageLoginInitializerBuyer {

    MobileSellerLoginPage mobileSellerLoginPage;

    @Description("Login Test")
    @Test(description = "Mobile seller login test")
    public void mobileSellerLogin() {
        mobileSellerLoginPage = new MobileSellerLoginPage();
        mobileSellerLoginPage.InputEmail().InputPassword().pressLoginButton();
//                .goToActivityPage().clickTrackButton();
    }
}
