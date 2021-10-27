package action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class action5 
{
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium files\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demo.guru99.com/test/drag_drop.html");
		Thread.sleep(2000);
		//source of web element...
		WebElement source1 = driver.findElement(By.xpath(" (//a[@class='button button-orange'])[2]"));
		WebElement source2 = driver.findElement(By.xpath("(//a[@class='button button-orange'])[4]"));
		WebElement Bankscr = driver.findElement(By.xpath("(//a[@class='button button-orange'])[5]"));
		WebElement Salesscr = driver.findElement(By.xpath("(//a[@class='button button-orange'])[6]"));
		
		//trget//destination webelements
		WebElement DebitAcDest = driver.findElement(By.xpath("(//li[@class='placeholder'])[1]"));
		WebElement DebitAmountDest = driver.findElement(By.xpath("(//li[@class='placeholder'])[2]"));
		WebElement CreditAcDest = driver.findElement(By.xpath("(//li[@class='placeholder'])[3]"));
		WebElement CreditAmountDest = driver.findElement(By.xpath("(//li[@class='placeholder'])[4]"));
		
		Thread.sleep(2000);
		Actions act = new Actions(driver);
		//act.moveToElement(source1).clickAndHold().release(DebitAmountDest).build().perform();
		                          //or
		//act.clickAndHold(source1).release(DebitAmountDest).build().perform();
		                              // or
		act.dragAndDrop(source1, DebitAmountDest).perform();
		Thread.sleep(2000);
		act.dragAndDrop(source2, CreditAmountDest).perform();
		Thread.sleep(2000);
		act.dragAndDrop(Bankscr, DebitAcDest).perform();
		Thread.sleep(2000);
		act.dragAndDrop(Salesscr, CreditAcDest).perform();
		Thread.sleep(5000);
		driver.close();
		
		
	}
}
