package loginscenarious;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test2 {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.facebook.com/");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
	driver.findElement(By.id("email")).sendKeys("7026785305");
	driver.findElement(By.name("pass")).sendKeys("Shan$0169");
	driver.findElement(By.name("login")).click();
	
	String title=driver.getTitle();
	System.out.println(title);
	if (title.equals("Facebook – log in or sign up")){
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
