package LearnSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.chrome.ChromeDriver;

public class GamilEditing {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\HD149PQ\\OneDrive - EY\\Desktop\\SELENIUM\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("http://gmail.com");
		// System.out.println(driver.getCurrentUrl());
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys("ranjiniram18@gmail.com");
		// driver.findElement(By.className("Next")).click();
		driver.findElement(By.xpath("//button[text()='Forgot email?']")).click();
		// driver.close();

	}

}
