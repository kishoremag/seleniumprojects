package org.maginita.practice;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;



import io.github.bonigarcia.wdm.WebDriverManager;



public class Magnitia 
{

	public static void main(String[] args) throws InterruptedException 
	{
		
		WebDriverManager.chromedriver().setup();
      
        RemoteWebDriver driver = new ChromeDriver();
           
           /* driver.get("https://www.magnitia.com");
            //driver.get("https://www.magnitia.com/images/courses/Selenium-with-Java-Magnitia-Content.pdf");
            driver.manage().window().maximize();
    		Thread.sleep(5000);
    		//Do login
    		driver.findElement(By.xpath("//i[@class='fa fa-window-close']")).click();
    		Thread.sleep(5000);
    		try
    		{
    		driver.findElement(By.xpath("//small[text()='ESC']")).click();
    		Thread.sleep(5000);
    		}
    		catch(Exception e1)
    		{
    			
    		}
         	driver.findElement(By.xpath("(//a[@class='nav-link'])[4]")).click();
    		Thread.sleep(5000);
    		
    		driver.navigate().back();
    		Thread.sleep(5000);
    		driver.findElement(By.xpath("//i[@class='fa fa-window-close']")).click();
    		Thread.sleep(6000);
    		try
    		{
    		driver.findElement(By.xpath("//small[text()='ESC']")).click();
    		Thread.sleep(5000);
    		}
    		catch(Exception e1)
    		{
    			
    		}
    		
    		driver.findElement(By.xpath("(//a[@class='nav-link'])[3]")).click();
    		Thread.sleep(5000);
    		
    		driver.findElement(By.xpath("(//small[text()='ESC'])[2]")).click();
    		Thread.sleep(5000);
    		driver.findElement(By.xpath("(//small[text()='ESC'])[1]")).click();
    		Thread.sleep(5000);
    		
    		
    		driver.findElement(By.xpath("(//a[text()='UPCOMING BATCHES'])")).click();
    		Thread.sleep(5000);
    		driver.findElement(By.xpath("//a[text()='Online Training']")).click();
    		Thread.sleep(5000);
    		driver.findElement(By.xpath("//li[@class='wtapp']")).click();
    		Thread.sleep(5000);
    		Set<String> s=driver.getWindowHandles();
    		ArrayList<String> l=new ArrayList<String>(s);
    		driver.switchTo().window(l.get(1));
    		Thread.sleep(5000);
    		driver.close();
    		driver.switchTo().window(l.get(0));
    		Thread.sleep(5000);
    		driver.findElement(By.xpath("//a[text()=' Contact Us ']")).click();
    		Thread.sleep(5000);
    		try
    		{
    		driver.findElement(By.xpath("//small[text()='ESC']")).click();
    		Thread.sleep(5000);
    		}
    		catch(Exception e1)
    		{
    			
    	 	}
    		/*
    		 * 
    		 */
    		driver.get("https://www.magnitia.com/images/courses/Selenium-with-Java-Magnitia-Content.pdf");
    		  // driver.manage().window().maximize();
       		Thread.sleep(25000);
    		
    		//driver.findElement(By.xpath("(//a[@class='nav-link dropdown-toggle'])[1]")).click();
    		//Thread.sleep(5000);
    		//driver.findElement(By.xpath("//a[text()='Selenium Training']")).click();
    		//Thread.sleep(5000);
    		
    		//driver.findElement(By.xpath("(//div[@class='backdrop-close'])[1]")).click();
    		//Thread.sleep(5000);
    		//driver.findElement(By.xpath("(//div[@class='backdrop-close'])[1]")).click();
    		//Thread.sleep(5000);
    		 
    		
    		/*driver.findElement(By.xpath("//a[text()='What is Selenium training?']")).click();
    		Thread.sleep(5000);
    		
    		driver.findElement(By.xpath("(//div[@class='backdrop-close'])[1]")).click();
    		Thread.sleep(5000);*/
    		//driver.findElement(By.xpath("(//div[@class='backdrop-close'])[1]")).click();
    		//Thread.sleep(5000);
    		  
            
    	/*	
    		driver.findElement(By.xpath("//a[text()='Course Content']")).click();
    		Thread.sleep(5000);
    		 Set<String>s=driver.getWindowHandles();
    		 List<String>l=new ArrayList(s);   
              driver.switchTo().window(l.get(1));
             Thread.sleep(5000);*/
      
             
             
             //System.out.println(l2.size());viewer
      //String cssSelectorForHost1 = "#viewer";
      //String cssSelectorForHost2 = "#toolbar";
      //String cssSelectorForHost3 = "#downloads";

      
            
        /*  
       	 SearchContext shadow0 = driver.findElement(By.cssSelector("#viewer")).getShadowRoot();
		 Thread.sleep(1000);
		 SearchContext shadow1  = shadow0.findElement(By.cssSelector("#toolbar")).getShadowRoot();
		 Thread.sleep(1000);
		 //SearchContext shadow2 = shadow1.findElement(By.cssSelector("#downloads")).getShadowRoot();
		 //Thread.sleep(1000);
		 shadow1.findElement(By.cssSelector("#download")).click();
		 Thread.sleep(1000);*/
       	driver.findElement(By.cssSelector("#viewer")).getShadowRoot()
       		  .findElement(By.id("toolbar")).getShadowRoot()
       		  .findElement(By.id("downloads")).getShadowRoot()
       		  .findElement(By.id("download")).getShadowRoot()
       		  .findElement(By.id("icon")).click();
		 /*String cssSelectorForHost1 = "#userName";
			String cssSelectorForHost2 = "#app2";
			Thread.sleep(1000);
			SearchContext shadow0 = driver.findElement(By.cssSelector("#userName")).getShadowRoot();
			Thread.sleep(1000);
			SearchContext shadow1 = shadow0.findElement(By.cssSelector("#app2")).getShadowRoot();
			Thread.sleep(1000);
			shadow1.findElement(By.cssSelector("#pizza"));
		 */
		 
		 
		
       		
       		
       		
       		
       		 
/*
    	WebElement viewer = driver.findElement(By.cssSelector("#viewer"));
    	SearchContext proot = viewer.getShadowRoot();
    	WebElement toolbar = proot.findElement(By.cssSelector("#toolbar"));
    	SearchContext proot1 = toolbar.getShadowRoot();
    	WebElement downloads = proot1.findElement(By.cssSelector("#downloads"));
    	SearchContext proot2 = downloads.getShadowRoot();
    	WebElement download = proot2.findElement(By.cssSelector("#Download"));
    	SearchContext proot3 = download.getShadowRoot();
    	proot3.findElement(By.cssSelector("#iron-icon")).click();*/
    	
    	
    	
    	/*findElement(By.cssSelector("viewer-toolbar[id='toolbar']")).getShadowRoot().
    	findElement(By.cssSelector("viewer-download-controls[id='downloads']")).getShadowRoot().
    	findElement(By.cssSelector("cr-icon-button[aria-label='Download']")).getShadowRoot().
            //way-1: both locate and operate element using JavaScriptt
    	findElement(By.cssSelector("iron-icon"))
          */
       		
    		/*
    		WebElement phome = driver.findElement(By.cssSelector("shop-app[page = home]"));
    		
    		SearchContext proot = phome.getShadowRoot();
    		
    		WebElement chome = proot.findElement(By.cssSelector("shop-home[name =home]"));
    		
    		SearchContext proot1 = chome.getShadowRoot();
    		
    		proot1.findElement(By.cssSelector("a[aria-label*='Men']")).click();*/
       		
       		/*driver.findElement(By.cssSelector("pdf-viewer[id='viewer']")).getShadowRoot();
        	findElement(By.cssSelector("viewer-toolbar[id='toolbar']")).getShadowRoot().
        	findElement(By.cssSelector("viewer-download-controls[id='downloads']")).getShadowRoot().
        	findElement(By.cssSelector("cr-icon-button[aria-label='Download']")).getShadowRoot().
                //way-1: both locate and operate element using JavaScriptt
        	findElement(By.cssSelector("iron-icon"))
           
          /*   JavascriptExecutor jse = (JavascriptExecutor)driver;
      WebElement search = (WebElement) jse.executeScript("return document.querySelector('pdf-viewer#viewer').shadowRoot.\r\n" + 
      		"      		 querySelector('viewer-toolbar#toolbar').shadowRoot.\r\n" + 
      		"      		querySelector('viewer-download-controls#downloads').shadowRoot.\r\n" + 
      		"      		querySelector('cr-icon-button#download').\r\n" + 
      		"      		shadowRoot.\r\n" + 
      		"      	querySelector('iron-icon').shadowRoot.querySelector('svg')");
      ((JavascriptExecutor)driver).executeScript("arguments[0].click();", search);*/
       
         	
           		
	}

}
