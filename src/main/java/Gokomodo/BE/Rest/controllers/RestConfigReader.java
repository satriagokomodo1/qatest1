package Gokomodo.BE.Rest.controllers;

import ru.qatools.properties.Property;
import ru.qatools.properties.PropertyLoader;
import ru.qatools.properties.Resource;

@Resource.Classpath("RestConfig.properties")
public class RestConfigReader {

    public RestConfigReader()
    {
        PropertyLoader.newInstance().populate(this);
    }


    // Get value from RestConfig.properties
    @Property(value = "RetailBaseURI")
    private String RetailBaseURI;

    @Property(value = "RetailAccessControlPath")
    private String RetailAccessControlPath;

    @Property(value = "RetailAuthLoginPath")
    private String RetailAuthLoginPath;

    @Property(value = "JSONContentType")
    private String JSONContentType;

    @Property(value = "RetailAuthLoginTestDataLocation")
    private String RetailAuthLoginTestDataLocation;

    @Property(value = "RetailTokenFileLocation")
    private String RetailTokenFileLocation;

    @Property(value = "RetailCreateProductLocation")
    private String RetailCreateProductLocation;

    @Property(value = "RetailProductPath")
    private String RetailProductPath;

    @Property(value = "RetailCreateProductResponseLocation")
    private String RetailCreateProductResponseLocation;

    @Property(value = "RetailPartnerPath")
    private String RetailPartnerPath;

    @Property(value = "RetailCreatePartnerLocation")
    private String RetailCreatePartnerLocation;

    @Property(value = "RetailCreatePartnerResponseLocation")
    private String RetailCreatePartnerResponseLocation;

    @Property(value = "IntegrationBaseURI")
    private String IntegrationBaseURI;
    protected String getIntegrationBaseURI() {return IntegrationBaseURI;}

    @Property(value = "IntegrationAuthLoginPath")
    private String IntegrationAuthLoginPath;
    protected String getIntegrationAuthLoginPath() {return IntegrationAuthLoginPath;}

    @Property(value = "IntegrationAuthLoginTestDataLocation")
    private String IntegrationAuthLoginTestDataLocation;
    protected String getIntegrationAuthLoginTestDataLocation() {return IntegrationAuthLoginTestDataLocation;}

    @Property(value = "IntegrationAuthLoginResponseFileLocation")
    private String IntegrationAuthLoginResponseFileLocation;
    protected String getIntegrationAuthLoginResponseFileLocation() {return IntegrationAuthLoginResponseFileLocation;}

    @Property(value = "IntegrationAuthLoginSchemaLocation")
    private String IntegrationAuthLoginSchemaLocation;

    protected String getIntegrationAuthLoginSchemaLocation() {return IntegrationAuthLoginSchemaLocation;}


    protected String getRetailPartnerPath() {return RetailPartnerPath;}
    protected String getRetailCreatePartnerLocation() {return RetailCreatePartnerLocation;}
    protected String getRetailCreatePartnerResponseLocation() {return RetailCreatePartnerResponseLocation;}
    protected String getRetailBaseURI() {return RetailBaseURI;}
    protected String getRetailAccessControlPath() {return RetailAccessControlPath;}
    protected String getRetailAuthLoginPath() {return RetailAuthLoginPath;}
    protected String getJSONContentType() {return JSONContentType;}
    protected String getRetailAuthLoginTestDataLocation() {return RetailAuthLoginTestDataLocation;}
    protected String getRetailTokenFileLocation() {return RetailTokenFileLocation;}
    protected String getRetailCreateProductLocation() {return RetailCreateProductLocation;}
    protected String getRetailCreateProductResponseLocation() {return RetailCreateProductResponseLocation;}
    protected String getRetailProductPath() {return RetailProductPath;}

}
