package findelements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultiElements1
{
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\selenium files\\chromedriver.exe");
	WebDriver driver= new ChromeDriver();
	driver.get("https://facebook.com/");
	Thread.sleep(2000);
	  List<WebElement> alllinks = driver.findElements(By.xpath("//a"));
 // count of links
	int linkcount = alllinks.size();
	System.out.println("linkcount= "+linkcount);
//Print list of links
	for( WebElement linkTitle:alllinks)
	{
	System.out.println(linkTitle.getText());
		
	}
}	

}
