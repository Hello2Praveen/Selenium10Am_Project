package day6;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ScreenShot {

	public static void main(String[] args) throws IOException {
		
		
		WebDriver d=new FirefoxDriver();
		d.navigate().to("http://newtours.demoaut.com");
		d.manage().window().maximize();
		
	  File	src= ((TakesScreenshot)d).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src, new File("D:\\Demo\\xyz.png"));

	}

}



