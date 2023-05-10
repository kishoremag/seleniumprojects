package org.maginita.practice;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Redefine_window {

	public static void main(String[] args) throws Exception
	{   RemoteWebDriver driver;
		WebDriverManager.chromedriver().setup();
	    driver = new ChromeDriver(); 
		Thread.sleep(5000);
		//open opera browser using same driver object(Redefine)
		//but old session will be closed and new session will be created
		WebDriverManager.operadriver().setup();
		driver = new OperaDriver(); 
		Thread.sleep(5000);
		driver.close();//opera browser is only CLOSE
			

	}

}
