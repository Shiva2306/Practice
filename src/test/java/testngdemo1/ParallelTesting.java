package testngdemo1;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ParallelTesting {
	
	@Test
	public void chrometest() throws InterruptedException
	{
		
		WebDriverManager.chromedriver().setup();
	    WebDriver driver = new ChromeDriver();
	    
	    driver.manage().window().maximize();
		Thread.sleep(5000);
	
		driver.get("https://the-internet.herokuapp.com/login"); 
		Thread.sleep(5000);

		driver.findElement(By.id("username")).sendKeys("Shiva"); 
		Thread.sleep(5000);

		driver.findElement(By.id("password")).sendKeys("123"); 
		Thread.sleep(5000);

		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(5000);

		driver.close();
	}
	
	@Test
	public void firefoxtest() throws InterruptedException
	{
		
		WebDriverManager.firefoxdriver().setup();
	    WebDriver driver = new FirefoxDriver();
	    
	    driver.manage().window().maximize();
		Thread.sleep(5000);
	
		driver.get("https://the-internet.herokuapp.com/login"); 
		Thread.sleep(5000);

		driver.findElement(By.id("username")).sendKeys("Shiva"); 
		Thread.sleep(5000);

		driver.findElement(By.id("password")).sendKeys("123"); 
		Thread.sleep(5000);

		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(5000);

		driver.close();
	}


}
