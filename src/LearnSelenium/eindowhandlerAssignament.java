package LearnSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class eindowhandlerAssignament {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\HD149PQ\\OneDrive - EY\\Desktop\\SELENIUM\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("http://qaclickacademy.com/practice.php");

		driver.findElement(By.id("checkBoxOption2")).click();
		String str = driver.findElement(By.xpath("//div[@id='checkbox-example']/fieldset/label[2]")).getText();
		driver.findElement(By.name("enter-name")).sendKeys(str);
		driver.findElement(By.id("alertbtn")).click();
		String str1 = driver.switchTo().alert().getText();

	}
}
