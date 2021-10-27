package pom_pageFactory;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KiteHomePage 
{
	
   @FindBy(xpath="//div[@class='avatar']/span")private WebElement initialName;

   public KiteHomePage(WebDriver driver)
   {
	PageFactory.initElements(driver, this);
   }
   public void verifyinitial()
   {
	   String exp = "PM";
	 String act = initialName.getText();
	 
	 if(exp.equals(act))
		{
			System.out.println("Test case pass");
		}
		else
		{
			System.out.println("Test case fail");
		}
	}
}
   
   




