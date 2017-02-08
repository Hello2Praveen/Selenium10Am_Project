package day7;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Defect_Screens {

	public static void main(String[] args) throws IOException {
		
		WebDriver driver=new FirefoxDriver();
		driver.navigate().to("http://opensource.demo.orangehrmlive.com/");
		driver.manage().window().maximize();
		
		String expres= "OrangeHRM";
		
		String actres= driver.getTitle();
		System.out.println("The Actual Title is=="+actres);
		
		
		if(expres.equals(actres))
		{
			System.out.println("Launch Suceeesssss");
		}
		else
		{
			System.out.println("Launch not Suceeesssss");
		
		 File	src= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(src, new File("E:\\Selenium10AMto1pm\\Screens\\xyz1234.png"));
		}	

	}

}
