package testNGTest;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import seleniumTest.FirstSeleniumTest;

public class DataProviderTest {

	@DataProvider(name = "keyword")
	public String[] getKeywords() {
		return new String[] { "Bikash", "Loves India", "I Love my India", "Always will", "Always was" };
	}

	@Test(dataProvider = "keyword")
	public void googleSearch(String keyword) {
		WebDriver driver = FirstSeleniumTest.DriverInitiate();
		driver.get("https://www.google.com");

		driver.findElement(By.cssSelector("input[type='text']")).sendKeys(keyword);

		driver.findElement(By.cssSelector("input[type='text']")).sendKeys(Keys.ENTER);

		driver.quit();
	}
}
