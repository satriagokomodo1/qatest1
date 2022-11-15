package Gokomodo.BE.Rest.pageObjects.Auth;

import Gokomodo.BE.Rest.controllers.RestBaseMethod;
import io.qameta.allure.Step;
import org.json.simple.parser.ParseException;

import java.io.IOException;

import static Gokomodo.BE.Rest.controllers.RestInitMethod.*;

public class Login extends RestBaseMethod {

    @Step("As a dev, I input login credential")
    public Login postAuthUserLogin() throws IOException, ParseException {
        setBaseURI(gokomodoBaseURI);
        httpPost(authLoginTestDataLocation,contentType,authLoginPath);
        writeResponseBody(tokenFileLocation);
        return this;
    }

    @Step("As a dev, I want to get the correct status code")
    public Login assertAuthStatusCode() {
        assertStatusCode(200);
        return this;
    }

    @Step("As a dev, I want to get the correct response body")
    public Login assertAuthBody() {
        assertBodyContain("AccessToken");
        assertBodyContain("RefreshToken");
        return this;
    }

    @Step("As a dev, I want to get the correct content type")
    public Login assertAuthContentType() {
        assertContentType(contentType);
        return this;
    }
}
