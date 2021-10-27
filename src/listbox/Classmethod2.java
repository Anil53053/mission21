package listbox;
	import java.util.List;
	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.support.ui.Select;

public class Classmethod2
	{
  public static void main(String[] args) throws InterruptedException {
			
			System.setProperty("webdriver.chrome.driver", "C:\\selenium files\\chromedriver.exe");
			WebDriver driver= new ChromeDriver();
			
			driver.get("https://www.facebook.com/");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']")).click();
			Thread.sleep(2000);

			WebElement year = driver.findElement(By.xpath("//select[@id='year']"));
			Select s=new Select(year);
//getOptions
			List<WebElement> yearlist = s.getOptions();	
			int count = yearlist.size();
			System.out.println(count);
//			System.out.println(yearlist.size());
			for(WebElement yr:yearlist)
			{
				String str=yr.getText();
				System.out.println(str);
//			System.out.println(yr.getText());
			}
	}
	}

	


