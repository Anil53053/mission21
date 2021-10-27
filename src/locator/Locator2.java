package locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class Locator2 
{
	public static void main(String[] args) throws InterruptedException
	{
		
		System.setProperty("webdriver.chrome.driver","C:\\Selenium files\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		
		driver.get("https:itera-qa.azurewebsites.net/home/automation");
		Thread.sleep(5000);
		
		
	//	1 id
	driver.findElement(By.id("name")).sendKeys("anil");
	Thread.sleep(2000);
	//2 class
	//driver.findElement(By.xpath("//input[@type='text'])[2]")).sendKeys("123456789");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@type='password']")).sendKeys("anil@123");
	Thread.sleep(2000);
	driver.findElement(By.id("name")).clear();
	Thread.sleep(2000);
	driver.findElement(By.tagName("input")).sendKeys("Change of name");
	Thread.sleep(2000);
	driver.findElement(By.xpath("(//button[@type='submit'])[2]")).click();
	Thread.sleep(2000);
	}
}
