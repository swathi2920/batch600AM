package July_19;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class StatusDemo {


	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "G:\\bhagya-grid\\JarDownload\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");

		driver.findElement(By.linkText("Create new account")).click();
		Thread.sleep(3000);
		driver.findElement(By.name("firstname")).sendKeys("aaa");
		
		WebElement submit =driver.findElement(By.name("websubmit"));
		boolean s1= submit.isDisplayed();
		System.out.println(s1);
		
		System.out.println(submit.isEnabled());
		
		System.out.println(submit.isSelected());
		
	}

}
