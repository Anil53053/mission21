package findelements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultiCheckBox 
{
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Selenium files\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://demo.guru99.com/test/radio.html");
		List<WebElement> checkboxes = driver.findElements(By.xpath("//input[@type='checkbox']"));
	
			for(int i=0;i<=checkboxes.size();i++) 
			{
				Thread.sleep(2000);
				checkboxes.get(i).click();
				
		}
	}

}
