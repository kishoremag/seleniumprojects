package org.maginita.practice;

import java.util.Scanner;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CrossBrowser {

	public static void main(String[] args) 
	{
		
		Scanner sc = new Scanner(System.in);
				System.out.println("Enter BrowserName");
				String bn = sc.nextLine();
				
				 RemoteWebDriver driver;
			 if(bn.equals("chrome"))
			 {
				 WebDriverManager.chromedriver().setup();
					driver = new ChromeDriver();
			 }
			 else if(bn.equals("opera"))
			 {
				 WebDriverManager.operadriver().setup();
					driver = new OperaDriver();
			 }
			 else if(bn.equals("firefox"))
			 {
				 WebDriverManager.firefoxdriver().setup();
					driver = new OperaDriver();
			 }
			 else
			 {
				 WebDriverManager.edgedriver().setup();
					driver = new EdgeDriver(); 
			 }
		
                driver.get("https://www.google.com");
	}

}
