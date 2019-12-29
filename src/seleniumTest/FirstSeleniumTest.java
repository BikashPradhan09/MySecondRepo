package seleniumTest;

import java.util.Collections;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class FirstSeleniumTest {
	@Test
	public static WebDriver DriverInitiate() {

		String path = "C:\\Users\\Bikash\\Desktop\\Java Project\\ChromeDriver\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", path);

		ChromeOptions opt = new ChromeOptions();
		opt.addArguments("--start-maximized");
		opt.setExperimentalOption("useAutomationExtension", false);
		opt.setExperimentalOption("excludeSwitches", Collections.singletonList("enable-automation"));
		// opt.addArguments("--headless");
		// opt.addArguments("disable-infobar");//This is not woring any more

		WebDriver driver = new ChromeDriver(opt);
		// driver.manage().window().maximize();
		// driver.get("https://www.google.com");

		return driver;

	}

}
