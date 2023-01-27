package LearnSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class autoSuggestiveDropdown {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\HD149PQ\\OneDrive - EY\\Desktop\\SELENIUM\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.findElement(By.name("ctl00$mainContent$chk_SeniorCitizenDiscount")).click();
		System.out.println(driver.findElement(By.name("ctl00$mainContent$chk_SeniorCitizenDiscount")).isSelected());

		System.out.println(driver.findElements(By.cssSelector("[input[type='checkbox')")).size());

		// driver.findElement(By.id("autosuggest")).sendKeys("ind");
		// Thread.sleep(3000);

		// List<WebElement> options =
		// driver.findElements(By.cssSelector("li[class='ui-menu-item'] a"));

		// for (WebElement option : options)

		// {

		// if (option.getText().equalsIgnoreCase("India"))

		// {

		// option.click();

		// break;

		// }
		// driver.findElement(By.id("autosuggest")).sendKeys("ind");

		// List<WebElement> options =
		// driver.findElements(By.cssSelector("li[class='ui-menu-item']a"));
		// for (WebElement a : options) {
		// if (a.getText().equalsIgnoreCase("india")) {
		// a.click();
		// }
		// {

		// }
	}
}
