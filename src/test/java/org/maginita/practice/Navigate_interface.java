package org.maginita.practice;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Navigate_interface {

	public static void main(String[] args)  throws Exception
	{
	WebDriverManager.chromedriver().setup();
	RemoteWebDriver driver = new ChromeDriver();
	driver.get("http://www.google.co.in");
     Thread.sleep(5000);
     
     driver.navigate().to("https://www.flipkart.com");
     Thread.sleep(5000);
     
     driver.navigate().back();
     Thread.sleep(5000);
     
     driver.navigate().forward();
     Thread.sleep(5000);
     
     
     driver.navigate().refresh();
     Thread.sleep(5000);
     
     
     
	}

}
