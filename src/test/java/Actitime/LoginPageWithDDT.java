package Actitime;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginPageWithDDT {

	public static void main(String[] args) throws Throwable {
		
		//Read the common data from property file
		
FileInputStream fis = new FileInputStream(".\\src\\test\\java\\Actitime\\CommonData.properties");
		
		//Create object for property file
		Properties p = new Properties();
		
		//load the file into object of properties
		p.load(fis);
		
		//Get the value of property file based on the key
		String BROWSER = p.getProperty("browser");
		String URL = p.getProperty("url");
		String USERNAME = p.getProperty("username");
		String PASSWORD = p.getProperty("password");
		WebDriver driver = null;
		if(BROWSER.equalsIgnoreCase("Edge"))
		{
			 driver = WebDriverManager.edgedriver().create();
			System.out.println("Launched");
		}
		else if (BROWSER.equalsIgnoreCase("Chrome"))
		{
			 driver = WebDriverManager.chromedriver().create();
			System.out.println("Chrome launched");
		}
		else
		{
			System.out.println("Not Launched");
		}
	
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get(URL);
		driver.findElement(By.id("username")).sendKeys(USERNAME);
		driver.findElement(By.name("pwd")).sendKeys(PASSWORD);
		driver.findElement(By.xpath("//div[text()=\"Login \"]")).click();
		driver.findElement(By.id("logoutLink"));
		System.out.println("Logged out successfully");
		driver.quit();

	}

}
