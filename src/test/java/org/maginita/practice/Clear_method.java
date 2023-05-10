package org.maginita.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Clear_method {

	public static void main(String[] args) throws Exception
	{
	 WebDriverManager.chromedriver().setup();
	 RemoteWebDriver driver = new ChromeDriver();
	 
	 ///launch site 
	 
	 driver.get("http://www.gmail.com");
	 Thread.sleep(5000);
	 
	 //operation 
	 
	 driver.findElement(By.name("hiddenPassword")).clear();
	 }
	
}
