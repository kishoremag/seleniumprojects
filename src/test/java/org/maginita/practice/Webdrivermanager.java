package org.maginita.practice;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.openqa.selenium.opera.OperaOptions;

import io.cucumber.java.en.Given;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Webdrivermanager 
{
	@Given("i want to open chrome browser")
	public void i_want_to_open_chrome_browser()
	{
		WebDriverManager.chromedriver().arch64().setup();
				
		ChromeDriver driver = new ChromeDriver(); 
		
		driver.get("http://www.google.co.in"); 
	}

	@Given("i want to open opera browser")
	public void i_want_to_open_opera_browser() 
	{
		  WebDriverManager.operadriver().setup();
		  OperaOptions OO = new OperaOptions();
		  OO.setBinary("C:\\Users\\Chinna\\AppData\\Roaming\\Microsoft\\Windows\\Start Menu\\Programs");
		  OperaDriver driver = new OperaDriver();
		driver.get("http://www.google.co.in");
		}

@Given("i want to open edge browser")
public void i_want_to_open_edge_browser() 
{ 
	WebDriverManager.edgedriver().setup();
 
	EdgeDriver driver = new EdgeDriver();
	driver.get("http://www.google.co.in");
}

public static Object chromeDriver() {
	// TODO Auto-generated method stub
	return null;
}
}