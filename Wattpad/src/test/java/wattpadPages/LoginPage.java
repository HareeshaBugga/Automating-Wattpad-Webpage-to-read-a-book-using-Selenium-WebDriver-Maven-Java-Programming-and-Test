package wattpadPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	WebDriver driver;
	
	@FindBy(how =How.ID , using = "login-username")
	WebElement userNameElement;
	
	@FindBy(how =How.ID , using = "signup-password")
	WebElement passWordElement;
	
	@FindBy(how =How.XPATH , using = "//input[@class = 'btn btn-lg btn-left-align btn-orange btn-block enable']")
	WebElement logInButton;
	
	public LoginPage(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver,this);
	}
	

	public void setUserName(String userName)
	{
		userNameElement.clear();
		userNameElement.sendKeys(userName);
	}

	public void setPassWord(String password)
	{
	passWordElement.clear();
	passWordElement.sendKeys(password);
	}
	
	public void clickOnLogInButton() {
		logInButton.click();
		
	}
	
}

