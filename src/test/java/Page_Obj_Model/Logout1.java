package Page_Obj_Model;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Logout1 {
	
	public static WebDriver Cdriver;
	
	public Logout1(WebDriver CD) 
	{
		Cdriver=CD;
		PageFactory.initElements(Cdriver, this);
	}
	@FindBy(xpath="//a[text()='Log out']") WebElement CL;

	public void Click() 
	{
		CL.click();
	}
}

	