package parametrization;


	import java.io.FileInputStream;
	import java.io.FileNotFoundException;
	import java.io.IOException;

	import org.apache.poi.EncryptedDocumentException;
	import org.apache.poi.ss.usermodel.Workbook;
	import org.apache.poi.ss.usermodel.WorkbookFactory;
	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
	public class getCellData 
	{
		public static void main(String[] args) throws EncryptedDocumentException, IOException {
			
			FileInputStream file = new FileInputStream("D:\\Users\\lenovo\\eclipse-workspace\\mission2021_selenium_tool\\TestData\\Input.xlsx");
			Workbook wbf = WorkbookFactory.create(file);
			 
	//String		 
			String dataString = wbf.getSheet("Sheet1").getRow(1).getCell(1).getStringCellValue();
			System.out.println(dataString);
//			
//					System.setProperty("webdriver.chrome.driver", "C:\\selenium files\\chromedriver.exe");
//					WebDriver driver= new ChromeDriver();
//					driver.get("https://www.facebook.com/");
//					driver.findElement(By.xpath("//input[@id='email']")).sendKeys(dataString);
			
	//Numeric		
			double dataNumber = wbf.getSheet("Sheet1").getRow(7).getCell(3).getNumericCellValue();
			System.out.println(dataNumber);
	////Boolean
			boolean dataBoolean = wbf.getSheet("Sheet1").getRow(5).getCell(4).getBooleanCellValue();
			System.out.println(dataBoolean);
					
	//Row count -index
			int lastRowNo = wbf.getSheet("Sheet1").getLastRowNum();
			System.out.println(lastRowNo);
	//Column count
			short lastColumnNo = wbf.getSheet("Sheet1").getRow(1).getLastCellNum();
			System.out.println(lastColumnNo);
		}
	}





