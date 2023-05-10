package PagesOnFlights;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckInBagsPage 
{
	@FindBy (xpath = "(//div[@class='product-selector__control'])[2]")
	public WebElement SelectBag;
	
	@FindBy (xpath = "//button[@class = 'ry-button--gradient-yellow']")
	public WebElement ClickOnContinue;
	
	@FindBy (xpath = "//button[text()=' Continue '] ")
	public WebElement SkipToContinue;
	
	@FindBy (xpath = "//button[@color='gradient-yellow']")
	public WebElement AgainSkipToContinue;
	
	@FindBy (xpath = "//button[text()=' Go to checkout ']")
	public WebElement GoToCheckout;
	
	
	public CheckInBagsPage(RemoteWebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void AddingBags() 
	{
		SelectBag.click();
	}
	public void clickOnContinue() 
	{
		ClickOnContinue.click();
	}
	public void skipToContinue() 
	{
		SkipToContinue.click();
	}
	public void againSkipToContinue() 
	{
		AgainSkipToContinue.click();
	}
	public void goToCheckout() 
	{
		GoToCheckout.click();
	}
	
	

	
}
