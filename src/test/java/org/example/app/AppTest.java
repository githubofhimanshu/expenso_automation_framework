package org.example.app;


import io.appium.java_client.android.AndroidDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;

/**
 * Unit test for simple App.
 */
public class AppTest {

    private AndroidDriver driver;

    @BeforeClass
    public void setSetup() throws MalformedURLException {
        //Gather Desired capabilities

        DesiredCapabilities capabilities = new DesiredCapabilities();

        capabilities.setCapability("appium:deviceName","pixel_3a");
        capabilities.setCapability("platformName", "Android");
        capabilities.setCapability("appium:automationName","uiautomator2");
        capabilities.setCapability("appium:platformVersion", "14");

        capabilities.setCapability("appium:appPackage", "com.offline.expenso");
        capabilities.setCapability(  "appium:appActivity", "com.offline.expenso.presentation.ui.activities.DashboardActivity");

        URL url = URI.create("http://127.0.0.1:4723/").toURL();

        driver = new AndroidDriver(url, capabilities);
    }

    @Test
    public void shouldAnswerWithTrue() throws InterruptedException, MalformedURLException {

        Thread.sleep(2000);
        WebElement register = driver.findElement(By.xpath("//android.widget.TextView[@text=\"REGISTER\"]"));
        register.click();
        System.out.println("register button clicked = " +register.getText());
        System.out.println("register button clicked = " );
//        String packageName = "io.appium.android.apis";

//        driver.terminateApp(packageName);
//        driver.get("https://github.com/appium/appium-desktop/releases");
        System.out.println("Application started!!");





    }
}