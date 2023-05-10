package PagesOnFlights;


import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



public class DepaturePage 
{
public RemoteWebDriver driver;


@FindBy(xpath = "//button[@class='cookie-popup-with-overlay__button']")	
public WebElement Cookie;

@FindBy(xpath = "(//*[@class ='_container icon-24'])[6]")
public WebElement Banner;

@FindBy(xpath ="//input[@placeholder='Departure']")
public WebElement Departure;


@FindBy(xpath = "(//div[@class='input-button__input ng-star-inserted'])[1]")
public WebElement DepartChooseDate ;

@FindBy(xpath = "//div[@data-id='2022-09-16']")
public WebElement DepartSelectDate;
/*(//div[@data-value='16'])[1]
		//div[@data-value='23'])[1
*/
@FindBy(xpath = "(//div[@class='input-button__input ng-star-inserted'])[2]")
public WebElement ReturnChooseDate;

@FindBy(xpath = "//div[@data-id='2022-10-16']")
public WebElement ReturnSelectDate;


@FindBy(xpath = "(//div[@data-ref = 'input-button__display-value'])[3]")
public WebElement Passengers;

@FindBy(xpath = "(//div[@data-ref='counter.counter__increment'])[1]")
public WebElement AddingPassengers;

@FindBy(xpath = "//span[text()='Search']")
public WebElement Search;





/*@FindBy(xpath = "//span[text()='Search']/parent::button")(//div[@data-value='30'])[2],
 * (//div[@data-ref = 'input-button__display-value'])[3],
 * //ry-counter-button[@aria-label='1Adults+1'],
 *  //span[text()=' London Stansted ']
 * 
public WebElement Search;*/
 
public DepaturePage(RemoteWebDriver driver)
{
PageFactory.initElements(driver,this);
}

public void clickCokkie()
{
      Cookie.click();
}
public void clickBanner()
{
	Banner.click();
}
public void fillDeparture(String name)
{
	  Departure.sendKeys(Keys.chord(Keys.CONTROL,"a"),Keys.chord(Keys.CONTROL.BACK_SPACE));
      Departure.sendKeys("Kerry");
}

public void chooseDepartFromDate() throws Exception
{
	
	Thread.sleep(2000);
	
	
}
public void selectInDepartDate() throws Exception 
{
	DepartSelectDate.click();
Thread.sleep(2000);
	
}
public void chooseReturnDate() throws Exception 
{
	
	driver.executeScript("arguments[0].scrollIntoView();", ReturnChooseDate);
			
	ReturnChooseDate.click();
	Thread.sleep(5000);

}
public void selectReturnDate() throws Exception 
{
	ReturnSelectDate.click();
	Thread.sleep(5000);

}
public void selectPassengers() 
{
	Passengers.click();
		
}
public void addingPassengers() 
{
	AddingPassengers.click();
	
	
}

public void clickSearch()
{
	Search.click();
}
}
