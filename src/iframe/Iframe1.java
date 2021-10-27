package iframe;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Iframe1 
{
	public static void main(String[] args) throws InterruptedException, IOException 
	{
		
		System.setProperty("webdriver.chrome.driver","C:\\Selenium files\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_myfirst");
		Thread.sleep(2000);
//1. By index
		WebElement frameElement = driver.findElement(By.xpath("//iframe[@id='iframeResult']"));
		//driver.switchTo().frame(0);
//2. by name & id
		//driver.switchTo().frame("iframeResult");
//4.WebElement
		//driver.switchTo().frame(frameElement);
		driver.findElement(By.xpath("//button[@type='button']")).click();
		Thread.sleep(2000);
		
		String Time = driver.findElement(By.xpath("//p[@id='demo']")).getText();
		System.out.println(Time);
		
//5.parent iframe:focus changes from iframe to imediate Frame
		//driver.switchTo().parentFrame()
		
//6.Homepage:focus change from any child iframeto direct on Homepages
		driver.switchTo().defaultContent();
		//driver.findElement(By.xpath("//button[@type='button']")).click();
		
		driver.close();
		
		
		}	
	}


