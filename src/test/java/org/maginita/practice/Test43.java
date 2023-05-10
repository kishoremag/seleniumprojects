package org.maginita.practice;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test43 {

	public static void main(String[] args) throws Exception
	{
		// open browser
		WebDriverManager.chromedriver().setup();
		RemoteWebDriver driver = new ChromeDriver();

		//launch site

		driver.get("http://www.google.co.in");
		Thread.sleep(5000);

		//locate on visible element and get screenshot

		WebElement e = driver.findElement(By.xpath("//div[@aria-label='Search by voice']"));

		//way 1: as a file 

		File dest1 = new File("elementpic.png");

		File src1 = e.getScreenshotAs(OutputType.FILE);
		FileHandler.copy(src1,dest1);

		//Way-2 as base64 string

		String src2 = e.getScreenshotAs(OutputType.BASE64);
		System.out.println(src2);

		//way-3 as binarycode

		byte src3[] = e.getScreenshotAs(OutputType.BYTES);

		//CLOSE site

		driver.close();














	}

}
