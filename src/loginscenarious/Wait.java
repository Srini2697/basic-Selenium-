package loginscenarious;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Wait {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.instagram.com/");

		WebDriverWait w=new WebDriverWait(driver,Duration.ofSeconds(5));
		WebElement user=driver.findElement(By.name("username"));
		w.until(ExpectedConditions.visibilityOf(user)).sendKeys("7026785305");
		
		WebElement user1=driver.findElement(By.name("password"));
		w.until(ExpectedConditions.visibilityOf(user1)).sendKeys("Shan$0169");
		
		
		WebElement user3=driver.findElement(By.xpath("//div[text()='Log In']"));
		w.until(ExpectedConditions.elementToBeClickable(user3)).click();
		
		String title=driver.getTitle();
		w.until(ExpectedConditions.titleContains("Instagram"));
		System.out.println(title);
		if (title.equals("Instagram")){
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
