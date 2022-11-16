package Gokomodo.BE.Integration.Rest.pageObjects.Auth;

import Gokomodo.BE.Rest.controllers.IntegrationBaseMethod;
import io.qameta.allure.Step;
import org.json.simple.parser.ParseException;

import java.io.IOException;

import static Gokomodo.BE.Rest.controllers.RestInitMethod.*;

public class IntegrationLogin extends IntegrationBaseMethod {

    @Step("As a dev, I input login credential")
    public IntegrationLogin postAuthUserLogin() throws IOException, ParseException {
        setBaseURI(integrationBaseURI);
        httpPost(integrationAuthLoginTestDataLocation,jsonContentType,integrationAuthLoginPath);
        writeResponseBody(integrationAuthLoginResponseFileLocation);
        return this;
    }

    @Step("As a dev, I want to get the correct status code")
    public IntegrationLogin assertAuthStatusCode() {
        assertStatusCode(200);
        return this;
    }

    @Step("As a dev, I want to get the correct response body")
    public IntegrationLogin assertAuthBody() throws IOException, ParseException {
        jsonSchemaCheck(integrationAuthLoginResponseFileLocation,integrationAuthLoginSchemaLocation);
        return this;
    }

    @Step("As a dev, I want to get the correct content type")
    public IntegrationLogin assertAuthContentType() {
        assertContentType(jsonContentType);
        return this;
    }
}
