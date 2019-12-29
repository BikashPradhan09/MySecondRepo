package seleniumTest;

import java.awt.AWTException;
import java.util.Base64;

import org.openqa.selenium.WebDriver;

public class EncodingPass extends FirstSeleniumTest {

	public static String decoder(String str) {

		Base64.Decoder de = Base64.getDecoder();
		return new String(de.decode(str));
	}

	public static void main(String[] args) throws AWTException {

		WebDriver driver = FirstSeleniumTest.DriverInitiate();
		driver.get("https://ecom:" + decoder("ZWMwbQ==") + "@qap.www.ihg.com/hotels/gb/en/reservation/");

//		Alert al = driver.switchTo().alert();
//		al.sendKeys(arg0);

	}

}
