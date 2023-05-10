 package MainClass;



import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;

import PagesOnFlights.CheckInBagsPage;
import PagesOnFlights.DepaturePage;
import PagesOnFlights.DestinationPage;
import PagesOnFlights.FlightsHomepage;
import PagesOnFlights.PassengersDetailsPage;
import io.github.bonigarcia.wdm.WebDriverManager;


public class MainFlights {

	public static void main(String[] args) throws Exception 
	{
		
		
	WebDriverManager.chromedriver().setup();
	RemoteWebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	   driver.get("https://www.ryanair.com");
     //define objects
	   
    
	   DepaturePage departpage = new DepaturePage(driver);
	   DestinationPage destpage = new DestinationPage(driver);
	   FlightsHomepage  flightshomepage = new FlightsHomepage (driver);
	   PassengersDetailsPage passengersdtlspage = new PassengersDetailsPage(driver);
	   CheckInBagsPage  checkingbags = new CheckInBagsPage(driver);
	   departpage.clickCokkie();
	   departpage.clickBanner();
	   departpage.fillDeparture("name");
	   destpage.fillDestination("name");
	   destpage.DropDownToDestination();
	   destpage.SelectDestinationName();
	   departpage.chooseDepartFromDate();
	   departpage.selectInDepartDate();
	   departpage.chooseReturnDate();
	   departpage.selectReturnDate();
	   departpage.selectPassengers();
	   departpage.addingPassengers();
        departpage.clickSearch();
        flightshomepage.selectFlight();
        flightshomepage.selectReturnFlight();
        flightshomepage.clickOnContinue();
        flightshomepage.clickOnValueFare();
        passengersdtlspage.clickOnLoginLater();
        passengersdtlspage.clickOnPassengers1();
        passengersdtlspage.title();
        passengersdtlspage.clickOnfirstName1("name");
        passengersdtlspage.clickOnLastName1("name");
        passengersdtlspage.clickOnPassengers2();
        passengersdtlspage.titleofName();
        passengersdtlspage.clickOnfirstName2("name");
        passengersdtlspage.clickOnLasttName2("name");
        passengersdtlspage.clickOnContinue();
        checkingbags.AddingBags();
        checkingbags.clickOnContinue();
        checkingbags.skipToContinue();
        checkingbags.againSkipToContinue();
        checkingbags.goToCheckout();
        
        
       /* obj1.Search.click();*/
        
			  
	}
}
			    
		   
		

	

