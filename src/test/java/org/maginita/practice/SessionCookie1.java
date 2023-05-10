package org.maginita.practice;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SessionCookie1 {

	public static void main(String[] args) throws Exception
	{
		//OPEN BROWSER
		
		 WebDriverManager.chromedriver().setup();
		 RemoteWebDriver driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 Thread.sleep(5000);
		 
		 //LAUNCH SITE AND LOGIN
		 
		 driver.get("http://www.testyou.in/login.aspx");
		 Thread.sleep(5000);
		 
		 driver.findElement(By.xpath("(//img[contains(@src,'google.png')])[2]")).click();
		 
		 driver.findElement(By.name("identifier")).sendKeys("magnitiait72@gmail.com");
			driver.findElement(By.xpath("//span[text()='Next']/parent::button")).click();
			Thread.sleep(5000);
			
			driver.findElement(By.xpath("//input[@type ='password']")).sendKeys("Magnitia@it");
			driver.findElement(By.xpath("//span[text()='Next']/parent::button")).click();
			Thread.sleep(10000);
			
			//OPEN NEW WINDOW/TAB 
			
			driver.switchTo().newWindow(WindowType.WINDOW);
			Set<String>s = driver.getWindowHandles();
			List<String>l = new ArrayList(s);
			driver.switchTo().window(l.get(1));
			
			//LAUNCH SAME SITE BY SKIPPING LOGIN DUE TO SESION COOKIE
			
			 driver.get("http://www.testyou.in/login.aspx");
			 Thread.sleep(5000);
			 try
			 {
			 if(driver.findElement(By.className("signout")).isDisplayed());
			 {
				 System.out.println("session cookie is working correctly");
			 }
			 }
			 catch (Exception ex)
			 {
				 System.out.println("session cookie is not  working correctly");
			 }
			 
			 //CLOSE ALL BROWERS AND WINDOW
			 
			 driver.quit();
			
			
		 

	}

}
