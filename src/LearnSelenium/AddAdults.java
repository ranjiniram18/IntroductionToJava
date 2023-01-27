package LearnSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AddAdults {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\HD149PQ\\OneDrive - EY\\Desktop\\SELENIUM\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.spicejet.com/");
		driver.findElement(By.id("divpaxinfo")).click();

		WebElement adultele = driver.findElement(By.id("ctl00_mainContent_ddl_Adult"));
		Select dropdown = new Select(adultele);
		// dropdown.selectByIndex(0);
		dropdown.getFirstSelectedOption().click();
		System.out.println(dropdown.getFirstSelectedOption().getText());
		System.out.println();

		int i = 1;
		while (i < 5) {
			dropdown.selectByIndex(i);
			System.out.println(dropdown.getFirstSelectedOption().getText());
			dropdown.getFirstSelectedOption().click();
			i++;

		}
	}
}
