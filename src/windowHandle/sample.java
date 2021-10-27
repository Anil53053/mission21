package windowHandle;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class sample 
{
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\Selenium files\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://chandanachaitanya.github.io/selenium-practice-site/?languages=Java&enterText=");
	Thread.sleep(2000);
	
//open new browser by clicking button
	driver.findElement(By.xpath("//button[@id=\"win1\"]")).click();
	Set<String> ids = driver.getWindowHandles();
	ArrayList<String> al=new ArrayList<String> (ids);
	
//operation in child window
	driver.switchTo().window( al.get(1));
	driver.findElement(By.xpath("//input[@class=\"gLFyf gsfi\"]")).sendKeys("Samsung");
	Thread.sleep(5000);
	driver.findElement(By.xpath("//input[@class=\"gNO89b\"]")).click();
	Thread.sleep(2000);
	
//Operation in homepage(Parentpage)
	driver.switchTo().window(al.get(0));
	driver.findElement(By.xpath("//input[@type=\"text\"]")).sendKeys("Anil");
	Thread.sleep(2000);
	
}
}
