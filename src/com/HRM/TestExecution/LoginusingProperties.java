package com.HRM.TestExecution;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class LoginusingProperties {
	
	FirefoxDriver driver;
	@BeforeTest
	public void setUp()
	{
		driver=new FirefoxDriver();
		driver.get("http://opensource.demo.orangehrmlive.com/");
	}
	@Test
	public void loginTest() throws IOException
	{
		//Excel File 
		
        String xlpath="E:\\Selenium10AMto1pm\\HRM\\TestData\\LoginKeywords.xlsx";
		
		FileInputStream f=new FileInputStream(xlpath);
		XSSFWorkbook wb=new XSSFWorkbook(f);
		XSSFSheet ws=wb.getSheet("Sheet1");
		
		
		//Properties file
		FileInputStream fis=new FileInputStream
				("E:\\Selenium10AMto1pm\\Workspace10am\\Prop.properties");
		Properties pr=new Properties();
		pr.load(fis);
		
		driver.findElement(By.id(pr.getProperty("user"))).sendKeys
							(ws.getRow(3).getCell(4).getStringCellValue());
		
		driver.findElement(By.id(pr.getProperty("psd"))).sendKeys
							(ws.getRow(4).getCell(4).getStringCellValue());
		
		driver.findElement(By.id(pr.getProperty("logbtn"))).click();
		
		
	}

}

