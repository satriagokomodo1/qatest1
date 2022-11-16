package Gokomodo.BE.Rest.controllers;

public class RestInitMethod {
    public static RestConfigReader appConfig = new RestConfigReader();
    public static String retailBaseURI = appConfig.getRetailBaseURI();
    public static String retailAccessControlPath = appConfig.getRetailAccessControlPath();
    public static String retailAuthLoginPath = appConfig.getRetailAuthLoginPath();
    public static String retailAuthLoginTestDataLocation = appConfig.getRetailAuthLoginTestDataLocation();
    public static String jsonContentType = appConfig.getJSONContentType();
    public static String retailTokenFileLocation = appConfig.getRetailTokenFileLocation();
    public static String retailCreateProductLocation = appConfig.getRetailCreateProductLocation();
    public static String retailCreateProductResponseLocation = appConfig.getRetailCreateProductResponseLocation();
    public static String retailProductPath = appConfig.getRetailProductPath();
    public static String retailPartnerPath = appConfig.getRetailPartnerPath();
    public static String retailCreatePartnerLocation = appConfig.getRetailCreatePartnerLocation();
    public static String retailCreatePartnerResponseLocation = appConfig.getRetailCreatePartnerResponseLocation();
    public static String integrationBaseURI = appConfig.getIntegrationBaseURI();
    public static String integrationAuthLoginPath = appConfig.getIntegrationAuthLoginPath();
    public static String integrationAuthLoginTestDataLocation = appConfig.getIntegrationAuthLoginTestDataLocation();
    public static String integrationAuthLoginResponseFileLocation = appConfig.getIntegrationAuthLoginResponseFileLocation();
    public static String integrationAuthLoginSchemaLocation = appConfig.getIntegrationAuthLoginSchemaLocation();
}
