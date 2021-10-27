package autosuggetion;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetOption
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium files\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.findElement(By.xpath("//input[@class='gLFyf gsfi']")).sendKeys("Samsung");
		Thread.sleep(2000);
//Get the Option
		List<WebElement> Suggetion = driver.findElements(By.xpath("//div[@class='pcTkSc']"));
		for(WebElement temp:Suggetion)
		{
			System.out.println(temp.getText());
		}
		System.out.println("Suggetion of size ="+Suggetion.size());
// Check for perticular keyword in Suggetion
		String exp = "samsung a50";
		for(WebElement temp:Suggetion)
		{
			String Act = temp.getText();
			if(exp.equals(Act))
			{
				temp.click();
				Thread.sleep(2000);
				driver.close();
				break;
			}
		}
	}

}
