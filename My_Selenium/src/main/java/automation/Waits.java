package automation;

import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;  
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

public class Waits {
	public static void main(String args[])
	{
		System.setProperty("webdriver.chrome.driver","D:\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/login.php");
		String title=driver.getTitle();
		System.out.println(title);
		//driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	
		//driver.findElement(By.id("nav-link-accountList-nav-line-1")).click();
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		Wait <WebDriver>wait = new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(30))
				.pollingEvery(Duration.ofMillis(500)).ignoring(NoSuchElementException.class);
	 
		WebElement fb= wait.until(new Function<WebDriver, WebElement>() {
			public WebElement apply (WebDriver driver)
			{
				return driver.findElement(By.xpath("//a[@title='Sign up for Facebook']"));
			}
		});
		fb.click();
	}
}
