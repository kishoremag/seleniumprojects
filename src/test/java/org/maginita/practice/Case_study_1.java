package org.maginita.practice;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.opera.OperaDriver;

import io.cucumber.java.en.Given;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Case_study_1 
{

@Given("open chromebrowser")
public void open_chromebrowser() 
{
WebDriverManager.chromedriver().setup();
ChromeDriver driver = new ChromeDriver();
driver.get("http//:www.google.com");
}

@Given("open operabrowser")
public void open_operabrowser() 
{
	WebDriverManager.operadriver().setup();
	OperaDriver driver = new OperaDriver();
	driver.get("http//:www.google.com");   
}

@Given("open  edgebrowser")
public void open_edgebrowser() 
{
	WebDriverManager.edgedriver().setup();
	EdgeDriver driver = new EdgeDriver();
	driver.get("http//:www.google.com");  

}

}
