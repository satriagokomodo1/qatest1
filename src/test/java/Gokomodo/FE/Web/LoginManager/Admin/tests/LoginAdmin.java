package Gokomodo.FE.Web.LoginManager.Admin.tests;

import Gokomodo.FE.Web.LoginManager.Admin.pageObjects.initializePageObjects.AdminPageLoginInitializerBuyer;
import io.qameta.allure.Description;
import org.testng.annotations.Test;

public class LoginAdmin extends AdminPageLoginInitializerBuyer {

    @Description("Login Admin")
    @Test(description = "Login Arum")
    public void TestloginAdmin()throws Exception {
        LoginAdminPage().InputEmail().InputPassword().btnLogin();
    }

    @Description("Login Admin")
    @Test(description = "Login Denny1")
    public void TestloginAdmin2()throws Exception {
        LoginAdminDeny().InputEmail().InputPassword().btnLogin();
    }


}
