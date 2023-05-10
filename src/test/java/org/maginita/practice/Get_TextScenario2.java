package org.maginita.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Get_TextScenario2 {

	public static void main(String[] args) throws Exception
	{
		 //open browser
		WebDriverManager.chromedriver().setup();
		RemoteWebDriver driver = new ChromeDriver();
		
		//launch site
		driver.get("http://semantic-ui.com/modules/dropdown.html");
		Thread .sleep(5000);	
		
		//get text of hidden element developed by paired tag and it has some text 
		WebElement e =  driver.findElement(By.xpath("//div[text() = 'Gender'][1]/following::div[3]"));
		 String x = e.getText();
		 System.out.println(x);
		 
		 //get value using java script 
		 String y = (String) driver.executeScript("return(arguments[0].textcontent);",e);
		 System.out.println(y);
		 
		 //close site
		 driver.close();

		 
	}

}
