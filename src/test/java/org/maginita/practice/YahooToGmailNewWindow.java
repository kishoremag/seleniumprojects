package org.maginita.practice;



import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class YahooToGmailNewWindow {

	public static void main(String[] args) throws Exception
	{
		WebDriverManager.chromedriver().setup();
		RemoteWebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		//launch site
		driver.get("https://mail.yahoo.com");
		driver.findElement(By.xpath("//a[text()='Sign in']")).click();
		Thread.sleep(5000);

		//login

		driver.findElement(By.name("username")).sendKeys("kishore772@yahoo.com");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		Thread.sleep(5000);

		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("magnitiait");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(5000);

		driver.findElement(By.linkText("Compose")).click();
		Thread.sleep(5000);
		driver.findElement(By.id("message-to-field")).sendKeys("magnitiait72@gmail.com");

		Thread.sleep(5000);

		driver.findElement(By.xpath("//input[@placeholder='Subject']")).sendKeys("wishes");
		Thread.sleep(5000);

		driver.findElement(By.xpath("//div[@aria-label='Message body']")).sendKeys("hi kishore/n how are you /n happy to see u");
		Thread.sleep(5000);


		//SEND MAIL IN YAHOO

		driver.findElement(By.xpath("//span[text()='Send']/parent::button")).click();
		Thread.sleep(2000);
		

		//String x= driver.findElement(By.xpath("//span[contains(text(),Your')]/parent::*")).getText();

		//System.out.println(x);

		//Open new window

		driver.switchTo().newWindow(WindowType.TAB);
		Set<String>s =driver.getWindowHandles();
		List<String>a=new ArrayList<String>(s);
		driver.switchTo().window(a.get(1));

		//launch Gmail site
		driver.get("http://www.gmail.com");
		//fill fields
		driver.findElement(By.name("identifier")).sendKeys("magnitiait72@gmail.com");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//span[text()='Next']/parent::button")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@type ='password']")).sendKeys("Magnitia@it");
		driver.findElement(By.xpath("//span[text()='Next']/parent::button")).click();
		Thread.sleep(10000);

		//check from latest gmail

		String y = driver.findElement(By.xpath("//table[@role='grid']/tbody/tr[1]/td[4]/div[1]/span[1]/span")).getAttribute("email");

		if(y.contains("kishore772@yahoo.com"))
		{
			System.out.println("yahoo mail sent succesfull working");
		}
		else
		{
			System.out.println("yahoo mail sent succesfull not working");
		}


		//gmail logout 

		driver.findElement(By.xpath("//a[starts-with(@aria-label ,'Google Account')]/img")).click();
		Thread.sleep(5000);
		
		try
		{
			driver.findElement(By.linkText("Sign out")).click();
			Thread.sleep(5000);
		}
		catch(Exception ex)
		{
			WebElement f = driver.findElement(By.xpath("(//iFrame[@role='presentation'])[2]"));
			driver.switchTo().frame(f);//2nd frame
			driver.findElement(By.xpath("//div[text()='Sign out']/parent::a")).click();
			Thread.sleep(5000);
		}
		
        //close gmail site

		driver.close();
		
		//BACK TO YAHOO
		driver.switchTo().window(a.get(0));

		//Yahoo logout

		//driver.switchTo().frame(nameOrId)

		driver.findElement(By.xpath("(//img[@alt='Profile image'])[1]")).click();
		Thread.sleep(5000);

		//checking received mail from gmail
		//logout
		driver.findElement(By.xpath("//span[text()='Sign out']")).click();
		Thread.sleep(5000);

		
		//close site
		
		driver.close();

		}
	}


















	
