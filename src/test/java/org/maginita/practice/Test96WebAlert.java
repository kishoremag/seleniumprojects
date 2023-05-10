package org.maginita.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test96WebAlert {

	public static void main(String[] args) throws Exception
	{
	WebDriverManager.chromedriver().setup();
	RemoteWebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	
	
	//open site
	
	driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_confirm");
	Thread.sleep(5000);
	
	//switch to frame
	driver.switchTo().frame("iframeResult");
	
	//test case -1 fpr "OK"
	driver.findElement(By.xpath("//button[text()='Try it']")).click();
	Thread.sleep(10000);
	
	driver.switchTo().alert().accept();
	Thread.sleep(10000);
	String x = driver.findElement(By.id("demo")).getText();
	if(x.contains("ok"))
	{
		System.out.print("Ok test is passed");
	}
	else
	{
		System.out.print("Ok test is failed");
	}
	
	//Test case - 2;"Cancel" is tesing
	
	driver.findElement(By.xpath("//button[text()='Try it']")).click();
	Thread.sleep(10000);
	
	driver.switchTo().alert().dismiss();
	Thread.sleep(10000);
	String y = driver.findElement(By.id("demo")).getText();
	if(x.contains("Cancel"))
	{
		System.out.print("Cancel test is passed");
	}
	else
	{
		System.out.print("Cancel test is failed");
	}
	//CLOSE SITE
	
	driver.switchTo().defaultContent();
	driver.close();
	
	
	
	
	
	
	
	
	
	
	
	

	}

}
