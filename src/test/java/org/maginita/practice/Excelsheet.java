package org.maginita.practice;

import java.io.File;

import java.io.FileOutputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excelsheet {

	public static void main(String[] args) throws Exception 
	{
		
		XSSFWorkbook workbook = new XSSFWorkbook();
		XSSFSheet sheet = workbook.createSheet();
		
		sheet.createRow(0);
		sheet.getRow(0).createCell(0).setCellValue("hello");
		sheet.getRow(0).createCell(1).setCellValue("world");
		
		sheet.createRow(1);
		sheet.getRow(1);
		sheet.getRow(1).createCell(0).setCellValue("Kishore");
		sheet.getRow(1).createCell(1).setCellValue("kumar");
		
		File file = new File("C:\\Users\\PAVAN\\Documents\\Book1.xlsx");
		FileOutputStream fos = new FileOutputStream(file);
		
		workbook.write(fos);
		workbook.close();
		
		

	}

}
