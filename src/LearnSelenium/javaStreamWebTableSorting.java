package LearnSelenium;

import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class javaStreamWebTableSorting {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\HD149PQ\\OneDrive - EY\\Desktop\\SELENIUM\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
		driver.findElement(By.xpath("//tr/th[1]")).click();
		List<WebElement> veg = driver.findElements(By.xpath("//tr/td[1]"));

		List<String> Veggies = veg.stream().map(s -> s.getText()).collect(Collectors.toList());
		System.out.println(Veggies);
		List<String> sortedVeggies = Veggies.stream().sorted().collect(Collectors.toList());
		// Assert.assertTrue(sortedVeggies.equals(Veggies));// Needs TestNG jar to
		// execute assertions

	}
}
