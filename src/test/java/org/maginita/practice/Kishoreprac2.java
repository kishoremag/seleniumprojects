package org.maginita.practice;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.cucumber.java.en.Given;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Kishoreprac2 
{
     	
	@Given("open {string} browser which version is {string}")
	public void open_browser_which_version_is(String x, String y) 
	
	{
	  if(x.equalsIgnoreCase("chrome")) ;
	  {
		  WebDriverManager.chromedriver().browserVersion(y).setup();
		  
		  RemoteWebDriver  driver = new ChromeDriver();
	  }
	     
	  if(x.equalsIgnoreCase("edge")) ;
	  {
		  WebDriverManager.edgedriver().browserVersion(y).setup();
		  
		  RemoteWebDriver driver = new EdgeDriver();
	  }
	    
	
	
    }
}
