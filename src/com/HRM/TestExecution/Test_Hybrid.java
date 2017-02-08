package com.HRM.TestExecution;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.server.browserlaunchers.Sleeper;
import org.testng.annotations.Test;

import com.HRM.Master.Reusable_Functions_Hybrid;

public class Test_Hybrid {
	String res;
	
  @Test
  public void f() throws IOException {
	  
	  Reusable_Functions_Hybrid hybrid=new Reusable_Functions_Hybrid();
	  
	//Excel
	  FileInputStream f1 = new FileInputStream("E:\\Selenium10AMto1pm\\Workspace10am\\Selenium10am_proj\\src\\com\\HRM\\TestData\\Datadriventesting.xlsx");
	  @SuppressWarnings("resource")
	  XSSFWorkbook wd = new XSSFWorkbook(f1);
	  XSSFSheet wslog = wd.getSheet("Sheet5");
	  XSSFSheet wslaunch = wd.getSheet("Sheet6");
	  
	//res = hybrid.launchApp(wslaunch.getRow(1).getCell(0).getStringCellValue());
	  
	 // wslaunch.getRow(1).createCell(1).setCellValue(res);
	  
	  Sleeper.sleepTightInSeconds(3);
	  String username=wslog.getRow(1).getCell(0).getStringCellValue();
	  String password=wslog.getRow(1).getCell(1).getStringCellValue();
	
	 res=hybrid.loginApp(username,password);
  
	wslog.getRow(1).createCell(2).setCellValue(res);
	
	String output="E:\\Selenium10AMto1pm\\Workspace10am\\Selenium10am_proj\\src\\com\\HRM\\TestResults\\hybrid_output.xlsx";
	
	FileOutputStream fos=new FileOutputStream(output);
	wd.write(fos);
	fos.close();
	
  
  
  }
}







