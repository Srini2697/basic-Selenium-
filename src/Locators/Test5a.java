package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test5a {
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapp.skillrary.com/login.php");
		driver.findElement(By.xpath("//a[text()='LOGIN']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("abcdeg");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("123uhksdj");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@id='last']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='LOGIN']")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//a[@id='toPasswordRecoveryPageLink']")).click();
		
	}

}
