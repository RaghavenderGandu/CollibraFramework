package UtillFiles;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestBase
{

	public static WebDriver driver;
	public static Properties prop;

	public TestBase()
	{
		try
		{
			prop = new Properties();
			FileInputStream fis=new FileInputStream("R:\\Selenium workspace\\CollibraFramework\\src\\main\\java\\PropertyFile\\Propertyfile");
			prop.load(fis);
		}
		catch (IOException e)
		{
			e.getMessage();
		}
		
	}
	
	public static void initialization()
	{
		String browsername = prop.getProperty("browser");
	if(browsername.equals("chrome"))
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ragavendra\\Desktop\\chromedriver.exe");
		driver = new ChromeDriver();
	}
	else if(browsername.equals("FF"))
	{
		System.setProperty("", "");
	}
	
	
	

	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	driver.manage().timeouts().implicitlyWait(testutill.implicitwait, TimeUnit.SECONDS);
	driver.manage().timeouts().pageLoadTimeout(testutill.pageloadtimeout, TimeUnit.SECONDS);
	
	driver.get(prop.getProperty("url"));
	
	
	
	
}
	
}
