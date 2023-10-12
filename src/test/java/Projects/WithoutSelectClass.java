package Projects;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WithoutSelectClass {

	public static void main(String[] args) {
		WebDriver driver = WebDriverManager.edgedriver().create();
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.calculator.net/interest-calculator.html");
		//driver.findElement(By.xpath("//option[@value=\"biweekly\"]")).click();
		driver.findElement(By.xpath("//select")).click();
	//	List<WebElement> allOptions = driver.findElements(By.cssSelector("select option"));

	}
	

}
