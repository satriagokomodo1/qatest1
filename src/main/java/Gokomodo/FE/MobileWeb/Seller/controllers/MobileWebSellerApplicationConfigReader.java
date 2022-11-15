package Gokomodo.FE.MobileWeb.Seller.controllers;

import ru.qatools.properties.Property;
import ru.qatools.properties.PropertyLoader;
import ru.qatools.properties.Resource;

@Resource.Classpath("ApplicationConfig.properties")
public class MobileWebSellerApplicationConfigReader {

    public MobileWebSellerApplicationConfigReader()
    {
        PropertyLoader.newInstance().populate(this);
    }

    @Property(value = "BrowserFirefox")
    private String BrowserBuyer;

    @Property(value="UrlSeller")
    private String WebsiteUrlSeller;

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

    @Property(value = "UsrSeller")
    private String userSeller;

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

    @Property(value = "AndroidAppPackage")
    private String androidAppPackage;

    @Property(value = "AndroidAppActivity")
    private String androidAppActivity;

    @Property(value = "AndroidAppName")
    private String androidAppName;

    @Property(value = "AndroidAppLocation")
    private String androidAppLocation;

    @Property(value = "IOSAutomationName")
    private String iOSAutomationName;

    @Property(value = "IOSBundleId")
    private String iOSBundleId;

    @Property(value = "IOSAppLocation")
    private String iOSAppLocation;

    @Property(value = "IOSAppName")
    private String iOSAppName;

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
    public String getUserSeller(){return userSeller;}
    public String getUserNausee5(){return userNausee5;}
    public String getUserCommerce1(){return userCommerce1;}

    //Production
    public String getProduction1() {return production1;}
    public String getPasswordProd(){return passwordProd;}
    public String getBrowserBuyer() {return BrowserBuyer;}
    public String getWebsiteUrlSeller() {
        return WebsiteUrlSeller;
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
    public String getAndroidAppPackage() {return androidAppPackage;}
    public String getAndroidAppActivity() {return androidAppActivity;}
    public String getAndroidAppName() {return androidAppName;}
    public String getAndroidAppLocation() {return androidAppLocation;}
    public String getIOSAutomationName() {return iOSAutomationName;}
    public String getIOSBundleId() {return iOSBundleId;}
    public String getIOSAppLocation() {return iOSAppLocation;}
    public String getIOSAppName() {return iOSAppName;}

}
