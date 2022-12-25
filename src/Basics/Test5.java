package Basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test5 {
public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		driver.navigate().to("https://www.amazon.in/ref=nav_logo");
		
		Thread.sleep(3000);
		driver.manage().window().fullscreen();
		Thread.sleep(3000);
		
		
		driver.navigate().back();
		Thread.sleep(3000);
		driver.navigate().forward();
		Thread.sleep(3000);
		driver.navigate().refresh();
		
		driver.manage().window().minimize();
}
}
