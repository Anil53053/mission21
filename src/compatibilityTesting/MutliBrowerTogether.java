package compatibilityTesting;
	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.By.ByXPath;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.edge.EdgeDriver;
	import org.openqa.selenium.firefox.FirefoxDriver;

	public class MutliBrowerTogether 
	{
		static WebDriver driver =null;
		
	public static void main(String[] args) {	
	//1. Chrome		
			System.setProperty("webdriver.chrome.driver", "C:\\selenium files\\chromedriver.exe");
			driver= new ChromeDriver();
			Facebooklogin();
			
	//2. Firefox
			System.setProperty("webdriver.gecko.driver", "C:\\selenium files\\geckodriver.exe");
			driver = new FirefoxDriver();
			Facebooklogin();
			
	//3. Microsoft edge
			System.setProperty("webdriver.edge.driver", "C:\\selenium files\\msedgedriver.exe");
			driver = new EdgeDriver();
			Facebooklogin();
		}
		public static void Facebooklogin() {
			driver.get("https://www.facebook.com/");
			driver.findElement(By.xpath("//input[@id='email']")).sendKeys("abc@gmail.com");
			driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("123456abc");
			driver.findElement(By.xpath("//button[@name='login']")).click();	
		}
	}


