package day20;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Assert12 {
  @Test
  public void f() {
	  
	  WebDriver driver=new FirefoxDriver();
		driver.navigate().to("http://opensource.demo.orangehrmlive.com/");
		driver.manage().window().maximize();
		
		String expres= "OrangeHRM";
		
		String actres= driver.getTitle();
		System.out.println("The Actual Title is=="+actres);
		
		Assert.assertEquals(actres, expres);
		
		System.out.println("hellooo");
		
	 
  }
   
}
