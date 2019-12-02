package CollibraLocators;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import UtillFiles.TestBase;

public class CollibraHomePage extends TestBase
{
	//Locator for jpmc logo
	@FindBy(how= How.XPATH,using = "//img[@class='with-hover is-active uf-image']")
	public WebElement jpmclogo;
	
	// locator for jpmc libearies link
	@FindBy(how= How.XPATH,using = "//span[contains(text(),'JPMC Libraries')]")
	public WebElement jpmclibraries;
		
	//Locator for Create
	@FindBy(how= How.XPATH,using = "//button[@class='uf-button-accent uf-button uf-normal-button enabled']")
	public WebElement Create;
		
	//Locator for Search
	@FindBy(how= How.XPATH,using = "//input[@placeholder='Search']")
	public WebElement Search;
		
	//Locator for DataBasket
	@FindBy(how= How.XPATH,using = "//body[@class='js-focus-visible']/div[@id='app']/div/div/div[@class='react-page']/div[@class='region region-content']/div[contains(@class,'vertical-layout')]/div[@id='main-vertical-layout']/div[@class='region region-row2']/nav[@class='uf-layout-navigation uf-layout-top-navigation dgc-main-menu']/div[@class='clearfix']/div[@class='uf-layout-top-navigation-region uf-layout-top-navigation-region--right']/a[@class='uf-layout-top-navigation-element uf-layout-top-navigation-element--with-icon catalog-basket']/*[1]")
	public WebElement DataBasket;
		
	//Locator for Activities
	@FindBy(how= How.XPATH,using = "//div[@class='spinner']")
	public WebElement Activities;
	
	//Locator for Userprofile
	@FindBy(how= How.XPATH,using = "//img[@class='uf-image']")
	public WebElement UserProfile;
		
	//Locator for Userprofile_Profile
	@FindBy(how= How.XPATH,using = "//button[@class='uf-button uf-normal-button enabled']")
	public WebElement Userprofile_profile;
	
	//Locator for Userprofile_SignOut
	@FindBy(how= How.XPATH,using = "//button[@class='uf-button uf-normal-button enabled']")
	public WebElement Userprofile_SignOut;
	
	//Locator for Tasks
	@FindBy(how= How.XPATH,using = "//span[contains(text(),'tasks')]")
	public WebElement Tasks;
	
	//Locator for Dashboad button
	@FindBy(how= How.XPATH,using = "//span[contains(text(),'JPMC Libraries')]")
	public WebElement Dashboard;
			
	//Locator for businessGlossary button
	@FindBy(how= How.XPATH,using = "//span[@class='uf-layout-top-navigation-element__label'][contains(text(),'Dashboard')]")
	public WebElement BusinessGlossary;
			
	//Locator for ReferenceData
	@FindBy(how= How.XPATH,using = "//span[contains(text(),'Reference Data')]")
	public WebElement ReferenceData;
			
	//Locator for Catalog
	@FindBy(how= How.XPATH,using = "//span[contains(text(),'Catalog')]")
	public WebElement Catalog;
			
			
	//Locator for Datahelpdesk
	@FindBy(how= How.XPATH,using = "//span[contains(text(),'Data Helpdesk')]")
	public WebElement DataHelpDask;
			
	//Locator for stewardship
	@FindBy(how= How.XPATH,using = "//span[contains(text(),'Stewardship')]")
	public WebElement Stewardship;
			
	//locator for policy manager
	@FindBy(how= How.XPATH,using = "//span[contains(text(),'Policy Manager')]")
	public WebElement PolicyManager;
			
	//Locator for settings
	@FindBy(how= How.XPATH,using = "//span[contains(text(),'Settings')]")
	public WebElement Settings;
	
	//Initializing the page Objects
	public CollibraHomePage()
	{
		PageFactory.initElements(driver, this);
	}
	
	public String verifyhomepagetitle()
	{
		return driver.getTitle();
	}
	
}
