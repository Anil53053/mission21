package listbox;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultiSelect 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","C:\\selenium files\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https:chercher.tech/practice/practice-dropdowns-selenium-webdriver");
		Thread.sleep(2000);
		WebElement sample = driver.findElement(By.xpath("//select[@id='second']"));
		Select s=new Select(sample);
		boolean output = s.isMultiple();
		if(output=true)
		{
			System.out.println("multiple selected values");
		}
		else {
			System.out.println("it is not multiple selected values");
		}
//selection
		Thread.sleep(2000);
		s.selectByIndex(0);
		Thread.sleep(2000);
		s.selectByValue("burger");
		Thread.sleep(2000);
		s.selectByVisibleText("Bonda");
		
//De-Selection
		//Thread.sleep(2000);
		//s.deselectByIndex(0);
		//Thread.sleep(2000);
		//s.deselectByValue("pizza");
		//Thread.sleep(2000);
		//s.deselectByVisibleText("Bonda");
		
//getAllSelectionOption
		List<WebElement> SelectedOptions = s.getAllSelectedOptions();
		for(WebElement Options : SelectedOptions)   //for(datatype temp: datasource){
			{
			System.out.println(Options.getText());
			}
//get text from webpage
		driver.findElement(By.xpath("(//select[@class='col-lg-3'])[2]")).getText();
		Thread.sleep(5000);
		driver.close();
		


		
	}

}
