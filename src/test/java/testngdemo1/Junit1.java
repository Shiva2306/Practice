package testngdemo1;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Junit1 {
	
	WebDriver driver;
	
	@Before
	public void setup() throws InterruptedException
	{
		WebDriverManager.chromedriver().setup();
		
		 driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://the-internet.herokuapp.com/login");
		Thread.sleep(4000);

	}
	
	@Test
	public void login() throws InterruptedException
	{
		driver.findElement(By.id("username")).sendKeys("Shiva");
		Thread.sleep(4000);
		driver.findElement(By.id("password")).sendKeys("123");
		Thread.sleep(4000);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(4000);


	}
	@After
	public void teardown()
	{
		driver.close();
	}
	

}
