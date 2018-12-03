package wattpadtest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import wattpadPages.HomePage;
import wattpadPages.LoginPage;
import wattpadPages.ProfilePage;
import wattpadPages.ReadingPage;


public class ReadABook extends BaseTest{
	
	HomePage hpage;
	LoginPage lpage;
	ProfilePage ppage;
	ReadingPage rpage;
	
	
	@BeforeMethod
	public void setUp() {

		
		lpage = new LoginPage(driver);
		hpage = new HomePage(driver);  
		rpage = new ReadingPage(driver);
		ppage = new ProfilePage(driver);
		
		
	}
	
	
	@Test(priority = 1)
	public void clickOnLoginButton() {
		hpage.clickOnLoginLink();
		
	}
	
	@Test(priority = 2)
	public void testLoginWithValidCredentials() {
		lpage.setUserName("use user email address or username");
		lpage.setPassWord("enter password here");
		lpage.clickOnLogInButton();
	}
	
	@Test(priority = 3)
	public void clickOnProfile() {
		ppage.clickOnProfile();
		ppage.clickOnLibrary();
}
	
	@Test(priority = 4)
	public void readBook() throws InterruptedException {
		rpage.clickOnBook();
		rpage.clickOnContinue();

	}


}
