package mypack;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test106
{
	public static void main(String[] args) throws Exception
	{
		//open chrome browser
		WebDriverManager.chromedriver().setup();
		RemoteWebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		//Launch site
		driver.get("https://www.flipkart.com");
		Thread.sleep(5000);
		//close banner if exists
		try
		{
			driver.findElement(By.xpath(
					"(//span[text()='Login'])[1]/preceding::button[1]")).click();
			Thread.sleep(5000);
		}
		catch(Exception ex)
		{
			System.out.println("No banner");
		}
		//click on "mobiles" link
		driver.findElement(By.xpath("//div[text()='Mobiles']")).click();
		Thread.sleep(5000);
		//click on "Shop Now"
		driver.findElement(By.xpath("(//p[text()='Shop Now'])[1]")).click();
		Thread.sleep(5000);
		//collect and display name and price of each model via pagination
		int total=0;
		while(true)
		{
			//Step-1:collect all models in current page
			List<WebElement> models=driver.findElements(By.xpath(
					       "//div[starts-with(@data-id,'MOBG')]"));
			System.out.println(models.size());
			total=total+models.size();
			//Step-2:goto each model to get name and price
			for(WebElement model:models)
			{
				String name=model.findElement(By.xpath(
						"(child::div/a/div[2]/div/div)[1]")).getText();
				String price=model.findElement(By.xpath(
						"child::div/a/div[2]/div[2]/div[1]/div[1]/div[1]")).getText();
				System.out.println("Name:"+name+"& Price:"+price);
			}
			//Step-3:goto next page if exists
			try
			{
				driver.findElement(By.xpath("//span[text()='Next']")).click();
				Thread.sleep(3000);
			}
			catch(Exception e)
			{
				break;
			}
		}
		System.out.println("Total models are "+total);
		//close
		driver.close();
	}
}

