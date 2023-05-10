package org.maginita.practice;

import io.cucumber.java.en.Given;

public class Display_value 
{
	@Given("i want to display {int}")
	public void i_want_to_display(Integer y) 
	{
	   System.out.println(y);                                    
	}
}