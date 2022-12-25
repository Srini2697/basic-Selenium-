package dropdown;

import java.time.Duration;
import java.util.Arrays;
import java.util.List;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment {
public static void main(String[] args) {
	
	WebDriver driver =new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.facebook.com/login/");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	
	driver.findElement(By.xpath("//a[@class=\"_97w5\"]")).click();
	
	
  WebElement month = driver.findElement(By.id("month"));
  Select b=new Select(month);
  
  List<WebElement> all = b.getOptions();
  int count=all.size();
  System.out.println(count);
	
	for(WebElement  c:all) {
	String d=c.getText();
		System.out.println(d);
		String[] list={d};
		Arrays.sort(list);
	}
	driver.close();
	
}
}
