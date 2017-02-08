package pom_DataDriven;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;
import org.openqa.selenium.server.browserlaunchers.Sleeper;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class POMControl_Test {
	
	
	FirefoxDriver driver;
	
	@Test
	public void pomTest() throws IOException
	{
		//System.setProperty("webdriver.chrome.driver","D:\\Library\\chromedriver.exe");
		driver=new FirefoxDriver();
		driver.get("http://newtours.demoaut.com");
		
		FileInputStream f=new FileInputStream("D:\\Workspace630pm\\Selenium_FW\\src\\Datadriventesting.xlsx");
	    @SuppressWarnings("resource")
		
	    XSSFWorkbook wb=new XSSFWorkbook(f);
	    XSSFSheet ws=wb.getSheet("Sheet3");
	  
	    
	    Iterator<Row> row=ws.iterator();
	   row.next();
	    
	   
	   
	 
	   WelcomeMercuryTours wm=PageFactory.initElements(driver,WelcomeMercuryTours.class);
	    RegisterMercuryTours1_Register rm1=PageFactory.initElements(driver,RegisterMercuryTours1_Register.class);
	    RegisterMercuryTours_Validation rm2=PageFactory.initElements(driver,RegisterMercuryTours_Validation.class);
	    
	   wm.registerTest();
	   
	   
	   
	   while(row.hasNext())
	    {
	    	Row r=row.next();
	    	
	    	rm1.contactRegistration(r);
	    	
	    	Sleeper.sleepTightInSeconds(1);
	    	
	    	boolean b=rm2.validateRegistration(r.getCell(9).getStringCellValue());
	    	
	    	//Cell c=r.createCell(12);
	    	
	    	if(b==true)
	       {
	    	   
	    		r.createCell(12).setCellValue("Passed");
	       }
	       else
	       {
	    	   r.createCell(12).setCellValue("Failed");
	       }
	    	driver.navigate().back();
	    }
	    
	   
	   FileOutputStream f1=new FileOutputStream("E:\\Selenium10AMto1pm\\Workspace10am\\Selenium10am_proj\\src\\com\\HRM\\TestResults\\POmoutput123.xlsx");
	   
	   wb.write(f1);
	    f1.close();
	    
	}

}






