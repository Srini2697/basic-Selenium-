package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Fblogin {
	//declaration
	@FindBy(id="email")
	private WebElement usernametb;

	@FindBy(name="pass")
	private WebElement passwordtb;

	@FindBy(id="loginbutton")
	private WebElement loginbutton;


	//initalization
	public Fblogin(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}


	//utilization
	public void usernametextbox(String user) {
		usernametb.sendKeys(user);
	}

	public void passwordtextbox(String pwd) {
		passwordtb.sendKeys(pwd);
	}

	public void loginbtn() {
		loginbutton.click();
	}

}