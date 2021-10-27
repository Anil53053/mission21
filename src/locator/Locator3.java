package locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locator3 
{
public static void main(String[] args) throws InterruptedException 
{
	System.setProperty("webdriver.chrome.driver","C:\\Selenium files\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	
	driver.get("https:demoqa.com/automation-practice-form");
	//driver.findElement()).sendKeys("anil");
	Thread.sleep(2000);
}
}
