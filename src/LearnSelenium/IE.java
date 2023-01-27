package LearnSelenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class IE {
	public static void main(String[] args) {

		System.setProperty("webdriver.ie.driver",
				"C:\\Users\\HD149PQ\\OneDrive - EY\\Desktop\\SELENIUM\\IEDriverServer.exe");

		WebDriver driver = new InternetExplorerDriver();
		driver.get("http://www.google.com");
		System.out.println(driver.getCurrentUrl());
	}
}
