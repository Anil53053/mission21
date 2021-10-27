package action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


//double click on Action class....
public class Action3 
{
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium files\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demo.guru99.com/test/simple_context_menu.html");
		
	Actions act = new Actions(driver);
	WebElement btn = driver.findElement(By.xpath("(//button[text()='Double-Click Me To See Alert'])"));
	//act.doubleClick(btn).perform();
	act.moveToElement(btn).doubleClick().build().perform();
	
		
	}
	

}
