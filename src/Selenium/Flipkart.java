package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Flipkart {

	public static void main(String[] args) {
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("http://www.flipkart.com");
		driver.manage().window().maximize();
		
		try {
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		}
		catch(Exception e) {
			System.out.println(" ");
			
		}

	}

}
