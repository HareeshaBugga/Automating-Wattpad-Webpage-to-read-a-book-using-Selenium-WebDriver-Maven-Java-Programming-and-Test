package wattpadPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class ProfilePage {
	
	WebDriver driver;
	
	@FindBy(how = How.XPATH   , using = "//*[@id=\"profile-dropdown\"]/a")
	WebElement profileElement;
	
	@FindBy(how = How.XPATH   , using = "//*[@id=\"profile-dropdown\"]/div[2]/ul/li[7]/a")
	WebElement libraryElement;
	
	public ProfilePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	
	public void clickOnProfile() {
		profileElement.click();
	}
	
	public void clickOnLibrary() {
		libraryElement.click();
	}
}
