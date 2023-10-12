package PopUps;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class File_Upload {

	public static void main(String[] args) throws Throwable {
		WebDriver driver = WebDriverManager.edgedriver().create();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.w3schools.com/howto/howto_html_file_upload_button.asp");
		driver.findElement(By.id("myFile")).sendKeys("C:\\Users\\sowjanya.v\\Desktop\\Test_Data.xlsx");
		Thread.sleep(5000);

	}

}
