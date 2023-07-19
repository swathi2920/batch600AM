package July_18;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.*;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Launch {

	public static void main(String[] args) throws InterruptedException
	{
		// open browser--chrome

		System.setProperty("webdriver.chrome.driver", "G:\\bhagya-grid\\JarDownload\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
	
		String url = driver.getCurrentUrl();
		System.out.println("url is :  "+ url);
		
		System.out.println("Title is : " + driver.getTitle());
		
		//Login functionality
//		WebElement unm = driver.findElement(By.id("email"));
//		unm.sendKeys("user1");
		
		driver.findElement(By.id("email")).sendKeys("aaa");
		
		WebElement pwd = driver.findElement(By.id("pass"));
		pwd.sendKeys("aaa");
		Thread.sleep(1000);
		pwd.clear();
		Thread.sleep(1000);
		pwd.sendKeys("test");
		
		WebElement log= driver.findElement(By.name("login"));
		log.click();
		

	}

}
