package org.maginita.practice;

import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test101ActiveElement {

	public static void main(String[] args) throws Exception
	{
	 
		//launch browser
		
		WebDriverManager.chromedriver().setup();
		RemoteWebDriver driver = new ChromeDriver();
		Thread.sleep(5000);
		
		//launch site
		
		driver.get("https://www.facebook.com");
		Thread.sleep(5000);
		
		//fill active element
		
		driver.switchTo().activeElement().sendKeys("kishore",Keys.TAB);
		
		Thread.sleep(5000);
		
		//fill active element
		
        driver.switchTo().activeElement().sendKeys("kishore567",Keys.TAB,Keys.TAB);
		
		Thread.sleep(5000);
		
		//click on active element
		
		driver.switchTo().activeElement().click();
		
		
		

	}

}
