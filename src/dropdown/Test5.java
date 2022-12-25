package dropdown;


	import java.time.Duration;
	import java.util.List;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.support.ui.Select;


	public class Test5 {
	public static void main(String[] args) {

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
	
		
		List<WebElement> all = b.getAllSelectedOptions();
		System.out.println(all.size());
		
		for(WebElement  c:all) {
			System.out.println(c.getText());
		}
		driver.close();
		
	}
	}
