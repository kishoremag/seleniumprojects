package org.maginita.practice;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Rapido_Bike 
{

@Given("user want to select a bike in rapido app")
public void user_want_to_select_a_bike_in_rapido_app() 
{
   System.out.println("Step1"); 
}

@When("user select bike then pickuplocation is {string} and droplocation is {string}")
public void user_select_bike_then_pickuplocation_is_and_droplocation_is(String pickuplocation , String droplocation) 
{
	System.out.println("Step2:"+pickuplocation+" "+droplocation);    
}

@Then("driver sarts the journey")
public void driver_sarts_the_journey() 
{
	System.out.println("Step3"); 
}

@Then("end the journey")
public void end_the_journey() 
{
	System.out.println("Step4"); 
}

@Then("user pay {int} rupees amount")
public void user_pay_rupees_amount(Integer amount) 
{
	System.out.println("Step5:"+amount); 
}

}
