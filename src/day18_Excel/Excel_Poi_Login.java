package day18_Excel;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Excel_Poi_Login {
  @Test
  public void f() throws IOException {
 String path="E:\\Selenium10AMto1pm\\Selenium10am_proj\\testdata12.xlsx";
	  
	  FileInputStream fis=new FileInputStream(path);
	 
	XSSFWorkbook wb=new XSSFWorkbook(fis);
	  XSSFSheet ws=wb.getSheetAt(0);
	  
	  
	  WebDriver driver=new FirefoxDriver();
		driver.navigate().to(ws.getRow(1).getCell(2).getStringCellValue());
		driver.manage().window().maximize();
		
		
      driver.findElement(By.id("txtUsername")).
                       sendKeys(ws.getRow(1).getCell(0).getStringCellValue());
		
		driver.findElement(By.id("txtPassword")).
		                sendKeys(ws.getRow(1).getCell(1).getStringCellValue());
		
		driver.findElement(By.id("btnLogin")).click();
	  
	  
  }
}



