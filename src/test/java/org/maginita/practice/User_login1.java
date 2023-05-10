package org.maginita.practice;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class User_login1 
{
	@Then("title should be google")
	public void method1() 
	{
      System.out.println("title should be google");	   
	}

	@When("click on signin button")
	public void method2()
	{
	  System.out.println("click on signin button");  
	}
}
