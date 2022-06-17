package SuiteCRM;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Activity9 {
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
        
       		WebDriverWait wait = new WebDriverWait(driver,30);
       		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//table/tbody/tr[1]//span[@title ='Additional Details']")));
        //Find the table on the page and print the first 10 values in the Name column and the User column of the table to the console
       	    List<WebElement> rowsname = driver.findElements(By.xpath("//td[@type ='name']"));
    	    for(int row = 0; row < rowsname.size(); row++){
    	    System.out.println(rowsname.get(row).getText());
    	    	}
    	    List<WebElement> rowsuser = driver.findElements(By.xpath("//td[@type ='relate']"));
    	    for(int row = 0; row < rowsuser.size(); row++){
    	    System.out.println(rowsuser.get(row).getText());
    	    	}
    }
    @AfterMethod
    public void afterMethod() {
        //Close the browser
      driver.quit();
    }
}
