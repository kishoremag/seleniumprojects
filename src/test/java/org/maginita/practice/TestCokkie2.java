package org.maginita.practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestCokkie2 {

	public static void main(String[] args) throws Exception
	{
		
		//OPEN BROWSER
		
	 WebDriverManager.chromedriver().setup();
	 RemoteWebDriver driver = new ChromeDriver();
	 
	 //MAXIMIZE BROWSER
	 
	 driver.manage().window().maximize();
	 Thread.sleep(5000);
	 
	 //LAUNCH SITE
	 
	 driver.get("https://www.gmail.com");
	 Thread.sleep(5000);
	 
	 driver.findElement(By.name("identifier")).sendKeys("magnitiait72@gmail.com");
		driver.findElement(By.xpath("//span[text()='Next']/parent::button")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@type ='password']")).sendKeys("Magnitia@it");
		driver.findElement(By.xpath("//span[text()='Next']/parent::button")).click();
		Thread.sleep(10000);
	 
	 System.out.println("cookies after launching site:");
	 System.out.println("cookies after launching site:");
	 
	 CookiesUtility obj = new CookiesUtility();
	 System.out.println(obj.getcookiescount(driver));
	 System.out.println(obj.getcookienames(driver));
	 List<String>types1 =obj.getcookiesTypes(driver, "mail.google.com", "mail.google.com");
	 
	 for(String type:types1)
	 {
		 System.out.println(type);
	 }
	 
	 //close site
	 driver.close();

	}

}
