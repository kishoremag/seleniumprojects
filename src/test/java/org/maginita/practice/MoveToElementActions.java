package org.maginita.practice;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MoveToElementActions {

	public static void main(String[] args) throws Exception 
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		
		driver.get("https://opensource-demo.orangehrmlive.com");
		Thread.sleep(5000);
	driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
	Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin123");
	Thread.sleep(5000);
		driver.findElement(By.xpath("//button[text()=' Login ']")).click();
		Thread.sleep(5000);
		Actions actions = new Actions(driver);
	actions
	.moveToElement(driver.findElement(By.id("menu_admin_viewAdminModule")))
	.moveToElement(driver.findElement(By.id("menu_admin_Organization")))
	.moveToElement(driver.findElement(By.id("menu_admin_viewLocations")))
	.click()
	.perform();	
	driver.findElement(By.id("searchLocation_name")).sendKeys("Hyderabad");
		actions.doubleClick(driver.findElement(By.id("searchLocation_name"))).perform();
		
		/*Actions actions = new Actions(driver);
		driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");
		actions.contextClick(driver.findElement(By.xpath("//span[.='right click me']"))).perform();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//li[.='Edit']")).click();
		Thread.sleep(3000);
		Alert alert = driver.switchTo().alert();
		System.out.println(alert.getText());
		alert.accept();
*/
	}

}
