package PopUps;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AlertPopUp 
{

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = WebDriverManager.edgedriver().create();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		
		driver.findElement(By.xpath("//button[text()='Click for JS Alert']")).click();
		Alert al = driver.switchTo().alert();
		Thread.sleep(3000);
		//String text = al.getText();
		//System.out.println(text);
		//al.accept();
		//Thread.sleep(3000);
		
		//al.accept();
		//System.out.println("Accepted");
		
		al.dismiss();
		System.out.println("Dismissed");

	}

}
