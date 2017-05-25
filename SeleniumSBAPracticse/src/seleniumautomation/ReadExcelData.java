package seleniumautomation;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcelData {
	
	XSSFWorkbook wb;
	XSSFSheet Sheet1;
	
public ReadExcelData ()
{
	try {
		File src = new File ("D:\\TestData.xlsx");
		FileInputStream fis = new FileInputStream (src);
		wb = new XSSFWorkbook (fis);
	
	} 
	
	catch (IOException e) {
		
		System.out.println("Print the message : "+e.getMessage());
	}
}

public String getdata (int Sheetnumber, int row, int col)
{
	Sheet1 = wb.getSheetAt(Sheetnumber);
	String data = Sheet1.getRow(row).getCell(col).getStringCellValue();
			return data;
}
public int getrowcount (int sheetindex)
{
	int row = wb.getSheetAt(sheetindex).getLastRowNum();
	row = row + 1;
	return row;
}


}
