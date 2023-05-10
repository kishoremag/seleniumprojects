package org.maginita.practice;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import pages.Composepage;
import pages.Homepage;
import pages.LoginNext;
import pages.LogoutPage;

public class Datatable_gmail_Scenario 
{
	public RemoteWebDriver driver;
	public Homepage obj1;
	public LoginNext obj2;
	public Composepage obj3;
	public LogoutPage obj4;
	
	@Given("open {string} the browser")
	public void open_the_browser(String bn) 
	{
	   if(bn.equalsIgnoreCase("chrome"))
	   {
		   WebDriverManager.chromedriver().setup();
		   //define objects
		    driver = new ChromeDriver();
		    obj1 = new Homepage (driver);
		    obj2 = new LoginNext (driver);
		    obj3 = new Composepage (driver);
		    obj4 = new LogoutPage (driver);
		    
	   }
	}

	@Given("launch  the site using {string}")
	public void launch_the_site_using(String url) throws Exception
	
	{
	driver.get(url); 
	Thread.sleep(5000);
	}

	@When("do login using  the {string} and {string} credenatials")
	public void do_login_using_the_and_credenatials(String uid, String pwd) throws Exception 
	{
	    obj1.fillusername(uid);
	    obj1.clickHomenext();
	    obj2.fillPassword(pwd);
	    obj2.clickLoginNext();
	}

	@Then("compose is to  displayed")
	public void compose_is_to_displayed() 
	{
	 if(obj3.iscomposeDisplayed())
	 {
		 System.out.println("compose is displayed");
	 }
	 else
	 {
		 System.out.println("compose is not displayed");
		 System.exit(0);
	 }
	}

	@When("fill fields and send mail and check  the response")
	public void fill_fields_and_send_mail_and_check_the_response(DataTable DT) throws Exception
	{ 
	    //take data from data table 
		List<Map<String,String>> l=DT.asMaps();
		for (int i=0;i<l.size();i++)
		{
			//click on compose();
			obj3.clickcompose();
			//for fields
			obj3.fillto(l.get(i).get("to"));
			obj3.fillsubject(l.get(i).get("subject"));
			obj3.fillbody(l.get(i).get("body"));
		    obj3.fillfilepath(l.get(i).get("attachment"));
		    //send mail
		    obj3.clicksend();
		    //System.out.println(obj3.getoutputmsg());
		    
		}
	}

	@When ("do the logout")
	public void do_the_logout() throws Exception
	{
	obj4.clickprofilepic();
	obj4.clicksignout();
	}
	
	@Then("login the page should be redisplayed")
	public void login_the_page_should_be_redisplayed() 
	{
	if(obj4.isLoginReDisplayed())
			{
		System.out.println("succesful logout");
			}
	else
	{
		
	System.out.println("unsuccesful logout");
	}
	System.exit(0);
	}

	@When("close the site")
	public void close_the_site() 
	{
	   driver.close(); 
	}
}

