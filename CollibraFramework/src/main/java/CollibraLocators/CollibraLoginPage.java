package CollibraLocators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import UtillFiles.TestBase;

public class CollibraLoginPage extends TestBase
{


	@FindBy(xpath="//input[@name='username']")
	WebElement loginName;
	
	@FindBy(name="password")
	WebElement Password;
	
	@FindBy(how=How.XPATH, using = "//button[@class='uf-normal-button uf-button-accent uf-button uf-submit-button enabled']")
	WebElement Signin;

	public Object collibraLoginPage;
	
	//Initializing the page object :
	
	public CollibraLoginPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	//Actions:
	
	public String validateLoginPagetitle()
	{
		return driver.getTitle();
	}
	
	
	public CollibraLoginPage login(String login , String pass)
	{
		loginName.sendKeys(login);
		Password.sendKeys(pass);
		Signin.click();
		 
		
		return new CollibraLoginPage();
		
	}

	
		
	}


