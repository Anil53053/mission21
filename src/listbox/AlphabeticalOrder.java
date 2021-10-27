package listbox;
	import java.util.List;
	import java.util.TreeSet;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.support.ui.Select;
	
public class AlphabeticalOrder 
	{
	
		public static void main(String[] args) throws InterruptedException {
			
			System.setProperty("webdriver.chrome.driver", "C:\\selenium files\\chromedriver.exe");
			WebDriver driver= new ChromeDriver();
			
			driver.get("https://en-gb.facebook.com/ \r\n");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']")).click();
			Thread.sleep(2000);

			WebElement month = driver.findElement(By.xpath("//select[@id='month']"));
			Select s=new Select(month);
			List<WebElement> monthlist = s.getOptions();
			
			TreeSet tr=new TreeSet();
			for(WebElement ml:monthlist)
			{
				tr.add(ml.getText());
			}
			
			for(Object str:tr)
			{
				System.out.println(str);
			}
		
		}
	}


