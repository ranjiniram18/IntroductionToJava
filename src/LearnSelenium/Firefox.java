package LearnSelenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Firefox {

	public static void main(String[] args) {

		System.setProperty("webdriver.gecko.driver",
				"C:\\Users\\HD149PQ\\OneDrive - EY\\Desktop\\SELENIUM\\geckodriver.exe");

		WebDriver driver = new FirefoxDriver();
		driver.get("http://google.com");
		// System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());

	}

}
