package PagesOnFlights;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FlightSeatsBookingPage 
{
	//kerrytToLondon
	@FindBy (xpath = "(//button[@id=\"seat-02A\"]")
	public WebElement Seat1;

	@FindBy (xpath = "//button[@id=\"seat-02B\"]")
	public WebElement Seat2;
	
	//Returntfromlondontokerry

	@FindBy (xpath = "//button[text()=' Next flight ']")
	public WebElement NextFlight;

	@FindBy (xpath = "//button[@id=\"seat-02A\"]")
	public WebElement Seat3;
	@FindBy (xpath = "//button[@id=\"seat-02B\"]")
	public WebElement Seat4;
	@FindBy (xpath = "//button[text()=' Continue ']")
	public WebElement ClickOnContinue;
	@FindBy (xpath = "//button[text()=' No, thanks ']")
	public WebElement ClickOnNoThanks;
	




	public FlightSeatsBookingPage(RemoteWebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	public void selectFlightSeat1()
	{
		Seat1.click();
	}

	public void selectFlightSeat2()
	{
		Seat2.click();
	}

	public void clickOnNextFlight()
	{
		NextFlight.click();
	}

	public void selectFlightSeat3()
	{
		Seat3.click();
	}
	public void selectFlightSeat4()
	{
		Seat4.click();
	}
	public void clickOnContinue()
	{
		ClickOnContinue.click();
	}
	public void clickOnNoThanks()
	{
		ClickOnNoThanks.click();
	}
	



}
