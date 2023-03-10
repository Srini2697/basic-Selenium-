package testng;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestCase1 {
	public WebDriver driver;

	@BeforeMethod
	public void openApp() {
    driver=new ChromeDriver();
    driver.manage().window().maximize();
    driver.get("https://demo.actitime.com/login.do");
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

	}

	@Test
	public void tc1() {
	driver.findElement(By.id("username")).sendKeys("admin");
	driver.findElement(By.name("pwd")).sendKeys("manager");
	driver.findElement(By.xpath("//div[text()='Login ']")).click();
	String title = driver.getTitle();

//	
//	//syntax
//	Assert.assertEquals(actual,Expected);

	//Example
	Assert.assertEquals(title,"actiTIME - Login");

	//syntax for softassert
//	SoftAssert s=new SoftAssert();
//	s.assertEquals(actual,Expected);
//	
//	//example
//	SoftAssert s=new SoftAssert();
//	s.assertEquals(title,"35467rfghghj");


	Reporter.log(title,true);
	String url = driver.getCurrentUrl();
	Reporter.log(url,true);
	//s.assertAll();
	}

	@AfterMethod
	public void closeApp() {
		driver.close();
	}

}