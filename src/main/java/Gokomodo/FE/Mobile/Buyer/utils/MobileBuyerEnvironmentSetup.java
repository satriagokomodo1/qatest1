package Gokomodo.FE.Mobile.Buyer.utils;

import Gokomodo.FE.Mobile.Buyer.controllers.MobileBuyerBaseMethod;
import Gokomodo.FE.MobileWeb.Buyer.controllers.MobileWebBuyerInitMethod;
import org.testng.annotations.Test;

import java.io.File;
import java.io.FileOutputStream;
import java.net.InetAddress;
import java.util.Properties;

public class MobileBuyerEnvironmentSetup extends MobileBuyerBaseMethod {

    @Test
    public static void environmentSetup() {
        try {
            Properties properties = new Properties();
            properties.setProperty("Author", "QA Gokomodo");
            properties.setProperty("Browser", MobileWebBuyerInitMethod.BrowserBuyer);
            properties.setProperty("OS", MobileWebBuyerInitMethod.OSName);
            properties.setProperty("OS Architecture", MobileWebBuyerInitMethod.OSArchitecture);
            properties.setProperty("OS Bit", MobileWebBuyerInitMethod.OSBit);
//            properties.setProperty("Java Version", Runtime.class.getPackage().getImplementationVersion());
//            properties.setProperty("Host Name", InetAddress.getLocalHost().getHostName());
            properties.setProperty("Host IP Address", InetAddress.getLocalHost().getHostAddress());

            File file = new File("./src/main/resources/environment.properties");
            FileOutputStream fileOut = new FileOutputStream(file);
            properties.store(fileOut, "Environment Setup");
            fileOut.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
