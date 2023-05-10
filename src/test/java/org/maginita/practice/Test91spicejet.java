package org.maginita.practice;

import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test91spicejet {

	public static void main(String[] args) throws Exception
	{
	//get excepted date from keyboard
	
		Scanner sc = new Scanner(System.in);
		System.out.println("enter departure day");
		int dd = Integer.parseInt(sc.nextLine());
		System.out.println("enter departure month name");
		String dm = sc.nextLine();
		System.out.println("enter departure year");
		int dy = Integer.parseInt(sc.nextLine());
		System.out.println("enter Arrival day");
		int ad = Integer.parseInt(sc.nextLine());
		System.out.println("enter Arrival month name");
		String am = sc.nextLine();
		System.out.println("enter Arrival year"); 
		int ay = Integer.parseInt(sc.nextLine());
		sc.close();
		//launch site
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("http://www.spicejet.com");
		Thread.sleep(5000);
		
		
		//open calender in departure data
		
		driver.findElement(By.xpath("(//div[text()='Departure date']/following::*[name()='svg'])[1]")).click();
		Thread.sleep(5000);
		WebElement calender1 = driver.findElement(By.xpath("(div[contains(@data-testid,'undefined-month')]][1]/ancestor::div[2]"));
		DiVCalanderUtilityClass obj = new DiVCalanderUtilityClass();
		obj.SelectDate(driver, calender1, dy, dm, dd);
		Thread.sleep(5000);
		
		//open calender in arrival date
		
		driver.findElement(By.xpath("(//div[text()='Return date']/following::*[name()='svg'])[1]")).click();
		Thread.sleep(5000);
		WebElement calender2 = driver.findElement(By.xpath("(div[contains(@data-testid,'undefined-month')]][1]/ancestor::div[2]"));
		obj.SelectDate(driver, calender2, dy, dm, dd);
		Thread.sleep(5000);
		

	}

}
