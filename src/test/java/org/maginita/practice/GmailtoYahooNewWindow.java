package org.maginita.practice;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;

import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
  
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GmailtoYahooNewWindow {

	public static void main(String[] args) throws Exception
	{
		WebDriverManager.chromedriver().setup();
		RemoteWebDriver driver = new ChromeDriver();
		//launch site
		driver.get("http://www.gmail.com");
		//fill fields
		driver.findElement(By.name("identifier")).sendKeys("magnitiait72@gmail.com");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//span[text()='Next']/parent::button")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@type ='password']")).sendKeys("Magnitia@it");
		driver.findElement(By.xpath("//span[text()='Next']/parent::button")).click();
		Thread.sleep(10000);
		//click on compose
		driver.findElement(By.xpath("//div[starts-with(text(),'Compose')]")).click();
		Thread.sleep(5000);
		//to
		driver.findElement(By.name("to")).sendKeys("kishore772@yahoo.com");
		Thread.sleep(5000);
		driver.findElement(By.name("subjectbox")).sendKeys("wishes");
		driver.findElement(By.xpath("//div[@aria-label = 'Message Body']")).sendKeys("hi kishore/n how are you /n happy to see u");	
		driver.findElement(By.xpath("//div[text()='Send']")).click();
		
		//open new window
		driver.switchTo().newWindow(WindowType.WINDOW);
		Set<String>s = driver.getWindowHandles();
		List<String>a=new ArrayList<String>(s);
		driver.switchTo().window(a.get(1));
		
/*		driver.switchTo().newWindow(WindowType.WINDOW);
		Set<String>set = driver.getWindowHandles();
		List<String>list = new ArrayList<String>(set);
		driver.switchTo().window(list.get(1));*/

		
		//launch yahoo site
		
		driver.get("https://mail.yahoo.com");
		driver.findElement(By.xpath("//a[text()='Sign in']")).click();
		Thread.sleep(5000);
		
		//login
		
		driver.findElement(By.name("username")).sendKeys("kishore772@yahoo.com");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("magnitiait");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(5000);
		
		//driver.switchTo().frame(nameOrId)
		
		driver.findElement(By.xpath("(//img[@alt='Profile image'])[1]")).click();
		Thread.sleep(5000);
		 
		//checking received mail from gmail
		//logout
	   driver.findElement(By.xpath("//span[text()='Sign out']")).click();
	   Thread.sleep(5000);
		
		
		
		
		
		//close site
		  
		driver.close();
		
		//gmail logout 
		
		 driver.findElement(By.xpath("//a[starts-with(@aria-label ,'Google Account')]/img")).click();
		  Thread.sleep(5000);
		  driver.findElement(By.linkText("Sign out")).click();
		
		//close gmail site
		  
		  driver.close();
		  
		  
		
		
		
		
		
		
		
		 
		
		
		
		
		
		
		
		
		
		
	}

}
