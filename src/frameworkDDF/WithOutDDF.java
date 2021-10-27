package frameworkDDF;

	import java.io.FileInputStream;
	import java.io.IOException;
	import java.sql.Driver;
	import java.util.concurrent.TimeUnit;

	import org.apache.poi.EncryptedDocumentException;
	import org.apache.poi.ss.usermodel.Workbook;
	import org.apache.poi.ss.usermodel.WorkbookFactory;
	import org.openqa.selenium.By;
	import org.openqa.selenium.chrome.ChromeDriver;

	public class WithOutDDF 
	{
		public static void main(String[] args) throws InterruptedException {
			System.setProperty("webdriver.chrome.driver", "C:\\selenium files\\chromedriver.exe");
			ChromeDriver driver =new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			driver.get("https://kite.zerodha.com");
			
	//1. enter UN
			Thread.sleep(1500);
			driver.findElement(By.xpath("//input[@id='userid']")).sendKeys("DP6852");
			
	//2. enter pwd
			Thread.sleep(1500);
			driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Pramod@2105");
			
	//3	Click login button
			Thread.sleep(1500);
			driver.findElement(By.xpath("//button[@type='submit']")).click();
			
	//4. enter pin
			Thread.sleep(1500);
			driver.findElement(By.xpath("//input[@id='pin']")).sendKeys("976848");
			
	//5. Click on Continue button
			Thread.sleep(1500);
			driver.findElement(By.xpath("//button[@type='submit']")).click();
			
			
			String exp = "PM";
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
		}
	}

