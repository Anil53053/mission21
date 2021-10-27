package pom_pageFactory_DDF;




import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
public class Kite_LoginPage 
{

//Declaration		eg. int a;
	@FindBy(xpath="//input[@id='userid']") private WebElement UN;	
	@FindBy(xpath="//input[@id='password']") private WebElement pwd;
	@FindBy(xpath="//button[@type='submit']") private WebElement loginBtn;
	@FindBy(xpath="") WebElement logo;
	@FindBy(xpath="") WebElement SignUp;

	//Initialization	eg a=10;
	public Kite_LoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	//Usage
	public void username(String LoginName)
	{
		UN.sendKeys(LoginName);
	}
	public void password(String passwords)
	{
		pwd.sendKeys(passwords);
	}
	
	public void loginButton()
	{
		loginBtn.click();
	}
}

