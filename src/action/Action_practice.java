package action;
//using Action class find more mode details
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Action_practice {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium files\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
//object creation of action class
		Actions act = new Actions(driver);
//Bring cursor login button		
		WebElement btn = driver.findElement(By.xpath("//div[@class='exehdJ']"));
		act.moveToElement(btn).build().perform();
		
List<WebElement> moreList = driver.findElements(By.xpath("//div[@class='exehdJ']/ancestor::div[4]/div/div"));
		Thread.sleep(2000);
		
		for(WebElement item:moreList)
		{
		System.out.println(item.getText());
			
		}
		Thread.sleep(2000);
}
}