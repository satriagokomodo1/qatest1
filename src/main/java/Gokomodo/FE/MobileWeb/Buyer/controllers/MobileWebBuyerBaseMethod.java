package Gokomodo.FE.MobileWeb.Buyer.controllers;

import Gokomodo.FE.MobileWeb.Buyer.utils.MobileWebBuyerEnvironmentSetup;

import io.appium.java_client.AppiumDriver;

import io.appium.java_client.functions.ExpectedCondition;

import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.options.XCUITestOptions;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.IOSMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;
import io.appium.java_client.service.local.flags.GeneralServerFlag;

import org.openqa.selenium.*;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.PageFactory;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.*;

import java.io.File;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.URL;
import java.time.Duration;
import java.util.HashMap;

import static Gokomodo.FE.Mobile.Buyer.controllers.MobileBuyerInitMethod.GetIOSPlatformVersion;
import static Gokomodo.FE.MobileWeb.Buyer.controllers.MobileWebBuyerInitMethod.*;

public class MobileWebBuyerBaseMethod{

    protected static ThreadLocal<AppiumDriver> driver = new ThreadLocal<AppiumDriver>();
    private static AppiumDriverLocalService server;
    protected static ThreadLocal<String> platform = new ThreadLocal<String>();
    public String getPlatform() {
        return platform.get();
    }
    public static final long WAIT = 10;
    private Point start;
    private Point end;


    public MobileWebBuyerBaseMethod() {

        PageFactory.initElements(new AppiumFieldDecorator(getDriver()), this);

    }

    @BeforeSuite
    public void beforeSuite() throws Exception {
        server = getAppiumService();
        if (!checkIfAppiumServerIsRunnning(4723)) {
            server.start();
            server.clearOutPutStreams();
        }
    }

    public AppiumDriver getDriver() {
        return driver.get();
    }

    public void setDriver(AppiumDriver driver2) {
        driver.set(driver2);
    }

    @Parameters({"emulator","platformName","deviceName"})

    @BeforeClass
    public void beforeClass(String emulator, String platformName, String deviceName) throws Exception {

        AppiumDriver driver;
        URL url;
        try {
            DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
            desiredCapabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, platformName);
            desiredCapabilities.setCapability(MobileCapabilityType.DEVICE_NAME, deviceName);
            url = new URL(GetAppiumUrl);
            switch (platformName) {
                case "Android":
                    desiredCapabilities.setCapability(AndroidMobileCapabilityType.AVD, deviceName);
                    desiredCapabilities.setCapability(AndroidMobileCapabilityType.IS_HEADLESS, GetAndroidHeadless);
                    desiredCapabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME, GetAndroidAutomationName);
                    desiredCapabilities.setCapability(MobileCapabilityType.BROWSER_NAME, "Chrome");
                    desiredCapabilities.setCapability(MobileCapabilityType.NO_RESET, true);
                    driver = new AppiumDriver(url, desiredCapabilities);
                    break;
                case "iOS":
                    desiredCapabilities.setCapability(XCUITestOptions.WDA_LAUNCH_TIMEOUT_OPTION, "300000");
                    desiredCapabilities.setCapability(XCUITestOptions.WDA_CONNECTION_TIMEOUT_OPTION, "1000000");
                    desiredCapabilities.setCapability(XCUITestOptions.IS_HEADLESS_OPTION,GetIOSHeadless);
                    desiredCapabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME, GetIOSAutomationName);
                    desiredCapabilities.setCapability(IOSMobileCapabilityType.WDA_STARTUP_RETRIES, "20");
                    desiredCapabilities.setCapability(IOSMobileCapabilityType.WDA_STARTUP_RETRY_INTERVAL, "60000");
//                    desiredCapabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, GetIOSPlatformVersion);
                    desiredCapabilities.setCapability(MobileCapabilityType.BROWSER_NAME, "Safari");
                    driver = new IOSDriver(url, desiredCapabilities);
                    break;
                default:
                    throw new Exception("Invalid platform! - " + platformName);
            }
            driver.get(WebsiteURLBuyer);
            setDriver(driver);
        } catch (Exception e){
            throw e;
        }
    }



    public boolean checkIfAppiumServerIsRunnning(int port) throws Exception {
        boolean isAppiumServerRunning = false;
        ServerSocket socket;
        try {
            socket = new ServerSocket(port);
            socket.close();
        } catch (IOException e) {
            System.out.println("1");
            isAppiumServerRunning = true;
        } finally {
            socket = null;
        }
        return isAppiumServerRunning;
    }
    public AppiumDriverLocalService getAppiumServerDefault() {
        return AppiumDriverLocalService.buildDefaultService();
    }


    public AppiumDriverLocalService getAppiumService() {
        HashMap<String, String> environment = new HashMap<String, String>();
        environment.put("PATH", "/Library/Internet Plug-Ins/JavaAppletPlugin.plugin/Contents/Home/bin:/Users/"+System.getProperty("user.name")+"/Library/Android/sdk/tools:/Users/"+System.getProperty("user.name")+"/Library/Android/sdk/platform-tools:/usr/local/bin:/usr/bin:/bin:/usr/sbin:/sbin:/Library/Apple/usr/bin" + System.getenv("PATH"));
        environment.put("ANDROID_HOME", "/Users/"+System.getProperty("user.name")+"/Library/Android/sdk");
        return AppiumDriverLocalService.buildService(new AppiumServiceBuilder()
                .usingDriverExecutable(new File("/usr/local/bin/node"))
                .withAppiumJS(new File("/usr/local/lib/node_modules/appium/build/lib/main.js"))
                .usingPort(4723)
                .withArgument(GeneralServerFlag.SESSION_OVERRIDE)
                .withArgument(GeneralServerFlag.BASEPATH, "/wd/hub/")
                .withArgument(() -> "--allow-insecure", "chromedriver_autodownload")
                .withEnvironment(environment)
                .withLogFile(new File("ServerLogs/server.log")));
    }

    //wait for visibility
    public void waitForVisibility(WebElement e) {
        WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(WAIT));
        wait.until(ExpectedConditions.visibilityOf(e));
    }

    //get website name
    public String getUrlTitle() throws Exception
    {
        URL aURL = new URL(WebsiteURLBuyer);
        String WebName = aURL.getHost();
        return WebName.toUpperCase();
    }

    //clear element
    public void clear(WebElement e) {
        waitForVisibility(e);
        e.clear();
    }

    //highlight element
    public void highlightElement(WebElement e){
        waitForVisibility(e);
        JavascriptExecutor js = (JavascriptExecutor)getDriver() ;
        js.executeScript("arguments[0].setAttribute('style',' border: 2px solid red;');", e);
    }

    //click
    public void click(WebElement e) {
        waitForVisibility(e);
        e.click();
    }


    //send key or text
    public void sendKeys(WebElement e, String txt){
        waitForVisibility(e);
        e.sendKeys(txt);
    }

    //get attribute
    public String getAttribute(WebElement e, String attribute){
        waitForVisibility(e);
        return e.getAttribute(attribute);
    }

    //get text
    public String getText(WebElement e, String msg) {
        String txt = null;
        switch (getPlatform()) {
            case "Android":
                txt = getAttribute(e, "text");
                break;
            case "iOS":
                txt = getAttribute(e, "label");
                break;
        }
        return txt;
    }


    public void scrollDown() {

        Dimension dimension = getDriver().manage().window().getSize();
        start = new Point((int)(dimension.width*0.5), (int)(dimension.height*0.8));
        end = new Point((int)(dimension.width*0.2), (int)(dimension.height*0.1));
        MobileWebBuyerW3cActions.doSwipe(getDriver(), start, end, 1000);  //with duration 1s

    }

    public void scrollUp() {

        Dimension dimension = getDriver().manage().window().getSize();
        start = new Point((int)(dimension.width*0.5), (int)(dimension.height*0.8));
        end = new Point((int)(dimension.width*0.2), (int)(dimension.height*0.1));
        MobileWebBuyerW3cActions.doSwipe(getDriver(), end, start, 1000);  //with duration 1s

    }

    public void scrollToElement(WebElement e, String direction) {
        for(int i = 0; i<10; i++){
            if(isElementDisplayed(e)){
                break;
            } else {
                if(direction.equalsIgnoreCase("up")){
                    scrollUp();
                } else{
                    scrollDown();
                }
            }
        }
    }

    public boolean isElementDisplayed(WebElement e){
        new WebDriverWait(getDriver(), Duration.ofMillis(500));
        try {
            WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofMillis(500));
            return wait.until(new ExpectedCondition<Boolean>() {
                public Boolean apply(WebDriver driver) {
                    if(e.isDisplayed()){
                        return true;
                    }
                    return false;
                }
            });
        } catch (Exception ex){
            return false;
        }
    }


    //Stop appium driver
    @AfterClass
    public void afterClass() {
        MobileWebBuyerEnvironmentSetup.environmentSetup();
        getDriver().quit();
    }


    //Stop appium server
    @AfterSuite
    public void afterSuite() {
        server.stop();
    }
    
}
