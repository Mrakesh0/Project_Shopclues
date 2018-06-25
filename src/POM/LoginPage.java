package POM;
import Genericlib.BasePage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BasePage
{

	@FindBy(id="main_user_login")
	private WebElement usertb;
	
	@FindBy(name="password")
	private WebElement pwdtb;
	
	@FindBy(xpath="//*[@id='login_button']") 
	private WebElement loginbtn;
	
	public LoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void username(String str)  
	{
		usertb.sendKeys(str);
	}
	
	public void password(String str) 
	{
		pwdtb.sendKeys(str);
	}
	
	public void login() 
	{
		loginbtn.click();
	}

}
