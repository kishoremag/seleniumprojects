package org.maginita.practice;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Window_handles 
{

	public static void main(String[] args) throws Exception
	{
		//open browser
		WebDriverManager.chromedriver().setup();
		RemoteWebDriver driver = new ChromeDriver();
		Thread.sleep(5000);
		//launch site
		driver.get("https://www.google.co.in");
		Thread.sleep(5000);
		//click on gmail
		driver.findElement(By.linkText("Gmail")).click();
		Thread.sleep(5000);
		//open for work
		driver.findElement(By.linkText("For work")).click();
		Thread.sleep(5000);
		//click on admin console link to get new tab
		driver.findElement(By.linkText("Admin console")).click();
		Thread.sleep(5000);
		//close new tab only
		Set<String>s = driver.getWindowHandles();
		ArrayList<String>a = new ArrayList<String>(s);
		driver.switchTo().window(a.get(1));
		//close all tabs or windows
		


	}

}
