package org.maginita.practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



import io.github.bonigarcia.wdm.WebDriverManager;

public class Testpasha 
{

	public static void main(String[] args) 
	{
		
		/*System.setProperty(ChromeDriverService.CHROME_DRIVER_SILENT_OUTPUT_PROPERTY,"true");
		System.setProperty("webdriver.chrome.driver","true");*/
		
		//System.setProperty("webdriver.chrome.driver","C:\\Program Files\\Google\\Chrome\\Application\\chrome.exe");
		WebDriverManager.chromedriver().browserVersion("107.0.5304.122").driverVersion("107.0.5304.122").setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com");

	}

}
