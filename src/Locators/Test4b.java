package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test4b {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapp.skillrary.com/login.php");
		Thread.sleep(2000);
		driver.findElement(By.linkText("LOGIN")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input[id='email']")).sendKeys("abcgsd");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input[id='password']")).sendKeys("27381gkbwqd");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("button[id='last']")).click();
		Thread.sleep(2000);
		driver.findElement(By.linkText("LOGIN")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("a[id=\"toPasswordRecoveryPageLink\"]")).click();
		Thread.sleep(2000);
		driver.close();
	}

}
