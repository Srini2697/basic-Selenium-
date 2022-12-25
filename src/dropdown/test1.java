package dropdown;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class test1 {
public static void main(String[] args) throws InterruptedException {

	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.get("https://www.amazon.in/");
	
	WebElement a = driver.findElement(By.id("searchDropdownBox"));
	
	Select b=new Select(a);
	Thread.sleep(3000);
	b.selectByIndex(3);
	Thread.sleep(3000);
	b.selectByValue("search-alias=beauty");
	Thread.sleep(3000);
	b.selectByVisibleText("Computers & Accessories");
	
	driver.close();
	
}
}
