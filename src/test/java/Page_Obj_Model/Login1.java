package Page_Obj_Model;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login1 {
	
	public WebDriver ldriver;
	
	public Login1(WebDriver d) 
	{
		ldriver=d;
		PageFactory.initElements(ldriver, this);
	}
	@FindBy(id="username") WebElement UN;
	@FindBy(id="password") WebElement PW;
	@FindBy(id="submit") WebElement Submit; 

	
	public void usern(String Uname) 
	{
		UN.sendKeys(Uname);
	}
	public void passw(String Passw) 
	{
		PW.sendKeys(Passw);
	}
	public void Sub() 
	{
		Submit.click();
	}
}
