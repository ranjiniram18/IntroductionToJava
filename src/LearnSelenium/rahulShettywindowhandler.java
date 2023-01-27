package LearnSelenium;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class rahulShettywindowhandler {

	public static void main(String[] args) throws InterruptedException {

// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\HD149PQ\\OneDrive - EY\\Desktop\\SELENIUM\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("http://the-internet.herokuapp.com/");

		driver.findElement(By.xpath("//a[@href='/windows']")).click();

		driver.findElement(By.xpath("//a[@href='/windows/new']")).click();
		Set<String> windows = driver.getWindowHandles(); // [parentid,childid,subchildId]

		Iterator<String> it = windows.iterator();

		String parentId = it.next();
		driver.switchTo().window(it.next());

		String printText = driver.findElement(By.cssSelector("div.example")).getText();
		System.out.println(printText);

		driver.switchTo().window(parentId);

		String printText1 = driver.findElement(By.xpath("//div[@id='content'] /div/h3")).getText();
		System.out.println(printText1);

	}

}
