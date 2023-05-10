package org.maginita.practice;

import java.util.List;
import java.util.Scanner;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.logging.LogEntry;
import org.openqa.selenium.opera.OperaDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestLogs114 {

	public static void main(String[] args) throws Exception
	{
	 Scanner sc = new Scanner(System.in);
	 System.out.println("Enter browser name");
	 String bn = sc.nextLine();
	 sc.close();
	 
	 //DECLARE DRIVER OBJECT TO PARENT CLASS AND DEFINE USING CHILD CLASS CONSTRUCTORS
	   
	 RemoteWebDriver driver = null;
	 
	 if(bn.equalsIgnoreCase("chrome"))
	 {
		 WebDriverManager.chromedriver().setup();
		 driver = new ChromeDriver();
	 }
	 else if(bn.equalsIgnoreCase("opera"))
	 {
		 WebDriverManager.operadriver().setup();
		 driver = new OperaDriver();
	 }
	 else if(bn.equalsIgnoreCase("edge"))
	 {
		 WebDriverManager.edgedriver().setup();
		 driver = new EdgeDriver();
	 }
	 
	 else
	 {
		 System.out.println("please check given browser name");
		 System.exit(0);
	 }
	 
	 //launch site
	 
	 driver.get("http://www.magnitia.com");
	 Thread.sleep(5000);
	 
	 //COLLECT BROWSERS LOGS ( FOR CHROME/EDGE/OPERA BROWSERS ONLY)
	 
	 List<LogEntry>alllogs = driver.manage().logs().get("browser").getAll();
	 
	 for(LogEntry log:alllogs)
	 {
		 System.out.println(log.getMessage()+" "+log.getTimestamp());
	 }
	 
	 //CLOSE SITE
	 driver.close();
	 
	}

}
