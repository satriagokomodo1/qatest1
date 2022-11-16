package Gokomodo.BE.Integration.Rest.tests;

import Gokomodo.BE.Integration.Rest.pageObjects.Auth.IntegrationLogin;
import Gokomodo.FE.Logger.Log;
import io.qameta.allure.Description;
import org.json.simple.parser.ParseException;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.IOException;
import java.lang.reflect.Method;

public class LoginTest {
    Test test;

    @BeforeMethod
    public void beforeMethod(Method method) {
        test = method.getAnnotation(Test.class);
        Log.info("===============================================");
        Log.info(test.description());
        Log.info("===============================================");
    }

    @Description("Login Authentication")
    @Test(description = "Rest API Test of Login Authentication", priority = 1)
    public void loginUser() throws IOException, ParseException {
        IntegrationLogin integrationLogin = new IntegrationLogin();
        integrationLogin.postAuthUserLogin().assertAuthStatusCode().assertAuthBody().assertAuthContentType();
    }
}
