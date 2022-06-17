package SuiteCRM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Activity2 {
WebDriver driver;
    
    @BeforeMethod
    public void beforeMethod() {
        //Create a new instance of the Firefox driver
        driver = new FirefoxDriver();
        //Open browser
        driver.get("http://alchemy.hguy.co/crm");
    }
    @Test
    public void WebsiteTitle() {
        // Get the url of the header image.
        WebElement url = driver.findElement(By.xpath("//img[@alt='SuiteCRM']"));   
        //Print the url to the console.
        System.out.println("url of the header image: " + url.getAttribute("src"));
 
    }
    @AfterMethod
    public void afterMethod() {
        //Close the browser
        driver.quit();
    }
    
}