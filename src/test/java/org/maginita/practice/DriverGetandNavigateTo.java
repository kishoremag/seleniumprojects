package org.maginita.practice;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DriverGetandNavigateTo {

	public static void main(String[] args) 
	{
		WebDriverManager.chromedriver().setup();
		RemoteWebDriver driver = new ChromeDriver();
		
		driver.get("https://www.naukri.com");
		
		driver.navigate().to("https://www.naukri.com");
		
		

	}

}
