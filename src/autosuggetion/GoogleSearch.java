package autosuggetion;


	import java.util.List;

	import org.apache.poi.hssf.record.PageBreakRecord.Break;
	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	public class GoogleSearch 
	{
	public static void main(String[] args) throws InterruptedException 
		{
	    	System.setProperty("webdriver.chrome.driver","C:\\Selenium files\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.get("https://www.google.com/");
			driver.findElement(By.xpath("//input[@class='gLFyf gsfi']")).sendKeys("samsung");
			Thread.sleep(2000);
			List<WebElement> models = driver.findElements(By.xpath("//li[@class='sbct']"));
			System.out.println(models.size()+" options are there");
			
			String s="samsung m31";
			for(int i=0;i<models.size();i++)
			{
		String temp=models.get(i).getText();
				Thread.sleep(1000);
				System.out.println(temp);
				if(temp.equals(s))
				{
		  models.get(i).click();
			      driver.close();
			      break;
				}
			}
	}

	}

	
		




