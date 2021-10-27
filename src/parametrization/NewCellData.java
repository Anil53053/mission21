package parametrization;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class NewCellData 
{
	public static void main(String[] args) throws EncryptedDocumentException, IOException
	{
	FileInputStream file = new FileInputStream("D:\\Users\\lenovo\\eclipse-workspace\\mission2021_selenium_tool\\TestData\\Input.xlsx");
		Workbook wbf = WorkbookFactory.create(file);
		
		//Sheet sh = wbf.getSheet("Sheet1");
		//Row r = sh.getRow(1);
		//Cell c = r.getCell(2);
		//System.out.println(c.getStringCellValue());
		
		
		String Value12 = wbf.getSheet("Sheet1").getRow(1).getCell(2).getStringCellValue();
		System.out.println(Value12);
		 CellType type = wbf.getSheet("Sheet1").getRow(1).getCell(2).getCellType();
		 System.out.println(type);
		boolean Value34 = wbf.getSheet("Sheet1").getRow(3).getCell(4).getBooleanCellValue();
		System.out.println(Value34);
		
		

		
		
	}

}
