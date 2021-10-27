package compatibilityTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Multi {
         
		
	public static void main(String[] args) {
		String browser="edge";
		 WebDriver driver =null;
	//1. Chrome
         if(browser.equals("chrome")) {	
			System.setProperty("webdriver.chrome.driver", "C:\\selenium files\\chromedriver.exe");
			driver= new ChromeDriver();
         }
			
	//2. Firefox
         if(browser.equals("firefox")) {	
			System.setProperty("webdriver.gecko.driver", "C:\\selenium files\\geckodriver.exe");
			driver = new FirefoxDriver();
         }
			
	//3. Microsoft edge
         if(browser.equals("edge")) {	
			System.setProperty("webdriver.edge.driver", "C:\\Selenium files\\msedgedriver.exe");
			driver = new EdgeDriver();
         }
			driver.get("https://facebook.com/");
			driver.findElement(By.xpath("//input[@type='text']")).sendKeys("8888234697");
			driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Anil@1998");
			driver.findElement(By.xpath("//button[@value='1']")).click();
			
		}
}
