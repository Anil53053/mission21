package parametrization;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
		import java.io.FileInputStream;
		import java.io.FileNotFoundException;
		import java.io.IOException;

		import org.apache.poi.EncryptedDocumentException;
		import org.apache.poi.ss.usermodel.Workbook;
		import org.apache.poi.ss.usermodel.WorkbookFactory;
		import org.openqa.selenium.By;
		import org.openqa.selenium.WebDriver;
		import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

		public class BrowserXlsheet {
		       static	WebDriver driver=null;
			public static void main(String[] args) throws EncryptedDocumentException, IOException 
			{
				 String browser=null;
				  FileInputStream file = new FileInputStream("D:\\Users\\lenovo\\eclipse-workspace\\mission2021_selenium_tool\\TestData\\Input 1.xlsx");
				  Workbook wbf = WorkbookFactory.create(file);
				  for(int i=1;i<=3;i++)
				  {
				   browser = wbf.getSheet("Sheet4").getRow(i).getCell(0).getStringCellValue();

		           System.out.println(browser);
				  
				  
		           if(browser.equals("chrome"))
		           {
		           
		           System.setProperty("webdriver.chrome.driver","C:\\selenium files\\chromedriver.exe");
		  		    driver=new ChromeDriver();
		  		   search();
		           }
		          else if(browser.equals("edge"))
		          {
		            System.setProperty("webdriver.edge.driver","C:\\Selenium files\\msedgedriver.exe");
		      		  driver=new EdgeDriver();
		      		  search();
		              }
		           else if(browser.equals("gecko"))
		           {
		                System.setProperty("webdriver.gecko.driver","C:\\selenium files\\geckodriver.exe");
		      		    driver=new FirefoxDriver();
		      		   search();
		               }
				  } 
			}  
		      	public static void search()
			{
				driver.get("http://www.facebook.com/");
				driver.findElement(By.xpath("//input[@id='email']")).sendKeys("abc@gamil.com");
				driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("ewtwuuii");
				driver.findElement(By.xpath("//button[@name='login']")).click();
			}
	
}
