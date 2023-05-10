package org.maginita.practice;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebPushNotifications {

	public static void main(String[] args) throws AWTException {
		
		
/*      ChromeOptions options = new ChromeOptions();
		options.addArguments("Disable-notifications");*/
		WebDriverManager.chromedriver().setup(); 
		RemoteWebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.spicejet.com");
		
	Robot r = new Robot();
	r.keyPress(KeyEvent.VK_ESCAPE);
	r.keyRelease(KeyEvent.VK_ESCAPE);
	}

}
