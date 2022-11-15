package Gokomodo.FE.Mobile.Buyer.controllers;

import ru.qatools.properties.Property;
import ru.qatools.properties.PropertyLoader;
import ru.qatools.properties.Resource;

@Resource.Classpath("ApplicationConfig.properties")
public class MobileBuyerApplicationConfigReader {

    public MobileBuyerApplicationConfigReader()
    {
        PropertyLoader.newInstance().populate(this);
    }

    @Property(value = "BrowserFirefox")
    private String BrowserBuyer;

    @Property(value="UrlBuyer")
    private String WebsiteUrlBuyer;

    @Property(value="MaxPageLoadTime")
    private int MaxPageLoadTime;

    @Property(value="ImplicitlyWait")
    private int ImplicitlyWait;

    @Property(value="VideoFeature")
    private String VideoFeature;

    @Property(value = "UsrNausee")
    private String usrNauseee1;

    @Property(value = "UsrNausee5")
    private String userNausee5;

    @Property(value = "Usrcommerce1")
    private String userCommerce1;

    @Property(value = "Password")
    private String passwordAccount;

    @Property(value = "Production1")
    private String production1;

    @Property(value = "PasswordProd")
    private String passwordProd;

    @Property(value = "AppiumURL")
    private String appiumURL;

    @Property(value = "AndroidAutomationName")
    private String androidAutomationName;

    @Property(value = "AndroidBuyerAppPackage")
    private String androidBuyerAppPackage;

    @Property(value = "AndroidBuyerAppActivity")
    private String androidBuyerAppActivity;

    @Property(value = "AndroidBuyerAppName")
    private String androidBuyerAppName;

    @Property(value = "AndroidSellerAppPackage")
    private String androidSellerAppPackage;

    @Property(value = "AndroidSellerAppActivity")
    private String androidSellerAppActivity;

    @Property(value = "AndroidSellerAppName")
    private String androidSellerAppName;

    @Property(value = "AndroidAppLocation")
    private String androidAppLocation;

    @Property(value = "IOSAutomationName")
    private String iOSAutomationName;

    @Property(value = "IOSAppLocation")
    private String iOSAppLocation;

    @Property(value = "IOSBuyerBundleId")
    private String iOSBuyerBundleId;

    @Property(value = "IOSBuyerAppName")
    private String iOSBuyerAppName;

    @Property(value = "IOSSellerBundleId")
    private String iOSSellerBundleId;

    @Property(value = "IOSSellerAppName")
    private String iOSSellerAppName;

    @Property(value = "AndroidHeadless")
    private String AndroidHeadless;

    @Property(value = "IOSHeadless")
    private String IOSHeadless;

    @Property(value = "ChromedriverLocation")
    private String ChromedriverLocation;

    @Property(value = "IOSPlatformVersion")
    private String IOSPlatformVersion;

    public String getIOSPlatformVersion() {return IOSPlatformVersion;}

    public String getChromedriverLocation() {return ChromedriverLocation;}

    public String getAndroidHeadless() {return AndroidHeadless;}
    public String getIOSHeadless() {return IOSHeadless;}

    public String getPasswordAccount() {return passwordAccount;}
    public String getUsrNauseee1(){return usrNauseee1;}
    public String getUserNausee5(){return userNausee5;}
    public String getUserCommerce1(){return userCommerce1;}

    //Production
    public String getProduction1() {return production1;}
    public String getPasswordProd(){return passwordProd;}
    public String getBrowserBuyer() {return BrowserBuyer;}
    public String getWebsiteUrlBuyer() {
        return WebsiteUrlBuyer;
    }
    public int getMaxPageLoadTime() {
        return MaxPageLoadTime;
    }
    public int getImplicitlyWait() {
        return ImplicitlyWait;
    }
    public String getVideoFeature() {
        return VideoFeature;
    }

    //Mobile
    public String getAppiumURL() {return appiumURL;}
    public String getAndroidAutomationName() {return androidAutomationName;}
    public String getAndroidBuyerAppPackage() {return androidBuyerAppPackage;}
    public String getAndroidBuyerAppActivity() {return androidBuyerAppActivity;}
    public String getAndroidBuyerAppName() {return androidBuyerAppName;}
    public String getAndroidSellerAppPackage() {return androidSellerAppPackage;}
    public String getAndroidSellerAppActivity() {return androidSellerAppActivity;}
    public String getAndroidSellerAppName() {return androidSellerAppName;}
    public String getAndroidAppLocation() {return androidAppLocation;}
    public String getIOSAutomationName() {return iOSAutomationName;}
    public String getIOSAppLocation() {return iOSAppLocation;}
    public String getIOSBuyerBundleId() {return iOSBuyerBundleId;}
    public String getIOSBuyerAppName() {return iOSBuyerAppName;}
    public String getIOSSellerBundleId() {return iOSSellerBundleId;}
    public String getIOSSellerAppName() {return iOSSellerAppName;}

}
