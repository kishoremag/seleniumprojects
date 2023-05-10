package org.maginita.practice;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Uber_App 
{
	@Given("User wants to select a car type {string} from Uber app")
	public void user_wants_to_select_a_car_type_from_uber_app(String cartype) 
	{
	    System.out.println("step1 :"+cartype);    
	}

	@When("User select a car {string} and pick up point {string} and drop location {string}")
	public void user_select_a_car_and_pick_up_point_and_drop_location(String  cartype, String pickuppoint , String  droplocation ) 
	{
		System.out.println("step2:"+cartype +" " + pickuppoint +" "+droplocation);
	}

	@Then("Driver starts the journey")
	public void driver_starts_the_journey() 
	{
		System.out.println("step3");
	}

	@Then("Driver ends the journey")
	public void driver_ends_the_journey() 
	{
		System.out.println("step4");
	}

	@Then("User pay the amount {int} UD")
	public void user_pay_the_amount_ud(Integer price) 
	{
		System.out.println("step5:"+price);  
}
}
