package Scripts;

import org.testng.annotations.Test;

import Genericlib.BaseTest;
import POM.HomePage;
import POM.LoginPage;
import POM.MyProfile;

public class ChangePassword extends BaseTest{
	@Test
	public void testingScript() throws InterruptedException
	{
		
		HomePage h1 = new HomePage(driver);
		h1.signIn();
		
		LoginPage l1 = new LoginPage(driver);
		Thread.sleep(5000);                                                
		l1.username(Genericlib.Excel.excelSheet(Sheet, 0, 0, path));
		Thread.sleep(5000);
		l1.password(Genericlib.Excel.excelSheet(Sheet, 0, 1, path));
		Thread.sleep(5000);
		l1.login();
		
		h1.accountClick();
		Thread.sleep(5000); 
		h1.myprofileClick();
		Thread.sleep(5000); 
		
		
		MyProfile m1 = new MyProfile(driver);
		m1. clickChangepwd();
		Thread.sleep(5000); 
		m1.changePassword("shopclues","SHOPCLUES123");
		Thread.sleep(5000); 
		m1.clickChangePwdButton();
		Thread.sleep(5000); 
		
		h1.accountClick();
		Thread.sleep(5000);
		
		h1.signOut();
	}

}
