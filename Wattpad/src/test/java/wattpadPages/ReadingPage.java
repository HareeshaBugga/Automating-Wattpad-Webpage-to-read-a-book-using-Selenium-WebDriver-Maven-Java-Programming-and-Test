package wattpadPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class ReadingPage {
	
	WebDriver driver;
	
	@FindBy(how = How.XPATH, using = "//*[@id=\"tab-content\"]/div[2]/div[1]/div/div[1]/div/img")
	WebElement bookElement;
	
	@FindBy(how = How.XPATH, using = "//button[@class = 'btn btn-block btn-glass btn-left-align on-read']")
	WebElement continueElement;
	
	public ReadingPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public void clickOnBook() {
		Actions actions = new Actions(driver);
		actions.moveToElement(bookElement).build().perform();
	}
	
	public void clickOnContinue() throws InterruptedException {
		Thread.sleep(2000);
		continueElement.click();
	}

}
