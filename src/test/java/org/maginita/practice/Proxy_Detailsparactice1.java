package org.maginita.practice;

import io.cucumber.java.en.Given;
import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.bonigarcia.wdm.config.Architecture;

public class Proxy_Detailsparactice1 
{

@Given("the driverversion")
public void the_driverversion()  
{
	WebDriverManager x = WebDriverManager.chromedriver().driverVersion("");
	   x.setup();
	   System.out.println("step1");
}

@Given("open browserversion")
public void open_browserversion()
{
	WebDriverManager x = WebDriverManager.operadriver().browserVersion("");
	   x.setup();
	   System.out.println("step2");                                                                                                                                                                                                                                                                                                                                                                                                                                                                        
}

@Given("open architecture")
public void open_architecture() 
{
	WebDriverManager x = WebDriverManager.operadriver().architecture(Architecture.X64);
	   x.setup();
	   System.out.println("step3");  
}

@Given("write proxyname")
public void write_proxyname()
{
	WebDriverManager x = WebDriverManager.operadriver().proxy("citrix");
	   x.setup();
	   System.out.println("step4");
}

@Given("write proxyuser")
public void write_proxyuser() 
{
	WebDriverManager x = WebDriverManager.operadriver().proxy("kishore");
	   x.setup();
	   System.out.println("step5"); 
}

@Given("write proxypassword")
public void write_proxypassword() 
{
	WebDriverManager x = WebDriverManager.operadriver().proxy("3456");
	   x.setup();
	   System.out.println("step6");   
}

}
