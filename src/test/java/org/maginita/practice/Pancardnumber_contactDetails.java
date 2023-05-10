 package org.maginita.practice;

	import io.cucumber.java.ParameterType;
	import io.cucumber.java.en.Given;

	public class Pancardnumber_contactDetails 
	{
	@ParameterType(name ="pancard",value ="\"[a-z]{5}[0-9]{4}[a-z]\"")
	  public String gettype(String x)
	  {
		return(x);
	  }
	@ParameterType(name ="contactnumber",value ="[6-9][0-9] {9}")
	public String get(String y)
	{
		return("+91"+ y);
	}

		@Given("user pancard number is {string}")
		public void user_pancard_number_is(String x) 
		{
		System.out.println(x);	
		} 

		@Given("user contact is {string}")
		public void user_contact_is(String y) 
		{

			System.out.println(y);
		}

	}
