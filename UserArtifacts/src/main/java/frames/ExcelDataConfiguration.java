package frames;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelDataConfiguration 
{
	XSSFWorkbook wb;
	XSSFSheet sheet1; 
	
	public ExcelDataConfiguration (String ExcelPath) // this is for locating excel sheet //
	{
		
		
		try {
			File src = new File (ExcelPath); 
			
			FileInputStream fis = new FileInputStream (src); 
			
			wb = new XSSFWorkbook (fis); 
			
			
		} 
		catch (Exception e) 
		{
			
			System.out.println("print the exception while reading excel data :"+e.getMessage());
		} 
	}
		
		public String getdata(int sheetnumber,int row,int col) // this is used for reading row and col value from the excel sheet //
		{
			
			sheet1  = wb.getSheetAt(0);
		String data = sheet1.getRow(row).getCell(col).getStringCellValue();
			return data;
			
			
		}
		
		 public int getrowcount (int sheetindex ) // this method is used to count the number of rows in the sheet
		{
			
			
			
			int row = wb.getSheetAt(sheetindex).getLastRowNum(); // it will return the index value (i.e) if the sheet having 15 rows, it will return as 14. as 1st row index is 0 //
			row = row + 1; // so what ever the value it is increased by 1. 
			return row;
			
		}


		
		} 
		
	

