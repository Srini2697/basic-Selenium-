package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test5 {
public static void main(String[] args) throws InterruptedException {
	
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demo.actitime.com/login.do");
	
	driver.findElement(By.xpath("//input[@name='username']")).sendKeys("abcdefg");
	Thread.sleep(3000);
	driver.findElement(By.xpath("//input[@name='pwd']")).sendKeys("3e73934h");
	Thread.sleep(3000);
	driver.findElement(By.xpath("//div[text()='Login ']")).click();
}
}
