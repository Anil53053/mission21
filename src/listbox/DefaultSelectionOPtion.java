package listbox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;




public class DefaultSelectionOPtion 
{
	//getFirst select option
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","C:\\selenium files\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//a[@role='button'])[2]")).click();
		Thread.sleep(2000);
//for find day
		WebElement day = driver.findElement(By.xpath("//select[@id='day']"));
		Select s= new Select(day);
	WebElement dayvalue = s.getFirstSelectedOption();
//	String str = dayvalue.getText();
		System.out.println(dayvalue.getText());  //str
		
//for find month
		//WebElement Month = driver.findElement(By.xpath("//select[@aria-label='Month']"));
		//Select s= new Select(Month);
		//WebElement Monthvalue = s.getFirstSelectedOption();
		//System.out.println(Monthvalue.getText());
		
		
		
	}

}
