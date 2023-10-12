package Projects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LinksOfGoogle {
	public static void main(String[] args) {
		WebDriver driver = WebDriverManager.edgedriver().create();
		driver.manage().window().maximize();
		driver.get("https://www.google.co.in/");
		List<WebElement> links = driver.findElements(By.tagName("a"));
		for(WebElement link:links)
			System.out.println(link.getText()+ "-"+ link.getAttribute("href"));
		//for(int i=0; i<links.size(); i++)
		//{
			//System.out.println(i+ "-->" links.get(i).getText());
		}
		
		
		
	}
	


