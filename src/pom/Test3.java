package pom;


import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test3 {

	public static void main(String[] args) {


		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/login/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		Fblogin at=new Fblogin(driver);
		at.usernametextbox("7026785305");
		at.passwordtextbox("Shan$0169");
		at.loginbtn();
		

		WebDriver driver1=new ChromeDriver();
		driver1.manage().window().maximize();
		driver1.get("https://demo.actitime.com/login.do");
		driver1.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		Acttimelogin at1=new Acttimelogin(driver1);
		at1.usernametextbox("admin");
		at1.pswtextbox("manager");
		at1.loginbutton();

	}

}