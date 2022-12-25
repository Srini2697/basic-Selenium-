package scrollbar;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test1 {
public static void main(String[] args) throws InterruptedException {
	
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.amazon.in/");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
	JavascriptExecutor jc=(JavascriptExecutor) driver;
	jc.executeScript("window.scrollBy(0,6000)");
	
	Thread.sleep(3000);
	
	jc.executeScript("window.scrollBy(0,-6000)");
	
}
}
