package listbox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Practice {
public static void main(String[] args) throws InterruptedException
{
	System.setProperty("webdriver.chrome.driver","C:\\Selenium files\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https:chercher.tech/practice/practice-dropdowns-selenium-webdriver");
	Thread.sleep(2000);
	WebElement sample = driver.findElement(By.xpath("(//select[@class='col-lg-3'])[2]"));
	Select s=new Select(sample);
	boolean output = s.isMultiple();
	if(output=false)
	{
		System.out.println("is multiple");
	}
	else {
		System.out.println("single selectable");
	}
	
}
}
