package testng;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestCase3 {


public WebDriver driver;

@BeforeMethod
public void openApp() {
driver=new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://demo.actitime.com/login.do");
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
}

@Test
public void tc3() {
driver.findElement(By.xpath("//a[text()='actiTIME Inc.']")).click();
Reporter.log(driver.getTitle(),true);
Reporter.log(driver.getCurrentUrl(),true);

}

@AfterMethod
public void closeAPP() {
	driver.close();
}

}