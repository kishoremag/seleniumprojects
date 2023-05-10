package org.maginita.practice;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Excellooping {

	public static void main(String[] args) throws Exception {

		WebDriverManager.chromedriver().setup();
		RemoteWebDriver driver = new ChromeDriver();
		driver.get("https://online.roboform.com/site/signup");
		File file = new File("C:\\Users\\PAVAN\\Documents\\loop.xlsx");
		FileInputStream fi = new FileInputStream(file);
		XSSFWorkbook workbook = new XSSFWorkbook(fi);
		XSSFSheet sheet = workbook.getSheet("sheet1");
		int rowcount = sheet.getLastRowNum();
		int colcount = sheet.getRow(1).getLastCellNum();
		System.out.println("rowcount:"+rowcount+"colcount:"+colcount);

		for(int i =1;i<=rowcount;i++)
		{
			XSSFRow celldata = sheet.getRow(i);
			
			//String mail= celldata.getCell(0).getStringCellValue();
			String password= celldata.getCell(1).getStringCellValue();
			//String confirmpassword= celldata.getCell(2).getStringCellValue();
			//String fullname= celldata.getCell(3).getStringCellValue();

			//driver.findElement(By.xpath("//input[@id='email']")).clear();
			//driver.findElement(By.xpath("//input[@id='email']")).sendKeys(mail);
			driver.findElement(By.xpath("//input[@name='password']")).clear();
			driver.findElement(By.xpath("//input[@name='password']")).sendKeys(password);
			//driver.findElement(By.xpath("//input[@id='email']")).clear();
			//driver.findElement(By.xpath("//input[@id='email']")).sendKeys(confirmpassword);
			//driver.findElement(By.xpath("//input[@name='name']")).clear();
			//driver.findElement(By.xpath("//input[@name='name']")).sendKeys(fullname);

			System.out.println(i+"."+password+"");
					
					//+ "||"+password+"||"+confirmpassword+"||"+fullname);











		}	

	}


}
