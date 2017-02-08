package com.HRM.Utilities;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public  class ScreenShot {
	
	public static void sceerns(WebDriver driver,String sname) throws IOException
	{
		String path="E:\\Selenium10AMto1pm\\Workspace10am\\Selenium10am_proj\\src\\com\\HRM\\ScreenShots\\"+sname+".png";
		
		 File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		 FileUtils.copyFile(src, new File(path));
	}

}
