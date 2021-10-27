package compatibilityTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MultiBrowser 
{
public static void main(String[] args) 
{
//1.chrome
	//System.setProperty("webdriver.chrome.driver","C:\\Selenium files\\chromedriver.exe");
	//WebDriver driver= new ChromeDriver();
	
//2.FireFox
	//System.setProperty("webdriver.gecko.driver","C:\\Selenium files\\geckodriver.exe");
		//WebDriver driver= new FirefoxDriver();
//3.Mocrosoft Edge 
		
	System.setProperty("webdriver.edge.driver","C:\\Selenium files\\msedgedriver.exe");
		WebDriver driver=new EdgeDriver();
	

	driver.get("https://facebook.com/");
	driver.findElement(By.xpath("//input[@type='text']")).sendKeys("8888234697");
	driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Anil@1998");
	driver.findElement(By.xpath("//button[@value='1']")).click();
	
		
}
}
