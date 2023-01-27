package LearnSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Generalpage {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\HD149PQ\\OneDrive - EY\\Desktop\\SELENIUM\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://google.com");
		driver.findElement(By.name("q")).sendKeys("automation testing");
		driver.findElement(By.cssSelector("input[title='Search']")).click();
		driver.findElement(By.xpath("//*[@name='btnK']")).click();
		System.out.println(driver.findElements(By.xpath("//*[contains(@class,'TbwUpd NJjxre')]")).size());

		System.out.println(driver.findElement(By.xpath("//*[contains(@class,'TbwUpd NJjxre')]")).getText());
		// driver.close();

		// driver.findElement(By.name("submit")).click();

	}
}
