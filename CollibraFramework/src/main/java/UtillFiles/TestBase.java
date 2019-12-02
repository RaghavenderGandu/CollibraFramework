package UtillFiles;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestBase {

	public static WebDriver driver;
	public static Properties prop;
	public static void initialization() {
		String browsername = prop.getProperty("browser");
		if (browsername.equals("chrome")) {
			WebDriverManager.chromedriver().version("77.0.3865").setup();
			driver = new ChromeDriver();
		} else if (browsername.equals("FF")) {
			WebDriverManager.firefoxdriver().arch64().setup();
			driver = new FirefoxDriver();
		}

		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		// driver.manage().timeouts().implicitlyWait(testutill.implicitwait,
		// TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(testutill.pageloadtimeout, TimeUnit.SECONDS);

		driver.get(prop.getProperty("url"));

	}
	public TestBase() {
		String dir = System.getProperty("user.dir");
		try {
			prop = new Properties();
			FileInputStream fis = new FileInputStream(dir + "\\src\\main\\java\\PropertyFile\\Propertyfile");
			prop.load(fis);
		} catch (IOException e) {
			e.getMessage();
		}

	}

	

}
