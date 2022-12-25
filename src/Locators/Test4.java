package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test4 {
public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://www.facebook.com/login/");
		driver.findElement(By.cssSelector("input[name=\"email\"]")).sendKeys("7026785305");
		driver.findElement(By.cssSelector("input[name=\"pass\"]")).sendKeys("Shan$0169");
		driver.findElement(By.id("loginbutton")).click();
}
}