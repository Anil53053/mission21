package findelements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleElements_GooglrSearch {
public static void main(String[] args) throws InterruptedException 
{
	System.setProperty("webdriver.chrome.driver", "C:\\Selenium files\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.google.com/");
	driver.findElement(By.xpath("//input[@class='gLFyf gsfi']")).sendKeys("Samsung");
	Thread.sleep(2000);
	List<WebElement> phone = driver.findElements(By.xpath("//li[@class='sbct']"));
	System.out.println(phone.size()+" options");
	
	 String s = "Samsung31";
	 for(int i=0 ; i<=phone.size();i++) {
		 System.out.println(i);
	 }
	
}


	
}

