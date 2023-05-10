package org.maginita.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestiFrame93 
{

	public static void main(String[] args) throws Exception
	{
	//open browser
	
		WebDriverManager.chromedriver().setup();
		RemoteWebDriver driver = new ChromeDriver();
		
		//OPEN SITE
		
		driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml_input_test");
		Thread.sleep(5000);
		
		//switch to frame
		
		WebElement e = driver.findElement(By.name("iframeResult"));
		driver.switchTo().frame(e);
		
		//operate elements
		
		driver.findElement(By.name("fname")).sendKeys("abdul");
		driver.findElement(By.name("lname")).sendKeys("kalam");
		driver.findElement(By.xpath("//input[@value='Submit']")).click();
		Thread.sleep(5000);
		driver.switchTo().defaultContent();

	}

}
