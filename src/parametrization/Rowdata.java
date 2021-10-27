package parametrization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Rowdata 
{
public static void main(String[] args) throws EncryptedDocumentException, IOException 
{
	FileInputStream file = new FileInputStream("D:\\Users\\lenovo\\eclipse-workspace\\mission2021_selenium_tool\\TestData\\Input 1.xlsx");
	Workbook wbf = WorkbookFactory.create(file);
//row no 1
	int CellCount = wbf.getSheet("Sheet3").getRow(1).getLastCellNum();
	System.out.println(CellCount);
	for(int i=0;i<=CellCount;i++)
	{
		String value = wbf.getSheet("Sheet3").getRow(1).getCell(i).getStringCellValue();
		System.out.print(value+ ",");
	}
	
}
}
