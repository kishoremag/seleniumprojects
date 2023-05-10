package org.maginita.practice;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test97WebAlert2 {

	public static void main(String[] args) throws Exception
	{
	WebDriverManager.chromedriver().setup();
	RemoteWebDriver driver = new ChromeDriver();
	
	
	//open site
	
	driver.get("https://www.w3schools.com/jsref/met_win_alert.asp");
	Thread.sleep(5000);
	
	//in 1st browser window/tab
	driver.findElement(By.xpath("(//a[contains(text(),'Try it')])[1]")).click();
	Thread.sleep(5000);
	
	//get window handles and move to 2nd window/tab
	//new window
	///driver.switchTo().newWindow(WindowType.TAB);
	Set<String>s = driver.getWindowHandles();
	List<String>a=new ArrayList<String>(s);
	driver.switchTo().window(a.get(1));
	Thread.sleep(5000);
	
	//switch to frame in that 2 nd window/tab

		driver.switchTo().frame("iframeResult");
		
	
		driver.findElement(By.xpath("//button[text()='Try it']")).click();
		Thread.sleep(5000);
		
		//switch to alert
		driver.switchTo().alert().dismiss();
		
		//the above statement dismisses alert and send back "driver" objcet focus to frame
		
		Thread.sleep(5000);
		
		//back to 2nd window/tab from frame
		
		driver.switchTo().defaultContent();
		
		//close 2nd window/tab
		driver.close();
		Thread.sleep(5000);
		
		//back to 1st windwo/tab
		
		driver.switchTo().window(a.get(0));
		
		//close 1st windwp/tab
		driver.close();
	}

}
