package org.maginita.practice;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Secured_browser 
{
	RemoteWebDriver Driver;

	@Given("open {string} browser")
	public void open_browser(String x) 
	{
	if(x.equalsIgnoreCase("chrome"))
	{
	 WebDriverManager.chromedriver().setup();
	 Driver = new ChromeDriver();
	 Driver.get("http://www.google.co.in");
	}
	else if(x.equalsIgnoreCase("opera"))
	{
		WebDriverManager.operadriver().setup();
		 Driver = new OperaDriver();
		 Driver.get("http://www.google.co.in");
	}
	else
	{
		WebDriverManager.edgedriver().setup();
		 Driver = new EdgeDriver();
		 Driver.get("http://www.google.co.in");
	}
	}

	@When("launch the  {string} site")
	public void launch_the_site(String x) throws Exception 
	{
		Driver.get(x);
	 Thread.sleep(5000);    
	}

	@Then("tittle should be contains {string}")
	public void tittle_should_be_contains(String x)
	{
	 String y = Driver.getTitle();
	 if(y.contains(x))
	 {
		 	System.out.println(" title test is passed");
	    	
	    }
	    	
	    else
	    {
	    	System.out.println(" title test is failed");
	    }
	    
	}
	@Then("site should be secured")
	public void site_should_be_secured() 
	{
	    String y = Driver.getCurrentUrl();
	    if(y.startsWith("https"))
	    {
	    	System.out.println("secured site");
	    	
	    }
	    	
	    else
	    {
	    	System.out.println("unsecured site");
	    }
	    
	}

	@When("closesite")
	public void closesite() 
	{
	   
	}
}
