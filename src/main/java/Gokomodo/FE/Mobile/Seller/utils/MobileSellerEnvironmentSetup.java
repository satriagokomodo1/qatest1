package Gokomodo.FE.Mobile.Seller.utils;

import Gokomodo.FE.MobileWeb.Buyer.controllers.MobileWebBuyerInitMethod;
import Gokomodo.FE.Mobile.Seller.controllers.MobileSellerBaseMethod;
import org.testng.annotations.Test;

import java.io.File;
import java.io.FileOutputStream;
import java.net.InetAddress;
import java.util.Properties;

public class MobileSellerEnvironmentSetup extends MobileSellerBaseMethod {

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
