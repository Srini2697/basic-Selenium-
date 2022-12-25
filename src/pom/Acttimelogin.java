package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Acttimelogin {

	@FindBy(id="username")
	private WebElement usernametab;
	
	@FindBy(name="pwd")
	private WebElement pswtab;
	
	@FindBy(xpath="//div[text()='Login ']")
	private WebElement loginbutton;
	
	public Acttimelogin(WebDriver driver1) {
		PageFactory.initElements(driver1,this);
	}
	
	public void usernametextbox(String user) {
		usernametab.sendKeys(user);
	}
		
		public void pswtextbox(String psw) {
			pswtab.sendKeys(psw);
	}
		public void loginbutton() {
			loginbutton.click();
	}
	}
	
