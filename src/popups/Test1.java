package popups;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test1 {
// alert popup
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.tnpsc.gov.in");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.findElement(By.xpath("(//a[text()='Apply Online'])[4]")).click();
		
		Alert a = driver.switchTo().alert();
		
		System.out.println(a.getText());
	     a.accept();
		//a.dismiss();
		driver.close();
	}

}
