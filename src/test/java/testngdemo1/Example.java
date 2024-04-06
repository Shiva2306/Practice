package testngdemo1;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Example {
	
	WebDriver driver;
	
	@BeforeTest(alwaysRun=true)
	public void setup()
	{
		WebDriverManager.chromedriver().setup();

		 driver = new ChromeDriver();
		
		
		driver.manage().window().maximize(); 
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
	}
	
	@Test(groups = "Smoke", priority=0)
	public void checkbox() throws InterruptedException
	{
         WebElement check = driver.findElement(By.id("checkBoxOption1"));
         check.click();
		
		Thread.sleep(4000);
	}
	@Test(groups = "Regression", priority=1)
	public void multiplecheckbox() throws InterruptedException
	{
		
		List<WebElement> checkboxes = driver.findElements(By.xpath("//input[@type='checkbox']"));
		
	   for (WebElement check: checkboxes)
		{
			check.click();
		}
		Thread.sleep(5000);

		 
	}
	
	@Test(groups="Functional", priority =2)
	public void radiobutton() throws InterruptedException
	{
		WebElement radio = driver.findElement(By.xpath("//input[@value='radio1']"));
		radio.click();
		Thread.sleep(5000);

	}

	@Test(groups="Smoke", priority=3)
	public void threeradiobutton() throws InterruptedException
	{
       List<WebElement> radios = driver.findElements(By.name("radioButton"));
		
		for (WebElement check1: radios)
		{
			check1.click();
		}
		Thread.sleep(5000);

		
	}
	
	@Test(groups="Regression",priority=4)
	public void dropdown() throws InterruptedException
	{
	 
		WebElement dropdown = driver.findElement(By.id("dropdown-class-example"));
		
		Select s = new Select(dropdown);
		
		s.selectByVisibleText("Option2");
		Thread.sleep(5000);
	}
	
	@Test(groups="Functional", priority=5)
	public void textbox() throws InterruptedException
	{
		driver.findElement(By.id("autocomplete")).sendKeys("India");
		Thread.sleep(4000);
	}
	
	
	@AfterTest(alwaysRun=true)
	public void teardown()
	{
		driver.close();
	}
}
