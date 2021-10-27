package pom_pageFactory;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTestClass {
	public static void main(String[] args) throws InterruptedException{
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium files\\chromedriver.exe");
		ChromeDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("https://kite.zerodha.com");
		
//Login page
		KiteLoginPage LP = new KiteLoginPage (driver);
		LP.username();
		Thread.sleep(2000);
		LP.password();
		Thread.sleep(2000);
		LP.login();
		Thread.sleep(2000);
		
//pin page	
		KitePinPage PP = new KitePinPage(driver);
		PP.PinEnter();
		Thread.sleep(2000);
		PP.continuebutton();
		Thread.sleep(2000);
//homepage
		KiteHomePage HP = new KiteHomePage(driver) ;
		HP.verifyinitial();
	}
}
		
		

		
		
		