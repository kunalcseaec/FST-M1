package SuiteCRM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Activity5 {
WebDriver driver;
    
    @BeforeMethod
    public void beforeMethod() {
        //Create a new instance of the Firefox driver
        driver = new FirefoxDriver();
        //Open browser
        driver.get("http://alchemy.hguy.co/crm");
    }
    @Test
    public void Gettingcolors() {
        //Find the username and password fields
        WebElement username = driver.findElement(By.id("user_name"));
        WebElement password = driver.findElement(By.id("username_password"));
        
        //Enter credentials
        username.sendKeys("admin");
        password.sendKeys("pa$$w0rd");
        
        //Click login
        driver.findElement(By.xpath("//input[@name='Login']")).click();
        
        //Get the color of the navigation menu and print it to the console.
        WebElement menucolor = driver.findElement(By.xpath("//nav[@class='navbar navbar-inverse navbar-fixed-top']/div[@class='container-fluid']"));
        System.out.println("Color of the navigation menu " +menucolor.getCssValue("color"));
       
    }

    @AfterMethod
    public void afterMethod() {
        //Close the browser
        driver.quit();
    }
}
