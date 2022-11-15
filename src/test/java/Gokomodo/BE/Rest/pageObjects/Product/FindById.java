package Gokomodo.BE.Rest.pageObjects.Product;

import Gokomodo.BE.Rest.controllers.RestBaseMethod;
import io.qameta.allure.Step;
import org.json.simple.parser.ParseException;

import java.io.IOException;

import static Gokomodo.BE.Rest.controllers.RestInitMethod.*;

public class FindById extends RestBaseMethod {

    @Step("As a dev, I input login credential")
    public FindById findProductByID() throws IOException, ParseException {
        setBaseURI(gokomodoBaseURI);
        httpGet(productPath + "/" + getID(createProductResponseLocation) , getAccessToken());
        return this;
    }

    @Step("As a dev, I want to get the correct status code")
    public FindById assertStatusCode() {
        assertStatusCode(200);
        return this;
    }

    @Step("As a dev, I want to get the correct response body")
    public FindById assertBody() {
        assertBodyContain("ID");
        assertBodyContain("Code");
        assertBodyContain("Name");
        assertBodyContain("Category");
        assertBodyContain("BasePrice");
        assertBodyContain("LastUpdatedBy");
        assertBodyContain("Variants");
        assertBodyContain("UpdatedAt");
        return this;
    }

    @Step("As a dev, I want to get the correct content type")
    public FindById assertContentType() {
        assertContentType(contentType);
        return this;
    }
}
