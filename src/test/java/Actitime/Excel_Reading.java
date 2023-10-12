package Actitime;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Excel_Reading {

	public static void main(String[] args) throws Throwable {
		FileInputStream fis = new FileInputStream(".\\src\\test\\java\\Actitime\\Test_Data.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		String CUSTNAME = wb.getSheet("CreateCustomer").getRow(1).getCell(1).getStringCellValue();
		System.out.println(CUSTNAME);
		

	}

}

/*
 * <dependency>
 * 
 * <groupId>org.apache.logging.log4j</groupId>
 * 
 * <artifactId>log4j-to-slf4j</artifactId>
 * 
 * <version>2.8.2</version>
 * 
 * </dependency>
 */