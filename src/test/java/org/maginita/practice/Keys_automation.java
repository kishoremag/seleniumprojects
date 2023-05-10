package org.maginita.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Keys_automation 
{

	public static void main(String[] args) throws Exception
	{
	 WebDriverManager.chromedriver().setup();
	 RemoteWebDriver driver = new ChromeDriver();
	 //launch site
	  driver.get("http://www.flipkart.com");
	  //
	  driver.findElement(By.name("q")).sendKeys("mobiles",Keys.ESCAPE);
	  Thread.sleep(5000);
	  
	  driver.findElement(By.name("q")).sendKeys(Keys.chord(Keys.CONTROL,"a"),Keys.BACK_SPACE,Keys.ESCAPE);
	  Thread.sleep(5000);

	}

}
