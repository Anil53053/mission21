package action;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class action2 
{
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium files\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com");
		Thread.sleep(2000);
		
	WebElement newAcc = driver.findElement(By.xpath("(//a[@role='button'])[2]"));
		Actions act = new Actions(driver);
//Click with action click
		act.moveToElement(newAcc).click().build().perform();
		Thread.sleep(2000);
		WebElement month = driver.findElement(By.xpath("//select[@name='birthday_month']"));
		act.moveToElement(month).click().build().perform();
	Thread.sleep(2000);
	act.sendKeys(Keys.ARROW_UP).perform();
	Thread.sleep(2000);
	act.sendKeys(Keys.ARROW_UP).perform();
	Thread.sleep(2000);
	act.sendKeys(Keys.ARROW_UP).perform();
	Thread.sleep(2000);
	act.sendKeys(Keys.ARROW_UP).perform();
	Thread.sleep(2000);
    act.sendKeys(Keys.ENTER).perform();
	
	}
}
