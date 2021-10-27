package action;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Action1 {
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
		WebElement btn = driver.findElement(By.xpath("//a[@class='_1_3w1N']"));
		act.moveToElement(btn).build().perform();
		
		//List<WebElement> loginList = driver.findElements(By.xpath("//a[@class='_1_3w1N']/ancestor::div[1]/following-sibling::div//li"));
		List<WebElement> loginList = driver.findElements(By.xpath("//a[@class='_1_3w1N']/ancestor::div[2]/div"));
		Thread.sleep(2000);
		
		for(WebElement item:loginList)
		{
			System.out.println(item.getText());
		}
		Thread.sleep(2000);
//Right click
		WebElement logo = driver.findElement(By.xpath("//img[@width='75']"));
		act.moveToElement(logo).contextClick().build().perform();
		//act.contextClick(logo).build().perform();
		
}
	
}

