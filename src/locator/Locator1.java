package locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locator1
{
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","C:\\Selenium files\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("C:/Users/lenovo/Desktop/Regitration.html");
	Thread.sleep(2000);
	driver.findElement(By.id("123")).sendKeys("anil");
	Thread.sleep(2000);
	driver.findElement(By.name("demo")).sendKeys("karad");
	Thread.sleep(2000);
	driver.findElement(By.id("123")).clear();
	Thread.sleep(2000);
	driver.findElement(By.tagName("input")).sendKeys("Change of Name");
	Thread.sleep(2000);
	driver.findElement(By.className("Sample")).clear();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@type='Password']")).sendKeys("abc@123");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@type='radio'][1]")).click();
	Thread.sleep(2000);
	//driver.findElement(By.xpath("//input[@type='Checkbox'][1]")).click();
	//Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@value='Submit Form']")).click();
	Thread.sleep(2000);
	driver.findElement(By.linkText("FACEBOOK")).click();
	
	//driver.findElement(By.partialLinkText("CE")).click();
	
	
}


}
