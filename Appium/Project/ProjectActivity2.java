import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class ProjectActivity2 {
    // Declare Android driver
	 AppiumDriver<MobileElement> driver;
	 WebDriverWait wait;
    @BeforeClass
    public void setUp() throws MalformedURLException {
        // Set the Desired Capabilities
        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability("deviceName", "PixelEmulator");
        caps.setCapability("platformName", "android");
        caps.setCapability("automationName", "UiAutomator2");
        caps.setCapability("appPackage", "com.google.android.keep");
        caps.setCapability("appActivity", ".activities.BrowseActivity");
        caps.setCapability("noReset", true);

        // Instantiate Appium Driver
        URL appServer = new URL("http://127.0.0.1:4723/wd/hub");
        driver = new AndroidDriver<MobileElement>(appServer, caps);
    }

    @Test
    public void AddTask() throws InterruptedException {
        // Using resource-id
    	Thread.sleep(10000);
    	MobileElement task = driver.findElementByAccessibilityId("New text note");
    	task.click();
    	Thread.sleep(6000);
        //wait.until(ExpectedConditions.elementToBeClickable(MobileBy.id("add_task_title")));
        Thread.sleep(3000);
        MobileElement CreateTask = driver.findElementById("editable_title");
        CreateTask.sendKeys("Editor1");
        Thread.sleep(5000);
        MobileElement CreateTask1 = driver.findElementById("edit_note_text");
        CreateTask1.sendKeys("Editor1 - Note section filled");
        Thread.sleep(5000);
        driver.findElementByAccessibilityId("Open navigation drawer").click();
        Thread.sleep(3000);
        String Task1 = driver.findElementById("index_note_text_description").getText();
        Thread.sleep(3000);
        Assert.assertEquals(Task1,"Editor1 - Note section filled");
        
        
    }

    @AfterClass
    public void tearDown() {
        // Close app
        driver.quit();
    }
}

