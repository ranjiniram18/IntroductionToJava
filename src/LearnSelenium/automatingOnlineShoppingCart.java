package LearnSelenium;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class automatingOnlineShoppingCart {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\HD149PQ\\OneDrive - EY\\Desktop\\SELENIUM\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/");
		String[] veggies = { "Carrot", "Tomato", "Beans" };
		cartAddMethod(driver, veggies);
		placeOrder(driver);

	}

	public static void cartAddMethod(WebDriver driver, String[] veggies) throws InterruptedException {

		List<WebElement> itemList = driver.findElements(By.xpath("//h4[@class='product-name']"));
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		/* Find all the elements with the products name */
		int j = 0;
		for (int i = 0; i < itemList.size(); i++) {

			{
				String[] name = itemList.get(i).getText().split("-");// name[0]=carrot,name[1]=1kg
				String formattedNAme = name[0].trim();
				// check whether the item list contain the itemin the veggies got from the
				// website
				// convert array to array list
				List veggiesArrayList = Arrays.asList(veggies);
				if (veggiesArrayList.contains(formattedNAme)) {

					// Thread.sleep(3000);
					driver.findElements(By.cssSelector("a.increment")).get(i).click();
					driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();

					if (j == veggies.length)

					{

						break;

					}

				}

			}
		}

	}

	public static void placeOrder(WebDriver driver) throws InterruptedException {
		driver.findElement(By.xpath("//img[@alt='Cart']")).click();
		// Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@class='action-block']/button")).click();
		// Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@class='promoCode']")).sendKeys("rahulshettyacademy");
		driver.findElement(By.xpath("//div[@class='promoWrapper']/button")).click();
		System.out.println(driver.findElement(By.xpath("//span[@class='promoInfo']")).getText());

		driver.findElement(By.xpath("//button[contains(text()='Place Order')]")).click();
		// div[@class='promoWrapper']/button
	}

}