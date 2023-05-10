package org.maginita.practice;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test45 {

	public static void main(String[] args) throws Exception
	{
	 	 
		WebDriverManager.chromedriver().setup();
		RemoteWebDriver driver = new ChromeDriver();

		driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml_input_disabled");
		Thread.sleep(5000);

		//element is disbaled 
		driver.switchTo().frame("iframeResult");
		
		WebElement e = driver.findElement(By.name("lname"));
		
		File dest = new File("disabledelementpic");
		
		File src = e.getScreenshotAs(OutputType.FILE);
		
		FileHandler.copy(dest, src);
		
		//close site
		driver.close();
	}

}
