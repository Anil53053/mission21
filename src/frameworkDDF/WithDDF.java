package frameworkDDF;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class WithDDF 
{
	public static void main(String[] args) throws InterruptedException, EncryptedDocumentException, IOException {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium files\\chromedriver.exe");
		ChromeDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		
		FileInputStream file = new FileInputStream("D:\\Users\\lenovo\\eclipse-workspace\\mission2021_selenium_tool\\TestData\\Anil Mock.xlsx");
		Sheet sh = WorkbookFactory.create(file).getSheet("Project Data");
		String url=sh.getRow(3).getCell(1).getStringCellValue();
		
		driver.get(url);
//1. enter UN
		Thread.sleep(1500);
		String UN = sh.getRow(0).getCell(1).getStringCellValue();
		driver.findElement(By.xpath("//input[@id='userid']")).sendKeys(UN);
		
//2. enter pwd
		Thread.sleep(1500);
		String pwd = sh.getRow(1).getCell(1).getStringCellValue();
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys(pwd);
		
//3	Click login button
		Thread.sleep(1500);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
//4. enter pin
		Thread.sleep(1500);
		String pin = sh.getRow(2).getCell(1).getStringCellValue();
		driver.findElement(By.xpath("//input[@id='pin']")).sendKeys(pin);
		
//5. Click on Continue button
		Thread.sleep(1500);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		
		String exp = sh.getRow(3).getCell(1).getStringCellValue();
//6. get initial text
		Thread.sleep(1500);
		String act = driver.findElement(By.xpath("//div[@class='avatar']/span")).getText();
		
		Thread.sleep(1500);
		if(exp.equals(act))
		{
			System.out.println("Test case pass");
		}
		else
		{
			System.out.println("Test case fail");
		}
		driver.close();
}
}


