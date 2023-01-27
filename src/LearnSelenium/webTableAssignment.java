package LearnSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class webTableAssignment {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\HD149PQ\\OneDrive - EY\\Desktop\\SELENIUM\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("http://qaclickacademy.com/practice.php");
		WebElement table = driver.findElement(By.cssSelector("table[id='product']"));
		int rowSize = table.findElements(By.tagName("tr")).size();
		System.out.println(rowSize);
		int columSize = table.findElements(By.tagName("tr")).get(0).findElements(By.tagName("th")).size();
		System.out.println(columSize);
		java.util.List<WebElement> secondrow = table.findElements(By.tagName("tr")).get(2)
				.findElements(By.tagName("td"));
		System.out.println(secondrow.get(0).getText());
		System.out.println(secondrow.get(1).getText());
		System.out.println(secondrow.get(2).getText());
	}

}
