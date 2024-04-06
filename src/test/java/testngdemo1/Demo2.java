package testngdemo1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Demo2 {

	WebDriver driver;
	@BeforeTest
	public void setup() throws InterruptedException
	{
		WebDriverManager.chromedriver().setup();
		
		    driver = new ChromeDriver();
			
			
			driver.manage().window().maximize(); 
			
			driver.get("https://rahulshettyacademy.com/AutomationPractice/");
			Thread.sleep(4000);
	}
	@Test (priority =0)
	public void checkbox() throws InterruptedException
	{
      driver.findElement(By.id("checkBoxOption1")).click();	
      Thread.sleep(4000);
		
	}
	@Test (priority =1)
	public void multiplecheckbox () throws InterruptedException
	{
		List<WebElement> checkboxes = driver.findElements(By.xpath("//input[@type='checkbox']"));
		
			for (WebElement check: checkboxes)
			{
				check.click();
			}
			
		      Thread.sleep(4000);

			 
	}
	@Test(priority =2)
		public void radiobutton() throws InterruptedException
	{
		driver.findElement(By.xpath("//input[@value='radio1']")).click();
	      Thread.sleep(4000);

	}
	@Test(priority =3)
		public void multipleradiobutton() throws InterruptedException
		{
        List<WebElement> radios = driver.findElements(By.name("radioButton"));
		
		for (WebElement check: radios)
		{
			check.click();
		}
	      Thread.sleep(4000);

		}
	@Test (priority =4)
		public void textbox() throws InterruptedException
		{
			driver.findElement(By.id("autocomplete")).sendKeys("India");
		      Thread.sleep(4000);

		}
	@Test (priority =5)
		public void dropdown() throws InterruptedException
		{
	   WebElement dropdown = driver.findElement(By.id("dropdown-class-example"));
		Select s = new Select(dropdown);
		s.selectByVisibleText("Option2");
	      Thread.sleep(4000);

		}
	@AfterTest
		public void teardown ()
		{
			driver.close();
		}
}

