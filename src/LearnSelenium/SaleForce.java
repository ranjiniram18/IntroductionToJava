package LearnSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SaleForce {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\HD149PQ\\OneDrive - EY\\Desktop\\SELENIUM\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://login.salesforce.com");
		driver.findElement(By.id("username")).sendKeys("ranjiniram");
		driver.findElement(By.name("pw")).sendKeys("123456");
		driver.findElement(By.name("Login")).click();
		System.out.println(driver.findElement(By.cssSelector("#error")).getText());
		// driver.close();

	}
}
