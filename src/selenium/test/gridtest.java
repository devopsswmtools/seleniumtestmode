package selenium.test;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class gridtest {
	
	public static WebDriver driver;

	public static void main(String[]  args) throws MalformedURLException, InterruptedException{

 		String URL = "http://www.edureka.co";
 		String Node = "http://169.254.230.208:4444/wd/hub";
 		DesiredCapabilities cap = DesiredCapabilities.firefox();

 		driver = new RemoteWebDriver(new URL(Node), cap);

 		driver.navigate().to(URL);
 		Thread.sleep(5000);
 		driver.quit();
 	}	
}
