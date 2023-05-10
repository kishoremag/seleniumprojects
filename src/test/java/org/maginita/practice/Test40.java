 package org.maginita.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test40 {

	public static void main(String[] args) throws Exception
	{
		//open browser
		WebDriverManager.chromedriver().setup();
		RemoteWebDriver driver = new ChromeDriver();

		driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml5_input_type_radio");
		Thread.sleep(5000);

		driver.switchTo().frame("iframeResult");
		WebElement e = driver.findElement(By.xpath("//input[@value = 'HTML']"));
		Thread.sleep(5000);

		if(e.isDisplayed())
		{
			System.out.println("Element is visible in page");

			if(e.isEnabled())
			{
				System.out.println("Element is enabled in page");

				//when element is radio button ,checkbox,drop down (not for all)

				if(e.isSelected())
				{
					System.out.println("Element is  selected in page");
				}
				else
				{
					System.out.println("Element is not selected in page,so im going to select");
					e.click();
				}
			}
			else
			{
				System.out.println("Element is  disabled in page");

			}
		}
		else
		{
			System.out.println("Element is not visible in page");
		}
	}

}
