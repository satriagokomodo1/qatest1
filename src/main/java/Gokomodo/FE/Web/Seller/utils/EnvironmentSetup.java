package Gokomodo.FE.Web.Seller.utils;

import Gokomodo.FE.Web.Seller.controllers.BaseMethod;
import org.testng.annotations.Test;

import java.io.File;
import java.io.FileOutputStream;
import java.net.InetAddress;
import java.util.Properties;


public class EnvironmentSetup extends BaseMethod {

    @Test
    public static void environmentSetup() {
        try {
            Properties properties = new Properties();
            properties.setProperty("Author", "Gladson Antony");
            properties.setProperty("Browser", Browser);
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
