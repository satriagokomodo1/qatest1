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
    @Property(value = "BaseURI")
    private String BaseURI;

    @Property(value = "AccessControlPath")
    private String AccessControlPath;

    @Property(value = "AuthLoginPath")
    private String AuthLoginPath;

    @Property(value = "ContentType")
    private String ContentType;

    @Property(value = "AuthLoginTestDataLocation")
    private String AuthLoginTestDataLocation;

    @Property(value = "TokenFileLocation")
    private String TokenFileLocation;

    @Property(value = "CreateProductLocation")
    private String CreateProductLocation;

    @Property(value = "ProductPath")
    private String ProductPath;

    @Property(value = "CreateProductResponseLocation")
    private String CreateProductResponseLocation;

    @Property(value = "PartnerPath")
    private String PartnerPath;

    @Property(value = "CreatePartnerLocation")
    private String CreatePartnerLocation;

    @Property(value = "CreatePartnerResponseLocation")
    private String CreatePartnerResponseLocation;

    // Get method for the value
    protected String getPartnerPath() {return PartnerPath;}
    protected String getCreatePartnerLocation() {return CreatePartnerLocation;}
    protected String getCreatePartnerResponseLocation() {return CreatePartnerResponseLocation;}
    protected String getBaseURI() {return BaseURI;}
    protected String getAccessControlPath() {return AccessControlPath;}
    protected String getAuthLoginPath() {return AuthLoginPath;}
    protected String getContentType() {return ContentType;}
    protected String getAuthLoginTestDataLocation() {return AuthLoginTestDataLocation;}
    protected String getTokenFileLocation() {return TokenFileLocation;}
    protected String getCreateProductLocation() {return CreateProductLocation;}
    protected String getCreateProductResponseLocation() {return CreateProductResponseLocation;}
    protected String getProductPath() {return ProductPath;}

}
