package abc;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;



public class Google {
	WebDriver driver;
	
	@Test
	@Parameters({"browser"})
	public void search(String str)
	{
		if(str.matches("firefox"))
		{
			driver=new FirefoxDriver();
			
		}
		if(str.matches("chrome"))
		{
			driver=new ChromeDriver();
			
		}
		driver.manage().window().maximize();		
		driver.get("http://www.google.com");	
		driver.findElement(By.name("q")).sendKeys("java");
		driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
	}

}
