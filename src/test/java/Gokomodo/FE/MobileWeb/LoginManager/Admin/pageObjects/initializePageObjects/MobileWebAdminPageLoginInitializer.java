package Gokomodo.FE.MobileWeb.LoginManager.Admin.pageObjects.initializePageObjects;

import Gokomodo.FE.MobileWeb.Admin.controllers.MobileWebAdminBaseMethod;
import Gokomodo.FE.MobileWeb.LoginManager.Admin.pageObjects.MobileWebAdminLoginPage;
import org.openqa.selenium.support.PageFactory;

public class MobileWebAdminPageLoginInitializer extends MobileWebAdminBaseMethod {

    public MobileWebAdminLoginPage LoginPageTest(){

        return PageFactory.initElements(getDriver(), MobileWebAdminLoginPage.class);
    }

}
