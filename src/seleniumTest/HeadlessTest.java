package seleniumTest;

import java.util.Collections;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HeadlessTest {

	public static void main(String[] args) {
		String path = "C:\\Users\\Bikash\\Desktop\\Java Project\\ChromeDriver\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", path);
		ChromeOptions opt = new ChromeOptions();
		// opt.addArguments("--start-maximized");
		// opt.addArguments("disable-infobar");
		opt.addArguments("--headless");

		opt.setExperimentalOption("useAutomationExtension", false);
		opt.setExperimentalOption("excludeSwitches", Collections.singletonList("enable-automation"));

		WebDriver driver = new ChromeDriver(opt);
		// driver.manage().window().maximize();
		driver.get("https://www.google.com");
		System.out.println(driver.getTitle());
	}

}
