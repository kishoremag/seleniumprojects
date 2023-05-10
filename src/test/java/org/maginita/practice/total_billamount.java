package org.maginita.practice;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class total_billamount 
{

@Given("user is on billing page")
public void user_is_on_billing_page() 
{
  System.out.println("step1");
}

@When("user enters billing amount {string}")
public void user_enters_billing_amount(String string)
{
	System.out.println("step2");
}

@When("user enters tax amount {string}")
public void user_enters_tax_amount(String string) 
{
	System.out.println("step3");
}

@When("user clicks on calculate button")
public void user_clicks_on_calculate_button() 
{
	System.out.println("step4");
}

@Then("it gives the final amount {string}")
public void it_gives_the_final_amount(String string) 
{
	System.out.println("step5");
}
}
