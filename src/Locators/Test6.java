package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test6 {
public static void main(String args[]) {
	
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.selenium.dev/downloads/");
	driver.findElement(By.xpath("//p[text()='Ruby']/../p[2]")).click();

}
}