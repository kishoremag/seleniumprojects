package org.maginita.practice;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.chrome.ChromeDriver;
 
import org.openqa.selenium.remote.RemoteWebDriver;

import Stripe_Pages.Customers_page;
import Stripe_Pages.Loginpage_stripe;
import Stripe_Pages.Logout_Stripe;
import Stripe_Pages.Recaptcha_page;
import Stripe_Pages.Verification_page;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;



public class Multiple_customerformultiple_users 
{
	public RemoteWebDriver driver;
	public Loginpage_stripe obj1;
	public Customers_page obj2;
	public Logout_Stripe obj3;
	public Recaptcha_page obj4;
	public Verification_page obj5;
	
	@Given("open a {string} browser")
	public void method1 (String bn) 
	{
		   if(bn.equalsIgnoreCase("chrome"))
		   {
			   WebDriverManager.chromedriver().setup();
			   //define objects
			    driver = new ChromeDriver();
			    obj1 = new Loginpage_stripe (driver);
			    obj2 = new Customers_page (driver);
			    obj3 = new Logout_Stripe (driver);
			    obj4 = new Recaptcha_page (driver);
			    obj5 = new Verification_page (driver);
		   }  
	}
			   
	@Given("launch site using {string}")
	public void method2 (String url)  throws Exception
	{
	    driver.get(url);
	    Thread.sleep(5000);
	}

	@When("do login using the  {string} and {string} credentials")
	public void method3 (String uid, String pwd) throws Exception
	{
		obj1.fillusername(uid);
	    obj1.fillpassword(pwd);
	    obj1.clickcontinue();
	    obj4.clickIAMNOTROBOT(driver);
	    obj5.clickskipfornow();
	}

	@Then("customers tab should be displayed")
	public void method4() 
	{
	  if(obj2.iscustomersDisplayed())
	  {
		  System.out.println("customers link is displayed");
	  }
	  else
	  {
		  System.out.println("customers link is not displayed");
	  }
	}

	@When("add customers and verify")
	public void method5(io.cucumber.datatable.DataTable DT) throws Exception
	{
		 //take data from data table 
		List<Map<String,String>> l=DT.asMaps();
		for (int i=0;i<l.size();i++)
		{
			//click on Customers();
			obj2.clickcustomers();
			
			
			//fill for fields
			
			
			obj2.clickaddcustomer();
			obj2.fillName(l.get(i).get("name"));
			obj2.fillEmail(l.get(i).get("email"));
		    obj2.fillDescription(l.get(i).get("description"));
		    obj2.clickAdd();
		    
		    //Verify output message
		    if(obj2.isOutputmsgDisplayed())
			  {
				  System.out.println("Successful adding of a customer");
			  }
			  else
			  {
				  System.out.println("UnSuccessful adding of a customer");
			  }
			}
	}

	@When("do logout the site")
	public void method6()  throws Exception
	{
		obj3.clickprofiepic();
		obj3.clickSignout();
	}
	
	 

	@Then("login page should be redisplaed")
	public void method7() 
	{
	if(obj3.isLoginReDisplayed())
	{
System.out.println("succesful logout");
	}
else

{

System.out.println("unsuccesful logout");
 }
System.exit(0);
 }
 
	
	@When("close the  site")
	public void method8() 
	{
	    driver.close(); 
	}
	
}
		
	
	

	