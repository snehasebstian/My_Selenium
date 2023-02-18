package automation;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class RegisterWesite {
	public static WebDriver driver;
	public static void main(String args[])
	{
		System.setProperty("webdriver.chrome.driver","D:\\chromedriver.exe");
		driver=new  ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.automationtesting.in/Register.html");

		driver.findElement(By.xpath("//input[@ng-model='FirstName']")).sendKeys("Sneha");
		driver.findElement(By.xpath("//input[@ng-model='LastName']")).sendKeys("Sebastian");
		driver.findElement(By.xpath("//textarea[@ng-model='Adress']")).sendKeys("Muthuplackal house");
		
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys("sneha123@gmail.com");
		driver.findElement(By.xpath("//input[@ng-model='Phone']")).sendKeys("6282882923");
	
		List <WebElement> Radio = driver.findElements(By.xpath("//input[@type='radio']"));
		int size = Radio.size();

		System.out.println(size);

		for(int i = 0; i<size; i++) 
		{
			String text=Radio.get(i).getAttribute("value");
			if(text.equalsIgnoreCase("FeMale"))
			{
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
				Radio.get(i).click();
			}
		}
		driver.findElement(By.id("checkbox2")).click();
		
		WebElement element=driver.findElement(By.id("Skills"));
		Select dropdown=new Select(element);
		dropdown.selectByIndex(2);
		System.out.println(driver.findElement(By.id("Skills")).getAttribute("value"));
		
	/*	WebElement country=driver.findElement(By.xpath("//select[@id='countries']"));
	
	*/	
		WebElement  yearbox=driver.findElement(By.id("yearbox"));
		Select dropanddown=new Select(yearbox);
		dropanddown.selectByValue("1999");
	
		
		WebElement month=driver.findElement(By.xpath("//select[@placeholder='Month']"));
		Select dropdown1=new Select(month);
		dropdown1.selectByVisibleText("September");
			
		WebElement day=driver.findElement(By.xpath("//select[@placeholder='Day']"));
		Select daydropdown=new Select(day);
		daydropdown.selectByValue("28");
		
		driver.findElement(By.xpath("//input[@ng-model='Password']")).sendKeys("sneha123");		
		driver.findElement(By.xpath("//input[@ng-model='CPassword']")).sendKeys("sneha123");	
		driver.findElement(By.id("submitbtn")).click();
	}

}
