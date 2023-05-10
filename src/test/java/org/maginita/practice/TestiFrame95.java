package org.maginita.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestiFrame95 {

	public static void main(String[] args) throws Exception
	{
		//open browser
		
		WebDriverManager.chromedriver().setup();
		RemoteWebDriver driver = new ChromeDriver();
		
		//OPEN SITE
		
		driver.get("https://chercher.tech/practice/frames-example-selenium-webdriver");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		
		//automate scenario
		 driver.switchTo().frame(0);
		 driver.findElement(By.tagName("input")).sendKeys("abdul kalam");
		 Thread.sleep(5000);
		 driver.switchTo().frame(0);
		 driver.findElement(By.id("a")).click();
		 Thread.sleep(5000);
		 driver.switchTo().parentFrame();
		 driver.findElement(By.tagName("input")).clear();
		 Thread.sleep(5000);
		 driver.switchTo().defaultContent();
		 
		 driver.switchTo().frame(1);
		 WebElement e = driver.findElement(By.id("animals"));
		 Select s = new Select(e);
		 s.selectByVisibleText("Baby Cat");
		 driver.switchTo().defaultContent();
		 
	}

}










