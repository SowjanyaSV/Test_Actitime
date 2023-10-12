package Actitime;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NotificationPopUp {

	public static void main(String[] args) {
		
//		ChromeOptions Options = new ChromeOptions();
//		Options.addArguments("Disable notification");
//		
//		WebDriverManager.chromedriver().setup();
//		//ChromeDriver driver = new ChromeDriver(Options);
		
		
		EdgeOptions options = new EdgeOptions();
		//options.setCapability("disable-infobars", true);
		options.setCapability("disable-notification", true);
		WebDriverManager.edgedriver().setup();
		EdgeDriver driver = new EdgeDriver(options);
		
		
		
		
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("https://www.quikr.com/");
		driver.close();

	}

}
