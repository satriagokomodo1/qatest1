package Gokomodo.BE.Rest.pageObjects.Product;

import Gokomodo.BE.Rest.controllers.RestBaseMethod;
import io.qameta.allure.Step;
import org.json.simple.parser.ParseException;

import java.io.IOException;

import static Gokomodo.BE.Rest.controllers.RestInitMethod.*;

public class CreateProduct extends RestBaseMethod {

    @Step("As a dev, I want to create a product")
    public CreateProduct postNewProduct() throws IOException, ParseException {
        setBaseURI(gokomodoBaseURI);
        httpPost(createProductLocation,contentType,productPath,getAccessToken());
        writeResponseBody(createProductResponseLocation);
        return this;
    }

    @Step("As a dev, I want to get the correct status code")
    public CreateProduct assertStatusCode() {
        assertStatusCode(201);
        return this;
    }

    @Step("As a dev, I want to get the correct response body")
    public CreateProduct assertBody() {
        assertBodyContain("Data");
        assertBodyContain("Message");
        return this;
    }

    @Step("As a dev, I want to get the correct content type")
    public CreateProduct assertContentType() {
        assertContentType(contentType);
        return this;
    }
}
