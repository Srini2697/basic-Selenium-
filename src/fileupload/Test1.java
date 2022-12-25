package fileupload;


import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test1 {




	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws InterruptedException, IOException {
			
			WebDriver driver= new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.naukri.com/");
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			
			driver.findElement(By.xpath("//a[@title=\"Jobseeker Register\"]")).click();
			
			driver.findElement(By.xpath("//button[text()='Upload Resume']")).click();
			
			Runtime.getRuntime().exec("\"C:\\Users\\Srinivas M\\Desktop\\Autoit\\justuplode.au4.exe\"");
			
			
	}
}
