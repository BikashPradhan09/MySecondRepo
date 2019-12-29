package seleniumTest;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class ActionFunctionTest {

	public static void main(String[] args) {
		WebDriver driver = FirstSeleniumTest.DriverInitiate();
		driver.get("http://demo.guru99.com/test/newtours/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Actions builder = new Actions(driver);
		WebElement element = driver.findElement(By.linkText("Home"));
		Action mtele= builder.moveToElement(element).build();
		WebElement td_Home = driver
                .findElement(By
                .xpath("//html/body/div"
                + "/table/tbody/tr/td"
                + "/table/tbody/tr/td"
                + "/table/tbody/tr/td"
                + "/table/tbody/tr"));
		String bgColor = td_Home.getCssValue("background-color");
        System.out.println("Before hover: " + bgColor);
		mtele.perform();
		bgColor = td_Home.getCssValue("background-color");
        System.out.println("After hover: " + bgColor);
		
		
	}

}
