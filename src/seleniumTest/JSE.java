package seleniumTest;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class JSE {

	public static void main(String[] args) {

		WebDriver driver = FirstSeleniumTest.DriverInitiate();
		driver.get("https://www.guru99.com/execute-javascript-selenium-webdriver.html");

		JavascriptExecutor js = (JavascriptExecutor) driver;
//		js.executeScript("alert('Welcome to Guru99');");
		js.executeScript("arguments[0].scrollIntoView();", driver.findElement(By.cssSelector(".next>a")));

	}

}
