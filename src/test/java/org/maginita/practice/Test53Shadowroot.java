package org.maginita.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test53Shadowroot {

	public static void main(String[] args)throws Exception
	{
		//open browser 
		WebDriverManager.chromedriver().setup();
		RemoteWebDriver driver = new ChromeDriver();
		
		//launch site
		
	driver.get("https://shop.polymer-project.org");
	Thread.sleep(5000);
	
	//this element is inside of nested shadow DOM	
	
	WebElement phome = driver.findElement(By.cssSelector("shop-app[page = home]"));
	
	SearchContext proot = phome.getShadowRoot();
	
	WebElement chome = proot.findElement(By.cssSelector("shop-home[name =home]"));
	
	SearchContext proot1 = chome.getShadowRoot();
	
	proot1.findElement(By.cssSelector("a[aria-label*='Men']")).click();
	
	
			
	driver.close();		


	}

}
