package StepDifination;

import org.openqa.selenium.chrome.ChromeDriver;

import Page_Obj_Model.Login1;
import Page_Obj_Model.Logout1;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;

public class StepDifinationCla1 extends BaseClass1
{
	@Given("user launch chrome browser")
	public void user_launch_chrome_browser() 
	{
	    driver=new ChromeDriver();
	    lg=new Login1(driver);
	}

	@When("user open ulr {string}")
	public void user_open_ulr(String url) 
	{
	    
		driver.get(url);
	}

	@When("user enter the username {string} and password as {string}")
	public void user_enter_the_username_and_password_as(String usern, String passw) 
	{
	    lg.usern(usern);
	    lg.passw(passw);
	}

	@When("click on submit button")
	public void click_on_submit_button() 
	{
	    lg.Sub();
	}

	@Then("Page title should be {string}")
	public void page_title_should_be(String ExpTitle) 
	{
	    String ActTitle=driver.getTitle();
	    Assert.assertEquals(ActTitle, ExpTitle);
	}


	@When("user click on logout button")
	public void user_click_on_logout_button()
	{
		lg2=new Logout1(driver);
	    lg2.Click();
	}
	@Then("close browser")
	public void close_browser() 
	{
	   
	}

	
	

}
