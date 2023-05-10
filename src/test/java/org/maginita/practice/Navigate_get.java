package org.maginita.practice;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Navigate_get 
{

	public static void main(String[] args) 
	{
		WebDriverManager.chromedriver().setup();
		RemoteWebDriver driver = new ChromeDriver();
		long starttime = System.currentTimeMillis();
		driver.get("http://www.google.com");
		long endtime = System.currentTimeMillis();
		System.out.println(endtime-starttime);
		driver.close();  
	
	}

}
