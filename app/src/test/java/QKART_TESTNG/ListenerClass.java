
package QKART_TESTNG;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.BrowserType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import QKART_TESTNG.QKART_Tests;
import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;


public class ListenerClass implements ITestListener {
    // static RemoteWebDriver driver;
    // public static void createDriver() throws MalformedURLException {
    //     // Launch Browser using Zalenium
    //     final DesiredCapabilities capabilities = new DesiredCapabilities();
    //     capabilities.setBrowserName(BrowserType.CHROME);
    //     driver = new RemoteWebDriver(new URL("http://localhost:8082/wd/hub"), capabilities);
    //     System.out.println("createDriver()");
    // }

    public void onTestStart(ITestResult result) {
        System.out.println("New Test Started" +result.getName());
        QKART_Tests.takeScreenshot(QKART_Tests.driver,"TestFail", result.getName());
    }

    public void onTestSuccess(ITestResult result) {
        System.out.println("onTestSuccess Method" +result.getName());
        QKART_Tests.takeScreenshot(QKART_Tests.driver,"TestFail", result.getName());
    }

    public void onTestFailure(ITestResult result) {
        System.out.println("onTestFailure Method" +result.getName());
        QKART_Tests.takeScreenshot(QKART_Tests.driver,"TestFail", result.getName());
    }
    // public static void takeScreenshot(WebDriver driver, String screenshotType, String description) {
    //     try {
    //         File theDir = new File("/screenshots");
    //         if (!theDir.exists()) {
    //             theDir.mkdirs();
    //         }
    //         String timestamp = String.valueOf(java.time.LocalDateTime.now());
    //         String fileName = String.format("screenshot_%s_%s_%s.png", timestamp, screenshotType, description);
    //         TakesScreenshot scrShot = ((TakesScreenshot) driver);
    //         File SrcFile = scrShot.getScreenshotAs(OutputType.FILE);
    //         File DestFile = new File("screenshots/" + fileName);
    //         FileUtils.copyFile(SrcFile, DestFile);
    //     } catch (Exception e) {
    //         e.printStackTrace();
    //     }
    // }
}