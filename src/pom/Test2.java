package pom;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Test2 {

	@FindBy(name="q")
	private WebElement serachtb;


	public Test2(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}


	public void serachtextbox(String name) {
		serachtb.sendKeys(name);
	}


}