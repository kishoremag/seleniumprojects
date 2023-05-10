package org.maginita.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Get_textScenario {

	public static void main(String[] args) throws Exception
	{
	  //open browser
		WebDriverManager.chromedriver().setup();
		RemoteWebDriver driver = new ChromeDriver();
		
		//launch site
		driver.get("http://www.google.co.in");
		Thread .sleep(5000);
		
//Get text of visible element .its developed by paired tag and it has some text 
		
	String x = driver.findElement(By.xpath("//div[@id  = 'gb']/descendant::a[1]")).getText();
	System.out.println(x);

	//get text of visible element .developed with paired tag but it has no text
	//get a blank value , but no exception 
	
	String y = driver.findElement(By.xpath("//div[@jsname = 'vdLsw']")).getText();
	System.out.println(y);

	
	}

}
