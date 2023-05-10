package org.maginita.practice;

 
 
import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test54chromesettings {

	public static void main(String[] args) throws Exception
	{
		
		//open browser 
				WebDriverManager.chromedriver().setup();
				RemoteWebDriver driver = new ChromeDriver();
				
				//launch site
				
			driver.get("chrome://settings");
			Thread.sleep(5000);
			//
	
			 WebElement home = driver.findElement(By.cssSelector("settings-ui"));
			 SearchContext root = home.getShadowRoot();

			    WebElement home1 = root.findElement(By.cssSelector("cr-toolbar[id='toolbar']"));
			    SearchContext root1 = home1.getShadowRoot();

			    WebElement home2 = root1.findElement(By.cssSelector("cr-toolbar-search-field[id='search']"));
			    SearchContext root2 = home2.getShadowRoot(); 
			    root2.findElement(By.cssSelector("input[id='searchInput']")).sendKeys("kk");
			    
			    driver.close();


	}

}
