package testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TC_1 {
	@Test
	public void testcase()
	{
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Alka\\eclipse-workspace\\e2eProject\\Drivers\\chromedriver.exe");
	ChromeDriver driver = new ChromeDriver();
	driver.get("http:/facebook.com");
	driver.findElement(By.id("email")).sendKeys("Hello");
	driver.findElement(By.id("pass")).sendKeys("Hello");
	driver.quit();
	}

}
