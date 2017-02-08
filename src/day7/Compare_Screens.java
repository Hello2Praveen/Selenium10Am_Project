package day7;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;

public class Compare_Screens {

	public static void main(String[] args) throws IOException {
		
		WebDriver d=new FirefoxDriver();
		d.navigate().to("http://newtours.demoaut.com");
		d.manage().window().maximize();
		
		File  src= ((TakesScreenshot)d).getScreenshotAs(OutputType.FILE);
		
			
		d.navigate().to("http://google.com");
		File  src12= ((TakesScreenshot)d).getScreenshotAs(OutputType.FILE);
		
		if(FileUtils.contentEquals(src, src12))
		{
			System.out.println("screens are saME");
		}
		else
		{
			System.out.println("screens are not saME");
		}
		
	
	}

}
