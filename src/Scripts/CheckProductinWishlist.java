package Scripts;

import org.testng.annotations.Test;

import Genericlib.BasePage;
import POM.HomePage;
import POM.LoginPage;

public class CheckProductinWishlist extends BasePage
{
	@Test
	public void testingScript() throws InterruptedException
	{
		
		HomePage h1 = new HomePage(driver);          
		h1.signIn();
		LoginPage l1 = new LoginPage(driver);         
		l1.username(Genericlib.Excel.excelSheet(Sheet, 0, 0, path));   
		Thread.sleep(5000);
		l1.password(Genericlib.Excel.excelSheet(Sheet, 0, 1, path));
		Thread.sleep(5000);
		l1.login();
		Thread.sleep(5000);
		h1.clickWishlist();
		Thread.sleep(5000);
		h1.accountClick();                     
		Thread.sleep(5000);
		System.out.println(" account click done ");
		h1.signOut();
	}
}
