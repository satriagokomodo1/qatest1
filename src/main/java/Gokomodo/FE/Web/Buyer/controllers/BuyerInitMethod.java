package Gokomodo.FE.Web.Buyer.controllers;

import org.openqa.selenium.Alert;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.ITestResult;
import org.testng.asserts.SoftAssert;

import java.awt.*;
import java.io.File;
import java.net.URI;


public class BuyerInitMethod {
    public static BuyerApplicationConfigReader appConfig = new BuyerApplicationConfigReader();
    public static String Usrnauseee1 = appConfig.getUsrNauseee1();
    public static String Usrnausee5 = appConfig.getUserNausee5();
    public static String Usrcommerce1 = appConfig.getUserCommerce1();

    public static String PasswordAccount =appConfig.getPasswordAccount();
    public static String WebsiteURLBuyer = appConfig.getWebsiteUrlBuyer();
    public static String BrowserBuyer = appConfig.getBrowserBuyer();
    public static int MaxPageLoadTime = appConfig.getMaxPageLoadTime();
    public static int ImplicitlyWait = appConfig.getImplicitlyWait();
    public static String VideoFeature = appConfig.getVideoFeature();
    //
    //Alam
    public static String AttachemntEproc1 = appConfig.getAttachemntEproc1();
    public static String AttachemntCorpcomm1 = appConfig.getAttachemntCorpcomm1();
    public static String AttachemntImg1 = appConfig.getAttachemntFoto1();
    //Iwan
    public static String AttachemntEproc2 = appConfig.getAttachemntEproc2();
    public static String AttachemntCorpcomm2 = appConfig.getAttachemntCorpcomm2();
    public static String AttachemntImg2 = appConfig.getAttachemntFoto2();

    public static String FS = File.separator;

    public static String OSName = System.getProperty("os.name");
    public static String OSArchitecture = System.getProperty("os.arch");
    public static String OSVersion = System.getProperty("os.version");
    public static String OSBit = System.getProperty("sun.arch.data.model");

    public static String ProjectWorkingDirectory = System.getProperty("user.dir");


    public static String TestData = "./src/test/resources/TestData/";
    public static String PropertiesFiles = "./src/test/resources/Properties Files";
    public static String Reports = "./src/test/resources/Reports";
//    public static String srcRFQTemplate = "./src/test/resources/Excel Files/komodo-rfq-excel-template.xlsx";
//    public static String srcImg = "./src/test/resources/Excel Files/foto.jpg";

    public static Robot re;
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
