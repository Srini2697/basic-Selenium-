package popups;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

class Test5 {

	public static void main(String[] args) throws InterruptedException {
			
			WebDriver driver= new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.nnnow.com/men-formal-shirts");
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			
			
			String parent=driver.getWindowHandle();
			
			driver.findElement(By.xpath("(//h3[@class=\"nw-productview-brandtxt\"])[1]")).click();
			

			Set<String> child=driver.getWindowHandles();
			for(String b:child) {
				driver.switchTo().window(b);
			}
			driver.findElement(By.xpath("(//button[@itemprop=\"offers\"])[2]")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//button[@type=\"button\"])[24]")).click();
			Thread.sleep(3000);
			driver.quit();
	}

}
