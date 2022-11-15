package Gokomodo.FE.MobileWeb.Buyer.controllers;

import com.automation.remarks.video.enums.RecorderType;
import com.automation.remarks.video.enums.RecordingMode;
import com.automation.remarks.video.enums.VideoSaveMode;
import com.automation.remarks.video.recorder.VideoRecorder;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;


public class MobileWebBuyerDriverFactory extends MobileWebBuyerBaseMethod{



    @BeforeMethod
    public void beforeMethod() throws Exception {
//        new MobileWebBuyerWebDriverFactory();


        if (MobileWebBuyerInitMethod.VideoFeature.toLowerCase().contains("enabledfailed")) {
            setupVideoRecordingFailedOnly();
        } else if (MobileWebBuyerInitMethod.VideoFeature.toLowerCase().contains("enabledall")) {
            setupVideoRecordingAll();
        }
    }



    public void setupVideoRecordingFailedOnly() {
        VideoRecorder.conf()
                .withVideoFolder("./src/test/resources/Videos")                         // Default is ${user.dir}/video.
                .videoEnabled(true)                                                     // Disabled video globally
                .withVideoSaveMode(VideoSaveMode.FAILED_ONLY)                           // Save videos ONLY FAILED tests
                .withRecorderType(RecorderType.MONTE)                                   // Monte is Default recorder
                .withRecordMode(RecordingMode.ALL);                                     // Record video only for tests with @Video
    }

    public void setupVideoRecordingAll() {
        VideoRecorder.conf()
                .withVideoFolder("./src/test/resources/Videos")                         // Default is ${user.dir}/video.
                .videoEnabled(true)                                                     // Disabled video globally
                .withVideoSaveMode(VideoSaveMode.ALL)                                   // Save videos All tests
                .withRecorderType(RecorderType.MONTE)                                   // Monte is Default recorder
                .withRecordMode(RecordingMode.ALL);                                     // Record video only for tests with @Video
    }

    public MobileWebBuyerDriverFactory() {
        PageFactory.initElements(new AppiumFieldDecorator(getDriver()), this);
    }



    @AfterMethod(alwaysRun = true)
    public void afterMethod() throws Exception {
        Thread.sleep(2000);
    }
}
