/**
 * 
 */
package selenium.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxBinary;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

/**
 * @author devsahaosx
 *
 */
public class webtest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("Hello selenium");

		System.setProperty("webdriver.gecko.driver", "/Users/devsahaosx/eclipse-workspace/MES_JAR/geckodriver");
		
		//Standalone test mode: Good to test if your OS have UI with browser
		// Create a new instance of the Firefox driver
		//WebDriver driver = new FirefoxDriver();
		
		
		
		//Head-less test mode: Good for test if your OS don't have UI with Browser
		FirefoxBinary firefoxBinary = new FirefoxBinary();
		firefoxBinary.addCommandLineOptions("--headless");
		FirefoxOptions firefoxOptions = new FirefoxOptions();
	    firefoxOptions.setBinary(firefoxBinary);
	    WebDriver driver = new FirefoxDriver(firefoxOptions);
				
	    
	    //Launch the Online Store Website
	  	driver.get("https://www.google.com");
	  		
		//Title
		System.out.println(driver.getTitle());
		
		//checking the message of the button on the google chrome homepage
		if (driver.getPageSource().contains("J'ai de la chance")) {
            System.out.println("Pass");
	    } else {
	            System.out.println("Fail");
	    }
		
		// Print a Log In message to the screen
        System.out.println("Successfully opened website");

		//Wait for 5 Sec
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
        // Close the driver
        driver.quit();
		
	}

}
