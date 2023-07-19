package July_15;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Launch {

	public static void main(String[] args)
	{
		// open browser--chrome

//		System.setProperty("webdriver.chrome.driver", "G:\\bhagya-grid\\JarDownload\\Drivers\\chromedriver.exe");
//		//demo d= new demo();
//		//int x=99;
//		WebDriver driver = new ChromeDriver();
		
		
		System.setProperty("webdriver.gecko.driver", "G:\\bhagya-grid\\JarDownload\\Drivers\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.google.com/");
		
		
		//open App
		// functionlaity

	}

}
