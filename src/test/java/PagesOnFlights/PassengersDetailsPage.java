package PagesOnFlights;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PassengersDetailsPage 
{
	@FindBy (xpath = "//span[text()='Log in later']")
	public WebElement LogInLater;
	
	@FindBy (xpath = "(//button[@class='dropdown__toggle b2'])[1]")
	public WebElement ClickOnPassenger1;
	
	@FindBy (xpath = "//*[text()=' Mr '] ")
	public WebElement TitleName1;
	
	@FindBy (xpath = "(//input[@type='text'])[1]")
	public WebElement FirstName1;
	
	@FindBy (xpath = "(//input[@type='text'])[2]")
	public WebElement LastName1;
	
	@FindBy (xpath = "//button[@class='dropdown__toggle b2']")
	public WebElement ClickOnPassenger2;
	
	@FindBy (xpath = "//*[text()=' Mrs ']")
	public WebElement TitleName2;
	
	@FindBy (xpath = "(//input[@type='text'])[3]")
	public WebElement FirstName2;

	@FindBy (xpath = "(//input[@type='text'])[4]")
	public WebElement LastName2;

	@FindBy (xpath = "//button[text()=' Continue '] ")
	public WebElement Continue;
	
	public PassengersDetailsPage(RemoteWebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void clickOnLoginLater() 
	{
		LogInLater.click();
	}
	public void clickOnPassengers1() 
	{
		ClickOnPassenger1.click();
	}
	public void title() 
	{
		TitleName1.click();
	}
	public void clickOnfirstName1(String name) 
	{
		FirstName1.sendKeys("Kishore");
	}
	public void clickOnLastName1(String name) 
	{
		LastName1.sendKeys("Kumar");
	}
	public void clickOnPassengers2() 
	{
		ClickOnPassenger2.click();
	}
	
	public void titleofName() 
	{
		TitleName2.click();
	}
	public void clickOnfirstName2(String name) 
	{
		FirstName2.sendKeys("Deepika");
	}
	public void clickOnLasttName2(String name) 
	{
		LastName2.sendKeys("nair");
	}
	
	public void clickOnContinue() 
	{
		Continue.click();
	}


	
	 
}
