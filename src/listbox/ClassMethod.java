package listbox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ClassMethod 
{
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\selenium files\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']")).click();
		Thread.sleep(2000);
// For year		
		//WebElement year = driver.findElement(By.xpath("//select[@id='year']"));
		
		//Select s=new Select(year);
		//s.selectByIndex(11);
		//Thread.sleep(5000);
		//s.selectByValue("2004");
		//Thread.sleep(5000);
		//s.selectByVisibleText("1947");
		//Thread.sleep(5000);

//For Day
		WebElement date = driver.findElement(By.xpath("//select[@id='day']"));
		
		Select s1 = new Select(date);
		s1.selectByIndex(5);
		Thread.sleep(5000);
		s1.selectByValue("10");
		Thread.sleep(5000);
		s1.selectByVisibleText("30");
//for Month
		
		
	}
}
