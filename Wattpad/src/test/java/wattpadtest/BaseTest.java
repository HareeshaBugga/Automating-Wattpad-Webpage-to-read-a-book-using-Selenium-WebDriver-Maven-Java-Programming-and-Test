package wattpadtest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

import com.wattpad.constants.Constants;
import com.wattpad.utils.ReadProperties;

public class BaseTest implements Constants {
	WebDriver driver;
	ReadProperties properties;

	@Parameters({ "browser" })
	@BeforeClass
	public void beforeMethodInBase(@Optional(browser_chrome) String browser) {
		properties = new ReadProperties("./src/test/resources/config.properties");
		String gecko_driver_path = properties.getPropertyValue(property_gecko_driver_path);
		String chrome_driver_path = properties.getPropertyValue(property_chrome_driver_path);
		String url = properties.getPropertyValue(property_url);

	/*	switch (browser) {
		case "chrome":
			System.setProperty(key_Webdriver_chrome_driver, chrome_driver_path);
			driver = new ChromeDriver();
			break;

		case "firefox":
			System.setProperty(key_Webdriver_gecko_driver, gecko_driver_path);
			driver = new FirefoxDriver();
			break;
		}*/

		if (browser.equalsIgnoreCase(browser_chrome)) {
			System.setProperty(key_Webdriver_chrome_driver, chrome_driver_path);
			driver = new ChromeDriver();
		} else if (browser.equalsIgnoreCase(browser_firefox)) {
			System.setProperty(key_Webdriver_gecko_driver, gecko_driver_path);
			driver = new FirefoxDriver();
		}

		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}

	@AfterClass
	public void teardown() throws InterruptedException {
		Thread.sleep(5000);
		driver.close();

	}

}
