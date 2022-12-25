package dropdown;


	import java.time.Duration;

import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.support.ui.Select;

	public class Test4 {
	public static void main(String[] args) throws InterruptedException {

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demoapp.skillrary.com/");
		
		WebElement a = driver.findElement(By.id("cars"));
		
		Select b=new Select(a);
		b.selectByIndex(0);
		b.selectByValue("99");	
		b.selectByIndex(2);
		b.selectByVisibleText("INR 200 - INR 299 ( 3 ) ");
		
		System.out.println(b.isMultiple());
		Thread.sleep(3000);
		
		
		if(b.isMultiple()) {
			b.deselectAll();
		}
		driver.close();
}
	}
