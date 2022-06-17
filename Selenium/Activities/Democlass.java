import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Democlass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			WebDriver driver = new FirefoxDriver();
			driver.get("http://www.google.com");
			driver.close();
	}

}
