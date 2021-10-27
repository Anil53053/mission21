package frameworkDDF;
//homework...solve free time
import java.io.FileInputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WithDDF1_Practice
{
public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException 
{
	System.setProperty("webdriver.chrome.driver", "C:\\Selenium files\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
	
	FileInputStream file = new FileInputStream("D:\\Users\\lenovo\\eclipse-workspace\\mission2021_selenium_tool\\TestData\\Anil Mock.xlsx");
	Sheet sh = WorkbookFactory.create(file).getSheet("Project Data");
	String url = sh.getRow(3).getCell(1).getStringCellValue();
	driver.get(url);
	Thread.sleep(2000);
	String UN = sh.getRow(0).getCell(1).getStringCellValue();
	driver.findElement(By.xpath("//input[@type=\"text\"]")).sendKeys(UN);
	
}
}

