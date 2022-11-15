package Gokomodo.BE.Rest.controllers;

public class RestInitMethod {
    public static RestConfigReader appConfig = new RestConfigReader();
    public static String gokomodoBaseURI = appConfig.getBaseURI();
    public static String accessControlPath = appConfig.getAccessControlPath();
    public static String authLoginPath = appConfig.getAuthLoginPath();
    public static String authLoginTestDataLocation = appConfig.getAuthLoginTestDataLocation();
    public static String contentType = appConfig.getContentType();
    public static String tokenFileLocation = appConfig.getTokenFileLocation();
    public static String createProductLocation = appConfig.getCreateProductLocation();
    public static String createProductResponseLocation = appConfig.getCreateProductResponseLocation();
    public static String productPath = appConfig.getProductPath();
    public static String partnerPath = appConfig.getPartnerPath();
    public static String createPartnerLocation = appConfig.getCreatePartnerLocation();
    public static String createPartnerResponseLocation = appConfig.getCreatePartnerResponseLocation();
}
