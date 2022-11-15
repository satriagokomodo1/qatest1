package Gokomodo.FE.MobileWeb.LoginManager.Admin.pageObjects;

import Gokomodo.FE.MobileWeb.Admin.controllers.MobileWebAdminBaseMethod;
import io.qameta.allure.Step;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.Base64;

import static Gokomodo.FE.MobileWeb.Admin.controllers.MobileWebAdminInitMethod.*;

public class MobileWebAdminLoginPage extends MobileWebAdminBaseMethod {

    @FindBy(xpath = "//input[@name='email']")
    private WebElement txtLogin;
    @FindBy(xpath = "//input[@name='password']")
    private WebElement pwdLogin;
    @FindBy(xpath = "//button[@type='submit']")
    private WebElement btnLogin;

    String decryptData(String decrptData)
    {
        byte[] decodeBytes = Base64.getDecoder().decode(decrptData.getBytes());
        return(new String(decodeBytes));
    }

    @Step("As a user already input email")
    public MobileWebAdminLoginPage InputEmail(){
        highlightElement(txtLogin);
        clear(txtLogin);
        sendKeys(txtLogin,decryptData(Usradmin));
        return this;
    }

    @Step("As a user already input password")
    public MobileWebAdminLoginPage InputPassword(){
        highlightElement(pwdLogin);
        clear(pwdLogin);
        sendKeys(pwdLogin,decryptData(PasswordAccount));

        return this;
    }

    @Step("As a user click button submit")
    public MobileWebAdminLoginPage pressLoginButton(){
        highlightElement(btnLogin);
        click(btnLogin);
        return this;
    }

    public MobileWebAdminLoginPage login(String username, String password) {
        InputEmail();
        InputPassword();
        return pressLoginButton();
    }


}
