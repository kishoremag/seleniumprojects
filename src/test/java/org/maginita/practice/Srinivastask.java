package org.maginita.practice;



import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


import io.github.bonigarcia.wdm.WebDriverManager;

public class Srinivastask {

	public static void main(String[] args) throws Exception
	{
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		Thread.sleep(10000);

		driver.get("https://accounts.google.com");
		//fill fields
		driver.findElement(By.name("identifier")).sendKeys("magnitiait123@gmail.com");

		driver.findElement(By.xpath("//span[text()='Next']/parent::button")).click();
		Thread.sleep(10000);

		driver.findElement(By.xpath("//input[@type ='password']")).sendKeys("Magnitiait@123");

		driver.findElement(By.xpath("//span[text()='Next']/parent::button")).click();
		Thread.sleep(10000);

		/*String xp="//a[contains(text(),'Customer Support')]";
		WebElement menu = driver.findElement(By.xpath(xp));
		// Move mouse pointer on DropDown Menu
		Actions actions=new Actions(driver);
		actions.moveToElement(menu).perform();
		driver.findElement(By.linkText("Contact Us")).click();*/








		driver.findElement(By.xpath("//a[@aria-label='Google apps']/parent::div/parent::div")).click();
		Thread.sleep(10000);

		try
		{
			driver.findElement(By.xpath("//a[@data-pid='23']//span[@class='Rq5Gcb']")).click();
			Thread.sleep(10000);
		}
		catch(Exception ex) 
		{
		
			WebElement f = driver.findElement(By.xpath("(//iframe[@role='presentation'])[1]"));
			
			driver.switchTo().frame(f);
			
			driver.findElement(By.xpath("//a[@data-pid='23']//span[@class='Rq5Gcb']")).click();
			Thread.sleep(10000);
		
		}


	}

}
