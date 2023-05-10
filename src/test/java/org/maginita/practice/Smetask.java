package org.maginita.practice;


import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Smetask {

	public static void main(String[] args) throws Exception
	{
		WebDriverManager.chromedriver().setup();
		RemoteWebDriver driver = new ChromeDriver();
		
		//launch site
		driver.get("https://sme.quake.com.my/key-highlights");
		
		//fill fields
		
		driver.findElement(By.xpath("//div[contains(@class,'c-tag-picker__display')]")).click();
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//button[@value='digital']")).click();
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//div[@class='col-auto']/input")).click();
		Thread.sleep(5000);
		
		int c = driver.findElements(By.xpath("//button[@value='digital']")).size();
		
		System.out.println(c);
		Thread.sleep(5000);
		
		
		
		
	}

}
