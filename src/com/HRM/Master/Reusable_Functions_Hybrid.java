package com.HRM.Master;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;

import com.HRM.Utilities.ScreenShot;

public class Reusable_Functions_Hybrid {
	
  public 	WebDriver driver;
  public 	FileInputStream fi;
  public	Properties pr;
	
	public String expres,actres;
	
	public String launchApp(String url) throws IOException
	{
		 expres="OrangeHRM";
		
		WebDriver driver=new FirefoxDriver();
		driver.get(url);
		driver.manage().window().maximize();
		
		 actres= driver.getTitle();
		
		if(expres.equals(actres))
		{
			return "pass";
		}
		else
		{
			
			ScreenShot.sceerns(driver, "launchapp12");
			return "fail";
		}
	}

	
	
	public String loginApp(String un,String psd) throws IOException
	{
		  expres = "Welcome Admin";
		
		  
		  WebDriver driver=new FirefoxDriver();
			driver.get("http://opensource.demo.orangehrmlive.com/");
			driver.manage().window().maximize();
		  
		 fi=new FileInputStream("E:\\Selenium10AMto1pm\\Workspace10am\\Selenium10am_proj\\src\\com\\HRM\\Properties\\Prop.properties");
		 pr=new Properties();
		pr.load(fi);
		
		Sleeper.sleepTightInSeconds(1);
		
		driver.findElement(By.id("txtUsername")).sendKeys(un);
		driver.findElement(By.id(pr.getProperty("psd"))).sendKeys(psd);
		driver.findElement(By.id(pr.getProperty("logbtn"))).click();
		
		 actres =driver.findElement(By.id("welcome")).getText();
		
		
		if(expres.equals(actres))
		{
			return "pass";
		}
		else
		{
			
			ScreenShot.sceerns(driver, "logapp");
			return "fail";
		}
		
		
		
		
		
		
		
		
		
	}
	
}


