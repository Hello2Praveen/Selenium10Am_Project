package day11;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;



public class Webtable12 {
  
	FirefoxDriver d;
	@BeforeMethod
	public void setUp()
	{
		 d=new FirefoxDriver();
		d.get("https://www.timeanddate.com/worldclock/");
		d.manage().window().maximize();
	}
	
	@Test
  public void f() {
	  
		String str= 
		"html/body/div[1]/div[7]/section[2]/div[1]/table/tbody/tr[";
		String str12="]/td[3]";
		
		
		for(int i=1;i<=36;i++)
		{
			String table= d.findElement(By.xpath(str+i+str12)).getText();
			
			//( OR )
			
			//String table= d.findElement(By.xpath("html/body/div[1]/div[7]/section[2]/div[1]/table/tbody/tr["+i+"]/td[3]")).getText();
			
			System.out.println(table);
		}
		
		
  }
}
