package PagesOnFlights;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DestinationPage 
{
	public RemoteWebDriver driver;
	@FindBy(xpath ="//input[@placeholder='Destination']")
	public WebElement Destination;
	
	@FindBy(xpath ="//span[text()='Popular attractions']")
	public WebElement DownToPopularDestination;
	
	@FindBy(xpath = "//div[text() =' London Stansted ']")
	public WebElement SelectLondonStansted;
	
	public DestinationPage(RemoteWebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	public void fillDestination(String name)
	{
		Destination.sendKeys("London Stansted");	
	}
	
	public void DropDownToDestination() throws Exception
	{
		DownToPopularDestination.click();
		Thread.sleep(5000);
	}
	
	public void SelectDestinationName() throws Exception 
	{
	
		SelectLondonStansted.click();
		Thread.sleep(5000);
		
	}
	
	
}

