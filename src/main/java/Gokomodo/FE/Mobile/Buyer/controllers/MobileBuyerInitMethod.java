package Gokomodo.FE.Mobile.Buyer.controllers;

import org.openqa.selenium.Alert;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.ITestResult;
import org.testng.asserts.SoftAssert;

import java.io.File;
import java.net.URI;

public class MobileBuyerInitMethod {

    public static MobileBuyerApplicationConfigReader appConfig = new MobileBuyerApplicationConfigReader();
    public static String Usrnauseee1 = appConfig.getUsrNauseee1();
    public static String Usrnausee5 = appConfig.getUserNausee5();
    public static String Usrcommerce1 = appConfig.getUserCommerce1();

    public static String UsrProduction = appConfig.getProduction1();
    public static String PasswordProduction = appConfig.getPasswordProd();

    public static String PasswordAccount = appConfig.getPasswordAccount();
    public static String WebsiteURLBuyer = appConfig.getWebsiteUrlBuyer();
    public static String BrowserBuyer = appConfig.getBrowserBuyer();
    public static int MaxPageLoadTime = appConfig.getMaxPageLoadTime();
    public static int ImplicitlyWait = appConfig.getImplicitlyWait();
    public static String VideoFeature = appConfig.getVideoFeature();

    //Mobile
    public static String GetAppiumUrl = appConfig.getAppiumURL();
    public static String GetAndroidAutomationName = appConfig.getAndroidAutomationName();
    public static String GetAndroidBuyerAppPackage = appConfig.getAndroidBuyerAppPackage();
    public static String GetAndroidBuyerAppActivity = appConfig.getAndroidBuyerAppActivity();
    public static String GetAndroidBuyerAppName = appConfig.getAndroidBuyerAppName();
    public static String GetAndroidSellerAppPackage = appConfig.getAndroidSellerAppPackage();
    public static String GetAndroidSellerAppActivity = appConfig.getAndroidSellerAppActivity();
    public static String GetAndroidSellerAppName = appConfig.getAndroidSellerAppName();
    public static String GetAndroidAppLocation = appConfig.getAndroidAppLocation();
    public static String GetIOSAutomationName = appConfig.getIOSAutomationName();
    public static String GetIOSAppLocation = appConfig.getIOSAppLocation();
    public static String GetIOSBuyerBundleId = appConfig.getIOSBuyerBundleId();
    public static String GetIOSBuyerAppName = appConfig.getIOSBuyerAppName();
    public static String GetIOSSellerBundleId = appConfig.getIOSSellerBundleId();
    public static String GetIOSSellerAppName = appConfig.getIOSSellerAppName();
    public static String GetAndroidHeadless = appConfig.getAndroidHeadless();
    public static String GetIOSHeadless = appConfig.getIOSHeadless();
    public static String GetChromedriverLocation = appConfig.getChromedriverLocation();
    public static String GetIOSPlatformVersion = appConfig.getIOSPlatformVersion();

    //Property to display on environment.properties
    public static String FS = File.separator;
    public static String OSName = System.getProperty("os.name");
    public static String OSArchitecture = System.getProperty("os.arch");
    public static String OSVersion = System.getProperty("os.version");
    public static String OSBit = System.getProperty("sun.arch.data.model");

    //Directories
    public static String ProjectWorkingDirectory = System.getProperty("user.dir");
    public static String TestData = "./src/test/resources/TestData/";
    public static String PropertiesFiles = "./src/test/resources/Properties Files";
    public static String Reports = "./src/test/resources/Reports";
//    public static String srcRFQTemplate = "./src/test/resources/Excel Files/komodo-rfq-excel-template.xlsx";
//    public static String srcImg = "./src/test/resources/Excel Files/foto.jpg";

    //Other public variable
    public static Alert al;
    public static String robotImageName;
    public static Select se;
    public static String FileToUpload;
    public static Actions ac;
    public static ITestResult testResult;
    public static SoftAssert softAssert;
    public static ITestResult result;
    public static URI uri;

}
