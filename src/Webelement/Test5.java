package Webelement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test5 {

	public static void main(String[] args) throws InterruptedException {

	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demoapp.skillrary.com/login.php?type=log");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
	driver.findElement(By.linkText("LOGIN")).click();
	
WebElement ele = driver.findElement(By.name("email"));
if(ele.isDisplayed())
{
	System.out.println("elemnt is displayed");
	ele.sendKeys("admin");
}
else
	{
		System.out.println("elemnt is not displayed");
	}
	
	driver.close();	
	}
}