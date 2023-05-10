package org.maginita.practice;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class userlogin 
{
	@Given("open browser")
	public void open_browser() 
	{
	 System.out.println("step1");    
	}

	@When("launch site")
	public void launch_site() 
	{
	    System.out.println("step2");
	}

	@Then("tittle should be google")
	public void tittle_should_be_google() 
	{
		System.out.println("step3");
	}

	@When("enter {string}")
	public void enter(String string) 
	{
		System.out.println("step4"); 
	}

	@When("click on sigin button")
	public void click_on_sigin_button() 
	{
	System.out.println("step5");
	}

	@Then("next page should be displayed")
	public void next_page_should_be_displayed() 
	{
		System.out.println("step6");

}
}
