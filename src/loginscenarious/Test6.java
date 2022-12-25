package loginscenarious;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test6 {
	public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.zomato.com/");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	
	driver.findElement(By.linkText("Log in")).click();
	driver.findElement(By.xpath("//input[@class=\"sc-60vv3c-0 eOYJSt sc-fznyAO CWQMf\"]")).sendKeys("7026785305");
}
}
