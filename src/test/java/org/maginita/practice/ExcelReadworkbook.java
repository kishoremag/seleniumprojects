package org.maginita.practice;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFEvaluationWorkbook;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReadworkbook 
{

	public static void main(String[] args) throws Exception 
	{
		File file = new File ("C:\\Users\\PAVAN\\Documents\\Book1.xlsx");
		FileInputStream fis = new FileInputStream(file);
		XSSFWorkbook workbook = new XSSFWorkbook(fis);
		XSSFSheet sheet = workbook.getSheetAt(1);
		
	/*	String cellvalue = sheet.getRow(0).getCell(0).getStringCellValue();
		System.out.println(cellvalue);*/
		
		int rowcount = sheet.getPhysicalNumberOfRows();
		for (int i = 0; i<rowcount;i++)
		{
			XSSFRow row = sheet.getRow(i);
			
			int cellcount = row.getPhysicalNumberOfCells();
			for(int j = 0 ;j<cellcount ; j++)
			{
				XSSFCell cell = row.getCell(j);
				String cellvalue = getcellvalue(cell);
				System.out.print(" || "+cellvalue);
				
				
			}
			System.out.println();
		}
			workbook.close();
			fis.close();
			
	}


	
	public static String getcellvalue(XSSFCell cell) 
	{
		switch(cell.getCellType())
		{
		case NUMERIC:
			return String.valueOf(cell.getNumericCellValue());
			
		case BOOLEAN: 
			return String.valueOf(cell.getBooleanCellValue());
			
		case STRING:
			return cell.getStringCellValue();
			default:
			return cell.getStringCellValue();
			
		}		
	}

}
