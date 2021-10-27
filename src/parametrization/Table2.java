package parametrization;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Table2 
{
	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		FileInputStream file = new FileInputStream("D:\\Users\\lenovo\\eclipse-workspace\\mission2021_selenium_tool\\TestData\\Input 1.xlsx");
		Sheet sh = WorkbookFactory.create(file).getSheet("Sheet3");
		
		int rowcount = sh.getLastRowNum();
		for(int i=0;i<=rowcount;i++)
		{
			int cellCount = sh.getRow(i).getLastCellNum();
			for(int j=0;j<cellCount;j++) 
			{
				String value = sh.getRow(i).getCell(j).getStringCellValue();
				System.out.print(value+"   ");
			}
			System.out.println();
		}

}
}