package dropdown;



import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class Test2 {
public static void main(String[] args) {

	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.get("https://www.amazon.in/");
	
	WebElement a = driver.findElement(By.id("searchDropdownBox"));
	
	Select b=new Select(a);
	b.selectByIndex(3);
	b.selectByValue("search-alias=beauty");
	b.selectByVisibleText("Computers & Accessories");
	
	List<WebElement> all = b.getOptions();
	System.out.println(all.size());
	
	for(WebElement  c:all) {
		System.out.println(c.getText());
	}
	driver.close();
	
}
}

