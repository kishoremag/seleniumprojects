package org.maginita.practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.FluentWait;
import static org.openqa.selenium.support.ui.ExpectedConditions.*;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Naukri 
{

	public static void main(String[] args) 
	{
	WebDriverManager.chromedriver().setup();
	RemoteWebDriver driver = new ChromeDriver(); 
	FluentWait<RemoteWebDriver>wait = new FluentWait<RemoteWebDriver>(driver);
			wait.withTimeout(Duration.ofSeconds(20));
			wait.pollingEvery(Duration.ofMillis(400));
			driver.manage().window().maximize();
			driver.get("https://www.naukri.com");
wait.until(elementToBeClickable(By.xpath("//a[text()='Login']"))).click();		
WebElement e = wait.until(visibilityOfElementLocated
		(By.xpath("(//input[@type='text'])[1]")));
 e.sendKeys("kuruvakishore561@gmail.com");
 WebElement password = wait.until(visibilityOfElementLocated(By.xpath("//input[@type='password']")));
 password.sendKeys("9391737642");
 wait.until(elementToBeClickable(By.xpath("//button[@type='submit']"))).click();
 wait.until(elementToBeClickable(By.xpath("//div[text()='UPDATE PROFILE']"))).click();

 
 
			
			
			
			

	}

}
