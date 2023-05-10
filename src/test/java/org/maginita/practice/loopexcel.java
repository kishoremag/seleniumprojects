package org.maginita.practice;


import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class loopexcel 
{

	public static void main(String[] args) throws Exception 
	{
		WebDriverManager.chromedriver().setup();
		RemoteWebDriver driver=new ChromeDriver();
		driver.get("https://signin.ebay.com/ws/eBayISAPI.dll?SignIn&ru=https%3A%2F%2Fwww.ebay.com%2F");
		File file = new File ("C:\\Users\\PAVAN\\Documents\\loop.xlsx");
		FileInputStream fis = new FileInputStream(file);
		XSSFWorkbook workbook = new XSSFWorkbook(fis);
		XSSFSheet sheet = workbook.getSheetAt(0);
			
			int rowcount = sheet.getLastRowNum();
			int cellcount = sheet.getRow(1).getLastCellNum();
			System.out.println("rowcount:"+rowcount+"colcount:"+cellcount);
			for (int i = 1; i<rowcount;i++)
			{
				XSSFRow celldata = sheet.getRow(i);
				
		
				for(int j = 0 ;j<cellcount ; j++)
				{
					XSSFCell cell = celldata.getCell(j);
				
			
					
				
				String username = celldata.getCell(0).getStringCellValue();
				WebElement loop = driver.findElement(By.xpath("//*[@id='userid']")); 
				loop.sendKeys(username);
				loop.sendKeys(Keys.chord(Keys.CONTROL,"a"),Keys.chord(Keys.CONTROL.BACK_SPACE));
				loop.sendKeys(username);
				loop.sendKeys(Keys.chord(Keys.CONTROL,"a"),Keys.chord(Keys.CONTROL.BACK_SPACE));
				loop.sendKeys(username);
				loop.sendKeys(Keys.chord(Keys.CONTROL,"a"),Keys.chord(Keys.CONTROL.BACK_SPACE));
			
				System.out.println(i+","+username+"");
					
			}
		
	
		
	
		
	}

	}
}
