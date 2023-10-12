package Projects;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Proj_1 {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = WebDriverManager.edgedriver().create();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/automation-practice-form");
		WebElement firstname = driver.findElement(By.id("firstName"));
		firstname.sendKeys("Divya");
		WebElement lastname = driver.findElement(By.id("lastName"));
		lastname.sendKeys("R");
		
		WebElement email = driver.findElement(By.id("userEmail"));
		email.sendKeys("abc@gmail.com");
		WebElement MobileNumber = driver.findElement(By.id("userNumber"));
		MobileNumber.sendKeys("9999999999");
		
		
		//JavascriptExecutor js = (JavascriptExecutor)driver;
		//js.executeScript("driver.findElement(By.xpath('//input[@id='gender-radio-2']).click();");
		
		
		WebElement gender = driver.findElement(By.xpath("//input[@id='gender-radio-2']"));
		gender.click();
		
		
		
		Thread.sleep(5000);
	}
}
