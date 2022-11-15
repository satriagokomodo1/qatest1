package Gokomodo.BE.Rest.pageObjects.Partner;

import Gokomodo.BE.Rest.controllers.RestBaseMethod;
import Gokomodo.BE.Rest.pageObjects.Product.CreateProduct;
import io.qameta.allure.Step;
import org.json.simple.parser.ParseException;

import java.io.IOException;

import static Gokomodo.BE.Rest.controllers.RestInitMethod.*;
import static Gokomodo.BE.Rest.controllers.RestInitMethod.contentType;

public class CreatePartner extends RestBaseMethod {

    @Step("As a dev, I want to create a partner")
    public CreatePartner postNewPartner() throws IOException, ParseException {
        setBaseURI(gokomodoBaseURI);
        httpPost(createPartnerLocation,contentType,partnerPath,getAccessToken());
        writeResponseBody(createPartnerResponseLocation);
        return this;
    }

    @Step("As a dev, I want to get the correct status code")
    public CreatePartner assertStatusCode() {
        assertStatusCode(201);
        return this;
    }

    @Step("As a dev, I want to get the correct response body")
    public CreatePartner assertBody() {
        assertBodyContain("Data");
        assertBodyContain("Message");
        return this;
    }

    @Step("As a dev, I want to get the correct content type")
    public CreatePartner assertContentType() {
        assertContentType(contentType);
        return this;
    }
}
