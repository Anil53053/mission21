package webDriver;



import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class opendriver_method_continue
{
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","C:\\Selenium files\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://web.whatsapp.com/");
	  //7.maximize
		//driver.manage().window().maximize();
		
      //8.getsize  :length and width of browser
		System.out.println(driver.manage().window().getSize());
		
		//setsize
		Thread.sleep(5000);
		 Dimension D =new Dimension(1100, 800);
		driver.manage().window().setSize(D);
		
}

}