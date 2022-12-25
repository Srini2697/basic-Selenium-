package dropdown;


	import java.time.Duration;

import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.support.ui.Select;

	public class Test3 {
	public static void main(String[] args) throws InterruptedException {

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demoapp.skillrary.com/");
		
		WebElement a = driver.findElement(By.id("cars"));
		
		Select b=new Select(a);
		b.selectByIndex(3);
		b.selectByValue("99");
		//b.selectByVisibleText("INR 100 - INR 199 ( 16 ) "); // not support
		
		Thread.sleep(3000);
		b.deselectByIndex(3);
		Thread.sleep(3000);
		b.deselectByValue("99");
		//Thread.sleep(3000);
		//b.deselectByVisibleText("INR 100 - INR 199 ( 16 ) ");
		
		
		
		driver.close();
}
	}
