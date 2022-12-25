package loginscenarious;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test5 {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.findElement(By.id("nav-link-accountList-nav-line-1")).click();
		driver.findElement(By.name("email")).sendKeys("7026785305");
		driver.findElement(By.id("continue")).click();
		driver.findElement(By.name("password")).sendKeys("Shan$0169");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		
		String title=driver.getTitle();
		System.out.println(title);
		if (title.equals("Amazon Sign In")){
			System.out.println("pass home page is displayed");
		}
		else
		{
			System.out.println("fail home page is not displayed");
		}
		String url=driver.getCurrentUrl();
		System.out.println(url);
		driver.close();
}
}
