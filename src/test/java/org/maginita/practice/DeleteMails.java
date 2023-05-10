package org.maginita.practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DeleteMails 
{

	public static void main(String[] args) throws Exception
	{
		WebDriverManager.chromedriver().setup();
		RemoteWebDriver driver=new ChromeDriver();
		driver.get("https://www.gmail.com");
		Thread.sleep(5000);
		driver.findElement(By.name("identifier")).sendKeys("magnitiait72@gmail.com");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//span[text()='Next']/parent::button")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Magnitia@it");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//span[text()='Next']/parent::button")).click();
		Thread.sleep(5000);
		int dmc=0;
		
		while(true)

		{
			WebElement wt=driver.findElement(By.xpath("(//table)[7]"));
			WebTableUtility obj=new WebTableUtility();
			List<WebElement> mails=obj.getRows(wt);
			//go to each row(mail)
			for (int i=0;i<mails.size();i++)
	
			{
				WebElement temp=mails.get(i).findElement(By.xpath("child::td[4]/div[2]/span[1]/span"));
				String value=temp.getAttribute("email");
				if(value.contains("support@stripe.com"))
				{
					//delete current mail by selecting check box and click on delete
					
					WebElement cb = mails.get(i).findElement(By.xpath("child::td[2]/div[@role='checkbox']"));
					driver.executeScript("arguments[0].scrollIntoView();",cb);
					cb.click();
					Thread.sleep(5000);
					
					mails.get(i).findElement(By.xpath("(child::td[9]/ul/li)[2]")).click();
					Thread.sleep(5000);
					
					/*//close output message banner
					driver.findElement(By.className("bBe")).click();
					Thread.sleep(5000);
					//relocate row in table once agian to avoid stale issue
					mails = obj.getRows(wt);
					i--;//to cover next mail which replaced delated mail
					dmc++;// increase deleted mails count*/
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


		System.out.println("delete mails count is"+dmc);
	


		driver.close();
	}

} 

	


