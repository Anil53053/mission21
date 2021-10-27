package parametrization;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Table {
	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		FileInputStream file = new FileInputStream("D:\\Users\\lenovo\\eclipse-workspace\\mission2021_selenium_tool\\TestData\\Input 1.xlsx");
		Workbook wbf = WorkbookFactory.create(file);

		int rowCount = wbf.getSheet("Sheet3").getLastRowNum();
		for(int i=0;i<=rowCount;i++)
		{
			int CellCount = wbf.getSheet("Sheet3").getRow(i).getLastCellNum();
			for(int j=0;j<CellCount;j++)
			{
				String value = wbf.getSheet("Sheet3").getRow(i).getCell(j).getStringCellValue();
				System.out.print(value+ "     ");
			}
			System.out.println();
		}
	
	}
}
