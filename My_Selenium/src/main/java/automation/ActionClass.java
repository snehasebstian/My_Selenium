package automation;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class ActionClass {
	public static WebDriver driver;
	public static void main(String args[])
	{
		System.setProperty("webdriver.chrome.driver","D:\\chromedriver.exe");
		driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		String title=driver.getTitle(); 
		Actions builder = new Actions(driver);
		WebElement w=driver.findElement(By.id("nav-link-accountList-nav-line-1"));
		Action text =builder.moveToElement(w).build();
		text.perform();
	}		

}
