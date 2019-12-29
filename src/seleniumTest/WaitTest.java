package seleniumTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitTest {

	public static void main(String[] args) {
		WebDriver driver =FirstSeleniumTest.DriverInitiate();
		driver.get("https://www.guru99.com/");
		WebDriverWait wait = new WebDriverWait(driver, 20);
		WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@class=' maximenuck']//img[contains(@src,'logo')]")));
		System.out.println("Waited so long");
		element.click();
		System.out.println("CLicked");
	}
	void fluentWaitTest(WebDriver driver) {
		
		
	}

}
