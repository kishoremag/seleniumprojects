package org.maginita.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestiFrame94 {

	public static void main(String[] args) throws Exception
	{
		//open browser
		
		WebDriverManager.chromedriver().setup();
		RemoteWebDriver driver = new ChromeDriver();
		
		//OPEN SITE
		
		driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml_iframe");
		Thread.sleep(5000);
		
		WebElement e = driver.findElement(By.xpath("//iframe[contains(@title,'W3Schools Free')]"));
		driver.switchTo().frame(e);
		
		//operate inner frame
		driver.findElement(By.linkText("Log in")).click();
		Thread.sleep(5000);
		

	}

}










