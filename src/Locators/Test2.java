package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test2 {
	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://demoapp.skillrary.com/login.php?type=login");
	driver.findElement(By.linkText("forgotPasswordRecover")).click();		
	
}
}