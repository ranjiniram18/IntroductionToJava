
package LearnSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class completeSpicejetAutomation {
	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\HD149PQ\\OneDrive - EY\\Desktop\\SELENIUM\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		/* Open the browser */
		driver.get("http://spicejet.com");
		/* Click on the radio button for oneway/two wayS */
		driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();

		/* Select the from station of the flight DYNAMIC DROP DOWN */
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXTaction")).click();
		driver.findElement(By.xpath("//a[@value='ATQ']")).click();
		Thread.sleep(2000);

		/* Select the Destination station of the flight DYNAMIC DROP DOWN */

		driver.findElement(By.xpath("(//a[@value='MAA'])[2]")).click();

		/* Select the current date CALENDER OPTION */
		driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight.ui-state-active")).click();
		driver.findElement(By.id("ctl00_mainContent_view_date2")).click();
		driver.findElement(By.cssSelector(".ui-state-default.ui-state-active")).click();

		/* Select the number of persons BY ADD OPTION */
		driver.findElement(By.id("divpaxinfo")).click();
		WebElement person = driver.findElement(By.id("ctl00_mainContent_ddl_Adult"));

		Select adultdrpdown = new Select(person);
		int i = 1;
		while (i < 5) {
			adultdrpdown.selectByIndex(i);
			adultdrpdown.getFirstSelectedOption().click();
			i++;
		}
		/* Click on the check box */
		driver.findElement(By.id("ctl00_mainContent_chk_SeniorCitizenDiscount")).click();
		System.out.println(driver.findElement(By.id("ctl00_mainContent_chk_SeniorCitizenDiscount")).isEnabled());

		/* Select the currency */
		WebElement Ddpractise = driver.findElement(By.name("ctl00$mainContent$DropDownListCurrency"));
		Select dropdown = new Select(Ddpractise);
		dropdown.selectByIndex(3);
		System.out.println(dropdown.getFirstSelectedOption().getText());

		/* click on the search button */
		driver.findElement(By.id("ctl00_mainContent_btn_FindFlights")).click();

	}

}