package org.maginita.practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RandU_Gmails 
{
	public static void main(String[] args) throws Exception
	{
		WebDriverManager.chromedriver().setup();
		RemoteWebDriver driver=new ChromeDriver();
		driver.get("https://www.gmail.com");
		Thread.sleep(5000);
		driver.findElement(By.name("identifier")).sendKeys("magnitiait72@gmail.com");
		driver.findElement(By.xpath("//span[text()='Next']/parent::button")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Magnitia@it");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//span[text()='Next']/parent::button")).click();
		Thread.sleep(5000);
		int urmc=0;
		int rmc=0;
		while(true)

		{
			WebElement wt=driver.findElement(By.xpath("(//table)[7]"));
			WebTableUtility obj=new WebTableUtility();
			List<WebElement> mails=obj.getRows(wt);
			for (WebElement mail:mails)
			{
				WebElement temp=mail.findElement(By.xpath("child::td[4]/div[1]"));
				String value=(String)driver.executeScript("return(arguments[0].textContent);", temp);
				if(value.contains("unread"))
				{
					urmc++;
				}
				else
				{
					rmc++;
				}
			}
			try
			{
				String x=driver.findElement(By.xpath("//div[@aria-label='Older']")).getAttribute("aria-disabled");
				if (x.equals("true"))
				{
					break;
				}
			}

			catch(Exception ex)
			{
				driver.findElement(By.xpath("//div[@aria-label='Older']")).click();
				Thread.sleep(5000);
			}
		}


		System.out.println("unread mails count is"+urmc);
		System.out.println("read mails count is"+rmc);


		driver.close();
	}

}