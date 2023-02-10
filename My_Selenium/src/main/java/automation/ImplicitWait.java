package automation;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplicitWait {
	public static void main(String args[])
	{
		System.setProperty("webdriver.chrome.driver","D:\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/login.php");
		String title=driver.getTitle();
		System.out.println(title);
		//driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	
		driver.findElement(By.id("nav-link-accountList-nav-line-1")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	}
}
