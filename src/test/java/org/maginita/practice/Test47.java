package org.maginita.practice;


import org.openqa.selenium.By;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test47 {

	public static void main(String[] args)throws Exception
	{
		// open browser
				WebDriverManager.chromedriver().setup();
				RemoteWebDriver driver = new ChromeDriver();

				//launch site

				driver.get("http://www.google.co.in");
				Thread.sleep(5000);

				//locate on visible element and get tagname

				WebElement e = driver.findElement(By.xpath("//*[@aria-label='Search by voice']"));
                String x = e.getTagName();
                System.out.println(x);
                //close site
                
               driver.close();
			    

	}

}
