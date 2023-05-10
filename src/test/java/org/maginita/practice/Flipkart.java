package org.maginita.practice;

import java.util.List;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Flipkart {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		RemoteWebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter mbl name--");
		String mbl=sc.nextLine();
		sc.close();


		driver.findElement(By.name("q")).sendKeys(mbl,Keys.ENTER);
		Thread.sleep(10000);

		WebElement dt=driver.findElement(By.xpath("(//div[contains(@style,'flex-grow')])[1]"));

		//Count of mobiles
		int mb=dt.findElements(By.xpath("descendant::div[contains(text(),'vivo')]")).size();
		System.out.println("No. of mobiles are " +mb);

		System.out.println("---------------------------------------------------------------");
		System.out.println("---------------------------------------------------------------");

		List<WebElement> mobiles=dt.findElements(By.xpath("descendant::div[contains(text(),'vivo')]"));
		for(WebElement mobile:mobiles)
		{
			System.out.println("The name of the mobiles are "+mobile.getText());
		}

		System.out.println("----------------------------------------------------------------");
		System.out.println("----------------------------------------------------------------");

		List<WebElement> prices=dt.findElements(By.xpath("descendant::div[@class='_3tbKJL']/div/div[@class='_30jeq3 _1_WHN1']"));
		int lfare=0;
		for(WebElement price:prices)
		{
			String num=price.getText();
			String value=num.replaceAll("[^0-9]", "");
			System.out.println("The price of the mobiles are "+value);

			if(lfare==0)
			{
				lfare=Integer.parseInt(value);

			}
			else if(lfare>Integer.parseInt(value))
			{
				lfare=Integer.parseInt(value);
			}


		}
		System.out.println("----------------------------------------------------------------");
		System.out.println("----------------------------------------------------------------");

		System.out.println("The lowest price of the mobile is "+lfare);







	}

}
