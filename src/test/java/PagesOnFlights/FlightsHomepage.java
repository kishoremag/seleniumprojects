package PagesOnFlights;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FlightsHomepage 
{
@FindBy (xpath = "(//button[text()=' Select '])[1]")
public WebElement SelectFlight;

//button[text()=' Select ']

@FindBy (xpath = "//button[text()=' Select ']")
public WebElement SelectReturnFlight;

@FindBy (xpath = "//button[text()='//span[text()=' Continue for '] ")
public WebElement ClickOnContinue;

@FindBy (xpath = "//button[text()=' Continue with Value fare ']")
public WebElement ClickOnValueFare;




public FlightsHomepage(RemoteWebDriver driver)
{
	PageFactory.initElements(driver, this);
}

public void selectFlight()
{
	SelectFlight.click();
}

public void selectReturnFlight()
{
	SelectReturnFlight.click();
}

public void clickOnContinue()
{
	ClickOnContinue.click();
}

public void clickOnValueFare()
{
	ClickOnValueFare.click();
}



}

