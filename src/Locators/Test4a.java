package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test4a {
public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://demoapp.skillrary.com/");
		driver.findElement(By.linkText("LOGIN")).click();
		driver.findElement(By.cssSelector("input[id=\"email\"]")).sendKeys("7026785305");
		driver.findElement(By.cssSelector("input[id=\"password\"]")).sendKeys("Shan$0169");
		driver.findElement(By.cssSelector("button[class=\"login_Btn\"]")).click();
}
}
