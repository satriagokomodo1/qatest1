package Gokomodo.FE.MobileWeb.Seller.utils;

import Gokomodo.FE.MobileWeb.Buyer.controllers.MobileWebBuyerBaseMethod;
import org.testng.annotations.Test;

import java.io.File;
import java.io.FileOutputStream;
import java.net.InetAddress;
import java.util.Properties;

import static Gokomodo.FE.MobileWeb.Buyer.controllers.MobileWebBuyerInitMethod.*;

public class MobileWebSellerEnvironmentSetup extends MobileWebBuyerBaseMethod {

    @Test
    public static void environmentSetup() {
        try {
            Properties properties = new Properties();
            properties.setProperty("Author", "QA Gokomodo");
            properties.setProperty("Browser", BrowserBuyer);
            properties.setProperty("OS", OSName);
            properties.setProperty("OS Architecture", OSArchitecture);
            properties.setProperty("OS Bit", OSBit);
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
