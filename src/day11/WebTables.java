package day11;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;

public class WebTables {
	FirefoxDriver d;
	
  @Test
  public void f() {
	  
	  
	  for (int i = 1; i <=10 ; i++) 
	  {
		  
		  for (int j = 1; j <= 5; j++) 
		  {
			 String text=d.findElement(By.xpath
    ("html/body/div[1]/div[7]/section[2]/div[1]/table/tbody/tr["+i+"]/td["+j+"]"))
					 .getText();
			 
			 System.out.print(text+"   ");
		  }
		
		  System.out.println();
	}	  
  }
 
  
  @BeforeMethod
  public void setUp() {
	  
	  d=new FirefoxDriver();
		d.get("https://www.timeanddate.com/worldclock/");
		d.manage().window().maximize();
  }
}


