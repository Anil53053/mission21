package screenshot;


import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Screenshot 
{
	public static void main(String[] args) throws InterruptedException, IOException 
	{
		{
		System.setProperty("webdriver.chrome.driver","C:\\Selenium files\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		driver.get("https://www.amazon.in/");
		Thread.sleep(2000);
   // TakesScreenshot ts = (TakesScreenshot)driver;
	//File source = ts.getScreenshotAs(OutputType.FILE);
	
		
	File Source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	System.out.println(Source);
	
	File dest=new File("D:\\Users\\lenovo\\eclipse-workspace\\mission2021_selenium_tool\\Screenshot\\amazon.jpg");
	FileHandler.copy(Source, dest);
	
	}
	}
}
