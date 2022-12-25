package datadriven;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test3 {
public static void main(String[] args) throws EncryptedDocumentException, IOException {
	
	FileInputStream fil=new FileInputStream("./book1.xlsx");
	Workbook wb = WorkbookFactory.create(fil);
	
	String url=wb.getSheet("Sheet1").getRow(1).getCell(0).getStringCellValue();
	String user=wb.getSheet("Sheet1").getRow(1).getCell(1).getStringCellValue();
	String psw=wb.getSheet("Sheet1").getRow(1).getCell(2).getStringCellValue();
	
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get(url);
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

	driver.findElement(By.id("username")).sendKeys(user);
	driver.findElement(By.name("pwd")).sendKeys(psw);
	driver.findElement(By.xpath(" //div[text()='Login ']")).click();

}
}
