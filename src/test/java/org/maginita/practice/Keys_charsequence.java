package org.maginita.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Keys_charsequence {

	
	public static void main(String[] args) throws Exception
	{
	//site open 
	 WebDriverManager.chromedriver().setup();
	 
	 RemoteWebDriver driver = new ChromeDriver();
	 
	 //launch site
	 
	 driver.get("http://www.google.co.in");
	 
	 
	 driver.findElement(By.name("q")).
	 sendKeys("magnitiait",Keys.chord(Keys.CONTROL,"a",Keys.chord(Keys.CONTROL.BACK_SPACE)));
	 Thread.sleep(5000);
	
	 
	
	 
	
	}

}
