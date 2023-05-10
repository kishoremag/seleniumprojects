package org.maginita.practice;

import io.cucumber.java.en.Given;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Proxy_deatails
{

@Given("driverversion")
public void driverversion() 
{
  WebDriverManager x = WebDriverManager.chromedriver().driverVersion("");
   x.setup();
   System.out.println("step1");
}

@Given("architecture")
public void architecture() 
{
	 WebDriverManager x = WebDriverManager.chromedriver().arch64();
	   x.setup();
	   System.out.println("step2");
}

@Given("proxyname")
public void proxyname() 
{
	 WebDriverManager x = WebDriverManager.chromedriver().proxy("citrix");
	   x.setup();
	   System.out.println("step3");
}

@Given("proxyuser")
public void proxyuser() 
{
	 WebDriverManager x = WebDriverManager.chromedriver().proxyUser("kishore");
	   x.setup();
	   System.out.println("step4");
}

@Given("proxypassword")
public void proxypassword() 
{
	 WebDriverManager x = WebDriverManager.chromedriver().proxyPass("123456");
	 x.setup();
	   System.out.println("step5");

}
}
