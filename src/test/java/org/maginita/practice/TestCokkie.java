package org.maginita.practice;

import java.util.List;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestCokkie {

	public static void main(String[] args) throws Exception
	{
		
		//OPEN BROWSER
		
	 WebDriverManager.chromedriver().setup();
	 RemoteWebDriver driver = new ChromeDriver();
	 
	 //MAXIMIZE BROWSER
	 
	 driver.manage().window().maximize();
	 Thread.sleep(5000);
	 
	 //LAUNCH SITE
	 
	 driver.get("https://www.facebook.com");
	 Thread.sleep(5000);
	 
	 System.out.println("cookies after launching site:");
	 System.out.println("cookies after launching site:");
	 
	 CookiesUtility obj = new CookiesUtility();
	 System.out.println(obj.getcookiescount(driver));
	 System.out.println(obj.getcookienames(driver));
	 List<String>types1 =obj.getcookiesTypes(driver, "facebook.com", "facebook.com");
	 
	 for(String type:types1)
	 {
		 System.out.println(type);
	 }
	 
	 //close site
	 driver.close();

	}

}
