package July_18;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinksDemo {


	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "G:\\bhagya-grid\\JarDownload\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		//WebElement lnk=driver.findElement(By.linkText("Forgotten password?"));
		
		
		WebElement lnk=driver.findElement(By.partialLinkText("password?"));
		
		lnk.click();

	}

}
