package org.maginita.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test42 {

	public static void main(String[] args) throws Exception
	{
	//open browser
		WebDriverManager.chromedriver().setup();
		RemoteWebDriver driver = new ChromeDriver();
		
		//launch site
		
		driver.get("http://www.gmail.com");
		Thread.sleep(5000);
		
	WebElement e = driver.findElement(By.name("hiddenPassword"));
		
	//getsize info
	 int w = e.getSize().getWidth();
	 int h = e.getSize().getHeight();
	 System.out.println(w+"  "+h);
	 //getlocation
	 
	 int x = e.getLocation().getX();
	 int y = e.getLocation().getY();
	 System.out.println(x+" "+y);
	 //getreact
	 
	 int w1 = e.getSize().getWidth();
	 int h1 = e.getSize().getHeight();
	 int x1 = e.getLocation().getX();
	 int y1 = e.getLocation().getY();
	 System.out.println(w1+" "+h1+" "+x1+" "+y1);

	 driver.close();
	}

}
