package screenshot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;


public class ScreenmshotUniqueName
{
	public static void main(String[] args) throws InterruptedException, IOException
	{
		for(int i=0;i<=5;i++)
		{
		System.setProperty("webdriver.chrome.driver","C:\\Selenium files\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		driver.get("https://www.amazon.in/");
                           
	File Source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	//System.out.println(Source);
	File dest=new File("D:\\Users\\lenovo\\eclipse-workspace\\mission2021_selenium_tool\\Screenshot\\amazon"+i+".jpg");
	FileHandler.copy(Source, dest);
	driver.close();
	}
	}
}
