package Property;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class WriteDataIntoPropertyFile {

	public static void main(String[] args) throws Throwable {
	
		
		//Step1: Create object of property file
		
		Properties p = new Properties();
		
		//Provide key and value details
		
		p.setProperty("browser", "Edge");
		p.setProperty("username", "trainee");
		
		//Path for property file
		FileOutputStream fos = new FileOutputStream(".\\src\\test\\java\\Actitime\\WriteData.properties");
		
		//Load the property file
		p.store(fos, "Common data file");
		
		

	}

}
