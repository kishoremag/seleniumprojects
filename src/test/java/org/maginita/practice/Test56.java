package org.maginita.practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test56 {

	public static void main(String[] args) throws Exception
	{
		 WebDriverManager.chromedriver().setup();
		   RemoteWebDriver driver = new ChromeDriver();
		   
		   //launch site
		   
		   driver.get("https://www.google.com");
		   Thread.sleep(10000);
		   
		  //collect all elements
		   List<WebElement>l = driver.findElements(By.xpath("//*"));
		   
		   //visible and hidden elements 
		   int vec = 0;
		   int hec = 0;
		   int eec = 0;
		   int dec = 0;
		   if(l.size()==0)
		   {   
		   System.out.println("no elements in page");
		   }
		   else
		   {
			   //go to each element
			   for(WebElement e:l)
			   {
				   if(e.isDisplayed())
				   {
					   vec++;
					   if(e.isEnabled())
					   {
						 eec++;  
					   }
					   else
					   {
						   dec++;
					   }
						   
				   }
				   else
				   {
					   hec++;
					  
				   }
	}

}
		   
		   System.out.println("count of all elements is "+l.size());
		   System.out.println("count visible elements is "+vec);
		   System.out.println("count of hidden elements is "+hec);
		   System.out.println("count of enabled elements is "+eec);
		   System.out.println("count of disabled elements is "+dec);
  //close site
		   
		  driver.close();
	}
}
		   
		   
		   
		   
