package Scripts;

import org.testng.annotations.Test;
import Genericlib.BasePage;
import Genericlib.Excel;
import POM.HomePage;
import POM.LocationPage;
import POM.LoginPage;

public class SharePinCode extends BasePage
{
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
	
	Thread.sleep(5000);
	h1.shareLocation();         
	
	Thread.sleep(5000);
	LocationPage l2 = new LocationPage(driver); 
	
	Thread.sleep(5000);
	l2.enterLocationPin(Excel.excelSheet(Sheet, 0, 2, path));     
	
	Thread.sleep(5000); 
	l2.submitLocationPin();                                  	
	
	Thread.sleep(10000);
	h1.accountClick();                                      
	
	Thread.sleep(5000);                                  
	h1.signOut();
	}
}
