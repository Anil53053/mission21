package webtable;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Row 
{
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium files\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
	driver.get("https://en.wikipedia.org/wiki/Union_territory");
	Thread.sleep(2000);
//Row Disply
	List<WebElement> header = driver.findElements(By.xpath("//table[@class='wikitable sortable plainrowheaders jquery-tablesorter']//thead//th"));
	for(WebElement temp:header)
	{
		System.out.print(temp.getText()+ "          ");
	}
//Column Disply
	List<WebElement> column = driver.findElements(By.xpath("//table[@class='wikitable sortable plainrowheaders jquery-tablesorter']//tbody//th"));
	for(WebElement temp1:column)
	{
		System.out.println(temp1.getText());
	}
}
}