package com.HRM.TestExecution;

import java.io.FileInputStream;
//import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

import com.HRM.Master.Actionkw;



public class LoginusingKeywords  {
	
	@Test
	public  void loginTest() throws IOException
	{
		Actionkw keys=new Actionkw();
		
		String xlpath="E:\\Selenium10AMto1pm\\Workspace10am\\Selenium10am_proj\\src\\com\\HRM\\TestData\\LoginKeywords.xlsx";
		
		FileInputStream f=new FileInputStream(xlpath);
		XSSFWorkbook wb=new XSSFWorkbook(f);
		XSSFSheet ws=wb.getSheet("Sheet1");
		
		int rc= ws.getLastRowNum();
		System.out.println(rc);
		
		/*Iterator<Row> row=ws.iterator();
		row.next();
		
		while(row.hasNext())
		{
			Row r=row.next();
			*/
			
		for(int i=1;i<=rc;i++)
		{
			String action=ws.getRow(i).getCell(3).getStringCellValue();
			
			if(action.equals("launchBrowser"))
			{
				keys.launchBrowser();
			}
			else if(action.equals("navigate"))
			{
				keys.navigate();
			}
			else if(action.equals("enterUsername"))
			{
				keys.enterUsername();
			}
			else if(action.equals("enterPassword"))
			{
				keys.enterPassword();
			}
			else if(action.equals("clickLogin"))
			{
				keys.clickLogin();
			}
			
		}
	}



}

