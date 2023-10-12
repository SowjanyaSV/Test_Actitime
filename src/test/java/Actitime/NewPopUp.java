package Actitime;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NewPopUp {

	public static void main(String[] args) {
		WebDriver driver = WebDriverManager.edgedriver().create();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("http://the-internet.herokuapp.com/download");
		
		driver.findElement(By.xpath("//a[text()='SampleFile.docx']")).click();
		System.out.println("Downloaded");
		
	}

}
