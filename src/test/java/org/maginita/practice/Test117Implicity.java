package org.maginita.practice;

import java.time.Duration;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.support.ui.FluentWait;

import io.github.bonigarcia.wdm.WebDriverManager;
import static org.openqa.selenium.support.ui.ExpectedConditions.*;      

public class Test117Implicity {

	public static void main(String[] args) 
	{
	 
		//launch browser
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		//launch site
		
		driver.get("https://www.gmail.com");
		
		//DEFINE WAIT OBJECT
		
		FluentWait<ChromeDriver> w = new FluentWait<ChromeDriver>(driver);
		w.withTimeout(Duration.ofSeconds(20));
		w.pollingEvery(Duration.ofMillis(1000));
		
		//do login
		
		w.until(visibilityOfElementLocated(By.name("identifier"))).sendKeys("magnitiait72@gmail.com");
	
	    w.until(elementToBeClickable(By.xpath("//span[text()='Next']/parent::button"))).click();
	
		w.until(visibilityOfElementLocated(By.xpath("//input[@type ='password']"))).sendKeys("Magnitia@it");
		
		w.until(elementToBeClickable(By.xpath("//span[text()='Next']/parent::button"))).click();

		//click on compose
		w.until(elementToBeClickable(By.xpath("//div[starts-with(text(),'Compose')]"))).click();
		
		w.until(visibilityOfElementLocated(By.name("to"))).sendKeys("kuruvakishore561@gmail.com");
		
		w.until(visibilityOfElementLocated(By.name("subjectbox"))).sendKeys("wishes");
		w.until(visibilityOfElementLocated(By.xpath("//div[@aria-label = 'Message Body']"))).sendKeys("hi kishore/n how are you /n happy to see u");	
		w.until(elementToBeClickable(By.xpath("//div[text()='Send']"))).click();
		
		w.until(elementToBeClickable(By.xpath("//a[starts-with(@aria-label ,'Google Account')]/img"))).click();
	
		
		
		try
		{
			w.withTimeout(Duration.ofSeconds(20));
			w.until(elementToBeClickable(By.linkText("Sign out"))).click();
		
		}
		catch(Exception ex) 
		{
			WebElement f =w.until(visibilityOfElementLocated(By.xpath("(//iFrame[@role='presentation'])[2]")));
			driver.switchTo().frame(f);//2nd frame\
			w.until(elementToBeClickable(By.xpath("//div[text()='Sign out']/parent::a"))).click();
			 
		}
		
		
		
		
		
	}
	

}

