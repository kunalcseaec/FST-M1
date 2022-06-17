package SuiteCRM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Activity3 {
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
    	//Get the first copyright text in the footer
        WebElement l = driver.findElement(By.xpath("//a[@id='admin_options']"));   
        //Get the first copyright text in the footer.
        System.out.println("url of the header image: " + l.getText());
 
    }
    @AfterMethod
    public void afterMethod() {
        //Close the browser
        driver.quit();
    }

}
