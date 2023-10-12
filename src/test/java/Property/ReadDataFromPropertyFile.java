package Property;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class ReadDataFromPropertyFile 
{

	public static void main(String[] args) throws Exception 
	{
		//Step-1: Take the path of property file path
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
		
		System.out.println(BROWSER);
		System.out.println(URL);
		System.out.println(USERNAME);
		System.out.println(PASSWORD);
		
		
	}

}
