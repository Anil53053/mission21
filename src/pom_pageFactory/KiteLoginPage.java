package pom_pageFactory;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KiteLoginPage 
{
//DEclaration........eg int a
	
@FindBy(xpath="//input[@id='userid']")private WebElement UN;
@FindBy(xpath="//input[@id='password']") private WebElement pwd;
@FindBy(xpath="//button[@type='submit']") private WebElement loginbutton;
@FindBy(xpath="")WebElement logo;

//initialization........eg a=10

public KiteLoginPage(WebDriver driver)
{
	PageFactory.initElements(driver, this);
}
//Usages...

public void username()
{
	UN.sendKeys("DP6852");
}
public void password()
{
	pwd.sendKeys("Pramod@2105");
}
public void login()
{
	loginbutton.click();

}
}
