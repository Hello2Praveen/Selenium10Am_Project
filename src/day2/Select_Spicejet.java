package day2;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;



public class Select_Spicejet {

	public static void main(String[] args) throws Exception {
		
		
		FirefoxDriver d=new FirefoxDriver();
		d.get("http://www.spicejet.com/");
		d.manage().window().maximize();
		
		
		Thread.sleep(2000);
		
		//one way
		d.findElement(By.id("ctl00................._Trip_1")).click();
		
		//click on leaving from
		d.findElement(By.id("ctl00.................._CTXTaction")).click();
		
		//click on Hyd
		d.findElement(By.linkText("Hyderabad (HYD)")).click();
		
		Thread.sleep(2000);
		//click on Beng
		d.findElement(By.linkText("Bengaluru (BLR)")).click();
		
		Thread.sleep(2000);
		//click on date
		d.findElement(By.linkText("26")).click();
		
		Thread.sleep(2000);
		
		//select value from Adults drop down
		new Select(d.findElement(By.id("ctl00_mainContent_ddl_Adult"))).
		                                   selectByVisibleText("3 Adults");
		
		Thread.sleep(2000);
		
		//select value from Child drop down
		new Select(d.findElement(By.id("ctl00_mainContent_ddl_Child"))).
		                                      selectByVisibleText("1 Child");
		
		Thread.sleep(2000);
		//Find Flight
		d.findElement(By.xpath(".//*[@id='.........dFlights']")).click();
		

	}

}
