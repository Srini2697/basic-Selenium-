package Webelement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test6 {
	public static void main(String[] args) throws InterruptedException {

	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demoapp.skillrary.com/login.php?type=login");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
	WebElement ele = driver.findElement(By.id("paid"));
	if (ele.isSelected())
	{
		System.out.println("pass");
	}
	else
	{
		System.out.println("fail");
	}
	driver.close();
	}
}