package org.maginita.practice;

import static org.openqa.selenium.support.ui.ExpectedConditions.*;


import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.FluentWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PracticeInterview {

	public static void main(String[] args) 
	{
		WebDriverManager.chromedriver().setup();
		RemoteWebDriver driver = new ChromeDriver();
		
		driver.get("https://www.youtube.com");
		

		FluentWait<RemoteWebDriver> w = new FluentWait<RemoteWebDriver>(driver);
		w.withTimeout(Duration.ofSeconds(20));
		w.pollingEvery(Duration.ofMillis(1000));
		
		w.until(visibilityOfElementLocated(By.xpath("//input[@id ='search']"))).
		
		sendKeys("stale element exception in selenium webdriver");
		
		w.until(elementToBeClickable(By.xpath("//button[@class='style-scope ytd-searchbox']"))).click();
		
	w.until(elementToBeClickable(By.xpath("//button[@id='avatar-btn']"))).click();
		
	
		
		
		
		
	    
		
		

	}

}
