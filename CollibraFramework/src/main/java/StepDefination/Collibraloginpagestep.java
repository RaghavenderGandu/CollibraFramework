package StepDefination;

import CollibraLocators.CollibraLoginPage;
import UtillFiles.TestBase;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class Collibraloginpagestep extends TestBase
{
	CollibraLoginPage login ;

	@Given("^i want to navigate to collibra login page$")
	public void i_want_to_navigate_to_collibra_login_page()
	{
	 
		
		TestBase.initialization();
		
	}

	@And("^Enter valid username and password$")
	public void enter_valid_username_and_password() 
	{
		
		login=new CollibraLoginPage();
	login.login(prop.getProperty("LoginUsername"), prop.getProperty("LoginPassword"));
		
	}

	@And("Click on login button")
	public void click_on_login_button() 
	{
	    
	}

	@Then("verify that user able to login the application")
	public void verify_that_user_able_to_login_the_application() 
	{
	    
	}


	
}
