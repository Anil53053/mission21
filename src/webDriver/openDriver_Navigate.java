package webDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class openDriver_Navigate 
{
	public static void main(String[] args) throws InterruptedException
	{
	    System.setProperty("webdriver.chrome.driver","C:\\Selenium files\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
	//2.navigate	
	driver.navigate().to("https://www.youtube.com/");
	Thread.sleep(5000);
	driver.navigate().to("https://web.whatsapp.com/");
	Thread.sleep(5000);
	//driver.navigate().back();                                //youtube open
	//Thread.sleep(5000);
	//driver.navigate().forward();                                //whatsapp
	//Thread.sleep(5000);
	//driver.navigate().refresh();                                //whatsapp
	
	//3.current gettittle
	String acttitle=driver.getTitle();
	System.out.println(acttitle);
	System.out.println(driver.getTitle());
	
	//4.current getcurretUrl
	String actUrl=driver.getCurrentUrl();
	System.out.println(actUrl);
	
	//5.close:it will close browser-1tab close
	driver.close();
	
	//quit:it will close multiple tab at same time
	driver.quit();
	
	}	
}
