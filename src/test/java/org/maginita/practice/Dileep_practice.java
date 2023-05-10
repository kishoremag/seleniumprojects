package org.maginita.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Dileep_practice {

	public static void main(String[] args) throws Exception
	{
		RemoteWebDriver driver;
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		//launch site
		driver.get("http://www.gmail.com");
		driver.findElement(By.name("identifier")).sendKeys("magnitiait72@gmail.com");
		driver.findElement(By.xpath("//span[text()='Next']/parent::button")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@type ='password']")).sendKeys("Magnitia@it");
		driver.findElement(By.xpath("//span[text()='Next']/parent::button")).click();
		Thread.sleep(5000);

	}

}
