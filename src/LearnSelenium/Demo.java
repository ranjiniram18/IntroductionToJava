package LearnSelenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Demo {

	public static void main(String[] args) {

		System.setProperty("webdriver.edge.driver",
				"C:\\Users\\HD149PQ\\OneDrive - EY\\Desktop\\SELENIUM\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.get("http://google.com");
		// System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		// System.out.println(driver.getPageSource());
		driver.get("http:yahoo.com");
		driver.navigate().back();

		driver.close();

	}
}
