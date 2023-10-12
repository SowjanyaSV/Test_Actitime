package Projects;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SelectFromDropDown {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = WebDriverManager.edgedriver().create();
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		driver.get("https://www.calculator.net/interest-calculator.html");
	//driver.findElement(By.xpath("//option[@value=\"biweekly\"]")).click();
		//driver.findElement(By.xpath("//select[@id='ccompound']")).sendKeys("Biweekly");
		//Select DD = new Select(driver.findElement(By.xpath("//select[@id='ccompound']")));
		//DD.selectByIndex(3);
		WebElement DS = driver.findElement(By.xpath("//select[@id='ccompound']/option[@value=\"semiannually\"]"));
		//Actions actions = new Actions(driver);
		
		//actions.moveToElement(DS).perform();
		List<WebElement> DR = driver.findElements(By.xpath("\"//select[@id='ccompound']/option[@value=\\\"semiannually\\\"]\""));
	 
		
		Thread.sleep(3000);
	

	}

}
