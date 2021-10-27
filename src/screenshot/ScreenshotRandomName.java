package screenshot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import net.bytebuddy.utility.RandomString;

public class ScreenshotRandomName 
{
	public static void main(String[] args) throws InterruptedException, IOException
	{
	System.setProperty("webdriver.chrome.driver","C:\\Selenium files\\chromedriver.exe");
	WebDriver driver =new ChromeDriver();
	driver.manage().window().maximize();
	Thread.sleep(2000);
	
	driver.get("https://www.amazon.in/");
                       
    File Source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
    
    String randomString= RandomString.make(4);

File dest=new File("D:\\Users\\lenovo\\eclipse-workspace\\mission2021_selenium_tool\\Screenshot\\"+randomString+".jpg");
FileHandler.copy(Source, dest);
driver.close();
	}
}
