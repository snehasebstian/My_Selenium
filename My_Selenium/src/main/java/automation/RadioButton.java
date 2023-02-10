package automation;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButton {
	public static WebDriver driver;
	public static void main(String args[])
	{
		System.setProperty("webdriver.chrome.driver","D:\\chromedriver.exe");
		driver=new  ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.automationtesting.in/Register.html");
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
	}
}
