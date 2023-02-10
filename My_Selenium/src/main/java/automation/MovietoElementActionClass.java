package automation;


	import org.openqa.selenium.By;
	import org.openqa.selenium.Keys;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.interactions.Action;
	import org.openqa.selenium.interactions.Actions;

	public class MovietoElementActionClass {
		public static WebDriver driver;
		public static void main(String args[])
		{
			System.setProperty("webdriver.chrome.driver","D:\\chromedriver.exe");
			driver =new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.amazon.in/");
			String title=driver.getTitle(); 
			Actions builder= new Actions(driver);
			driver.findElement(By.id("nav-link-accountList-nav-line-1")).click();
			WebElement t=driver.findElement(By.id("ap_email"));
			Action series=builder.moveToElement(t).click().keyDown(t, Keys.SHIFT).sendKeys(t, "hi").keyUp(t, Keys.SHIFT).build();
			series.perform();
		}
	}



