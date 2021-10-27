package parametrization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class CellDataFact 
{
	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		 FileInputStream file = new FileInputStream("D:\\Users\\lenovo\\eclipse-workspace\\mission2021_selenium_tool\\TestData\\Input.xlsx");
		 Workbook wbf = WorkbookFactory.create(file);
//String 
		//String Name = wbf.getSheet("Sheet1").getRow(3).getCell(2).getStringCellValue();
		//System.out.println(Name);
//Numeric
		//double no = wbf.getSheet("Sheet1").getRow(7).getCell(3).getNumericCellValue();
		//System.out.println(no);
//boolean
		boolean Real = wbf.getSheet("Sheet1").getRow(4).getCell(4).getBooleanCellValue();
		System.out.println(Real);
		
	}

}
