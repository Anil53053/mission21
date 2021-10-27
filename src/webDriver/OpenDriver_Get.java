package webDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenDriver_Get {
public static void main(String[] args) throws InterruptedException
{
	System.setProperty("webdriver.chrome.driver","C:\\Selenium files\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	//1.get
	//driver.get("https://web.whatsapp.com/");
	//driver.get("https://www.youtube.com/");
    //driver.get("https://mail.google.com/mail/");
  //  driver.get("https://facebook.com/");
    driver.get("https://www.amazon.in/");
	driver.get("https://www.freecharge.in/");
}
}
