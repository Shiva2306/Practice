package testngdemo1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class Reportsdemo {
	
	ExtentTest test;
	ExtentReports er;
	WebDriver driver;
	
	@BeforeClass
	public void reportconfig() {
		 er = new ExtentReports(System.getProperty("user.dir")+"/Reportsdemo.html");
		 
		
		 test = er.startTest("Rahulshettytest");
		
	}
	
	
	
	
	@BeforeMethod
	public void setup() {
		
		 driver = new ChromeDriver();
		
		test.log(LogStatus.PASS, "Browser opened successfully");
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		
	test.log(LogStatus.PASS, "URL entered is correct");
		
		
	}
	
	
	@Test
	public void openbrowser() {
		
		// Assert my title
		
		
		String expectedtitle="Practice";
		
		String actuatitle =  driver.getTitle();
		
		SoftAssert sa = new SoftAssert();
		
		sa.assertEquals(actuatitle, expectedtitle);
				
		//Assert.assertEquals(actuatitle, expectedtitle);
				
		driver.findElement(By.name("radioButton")).click();
		
		 test.log(LogStatus.PASS, "clicked on radio button");
		
		sa.assertAll();
		
	}
	
	@Test
	public void checktest() {
		
		
		WebElement check1 = driver.findElement(By.id("checkBoxOption1"));
		
		// assert statement to check whether this checkbox is displayed, is enabled
		
		
		Assert.assertTrue(check1.isDisplayed());
		Assert.assertTrue(check1.isEnabled());
		
		check1.click();
		
		test.log(LogStatus.PASS, "Checkbox1 is clicked successfully");
		
		if(!check1.isSelected()) {
			
			test.log(LogStatus.FAIL, "Checkbox1 is not selected");
		}
		
		
		Assert.assertTrue(check1.isSelected());
		
	
		System.out.println(driver.getCurrentUrl());
	}
	
	
	@Test
	public void checktest2() {
		
		
		WebElement check1 = driver.findElement(By.id("checkBoxOption2"));
		
		// assert statement to check whether this checkbox is displayed, is enabled
		
		
		
		SoftAssert sa = new SoftAssert();
		
		
		sa.assertTrue(check1.isDisplayed());
		sa.assertTrue(check1.isEnabled());
		
		check1.click();
		
		sa.assertTrue(check1.isSelected());
		
		test.log(LogStatus.PASS, "Checkbox1 is clicked successfully");
		
		if(!check1.isSelected()) {
			
			test.log(LogStatus.FAIL, "Checkbox1 is not selected");
		}
		
		System.out.println(driver.getCurrentUrl());
		
		sa.assertAll();
	}
	
	
	
	@AfterMethod
	public void teardown() {
		
		driver.quit();
		test.log(LogStatus.PASS, "closed browsers");
	}
	
	
	@org.testng.annotations.AfterClass
	public void reportflush() {
		
		
		
		er.endTest(test);
		
		er.flush();
		
		
	}
	
	
}


