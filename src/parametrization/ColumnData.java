package parametrization;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ColumnData 
{
public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		FileInputStream file = new FileInputStream("D:\\Users\\lenovo\\eclipse-workspace\\mission2021_selenium_tool\\TestData\\Input 1.xlsx");
		Workbook wbf = WorkbookFactory.create(file);
//Coloumn no 2
		int rowCount = wbf.getSheet("Sheet2").getLastRowNum();
		System.out.println(rowCount);
		for(int i=0;i<=rowCount;i++)
		{
			String value = wbf.getSheet("Sheet2").getRow(i).getCell(1).getStringCellValue();
			System.out.print(value+ ",");
		}
	}
}
