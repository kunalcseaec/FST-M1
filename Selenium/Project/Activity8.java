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

public class Activity8 {
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
       		Thread.sleep(10000);
       		driver.findElement(By.cssSelector("#moduleTab_9_Accounts")).click();
       		WebDriverWait wait = new WebDriverWait(driver,30);
       		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//tr[@class = 'oddListRowS1']")));
       		List<WebElement> rows = driver.findElements(By.xpath("//tr[@class = 'oddListRowS1']"));
       	    for(int row = 0; row < rows.size(); row+=2){
       	    System.out.println(rows.get(row).getText());
       	    	}
    }
    @AfterMethod
    public void afterMethod() {
        //Close the browser
       driver.quit();
    }
}
