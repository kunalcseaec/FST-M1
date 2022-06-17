package SuiteCRM;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Activity7 {
WebDriver driver;
    
    @BeforeMethod
    public void beforeMethod() {
        //Create a new instance of the Firefox driver
        driver = new FirefoxDriver();
        //Open browser
        driver.get("http://alchemy.hguy.co/crm");
    }
    @Test
    public void ReadingAdditionaInfo() throws InterruptedException {
        //Find the username and password fields
        	WebElement username = driver.findElement(By.id("user_name"));
        	WebElement password = driver.findElement(By.id("username_password"));
        
        //Enter credentials
        	username.sendKeys("admin");
        	password.sendKeys("pa$$w0rd");
        //Click login
        	driver.findElement(By.xpath("//input[@name='Login']")).click();
        //Navigate to Sales -> Leads
        	driver.findElement(By.xpath("//a[@id='grouptab_0']")).click();
       		Thread.sleep(8000);
       		driver.findElement(By.cssSelector("#moduleTab_9_Leads")).click();
        //Thread.sleep(15000);
       		WebDriverWait wait = new WebDriverWait(driver,30);
       		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//table/tbody/tr[1]//span[@title ='Additional Details']")));
        //In the table, find the Additional information icon at the end of the row of the lead information. Click it.
       	    driver.findElement(By.xpath("//table/tbody/tr[1]//span[@title ='Additional Details']")).click();
       	//Read the popup and print the phone number displayed in it.
       	    wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@class='phone']")));
       	    String PhoneNumber = driver.findElement(By.xpath("//span[@class='phone']")).getText();
       	    System.out.println("Phone Number displayed is :" +PhoneNumber);
       
    }
    @AfterMethod
    public void afterMethod() {
        //Close the browser
       driver.quit();
    }
}
