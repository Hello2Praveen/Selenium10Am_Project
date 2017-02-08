package day7;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;

public class Alerts1 {

	public static void main(String[] args) {
		
		WebDriver driver=new FirefoxDriver();
		driver.navigate().to("http://primusbank.qedgetech.com/");
		driver.manage().window().maximize();
		
		Sleeper.sleepTightInSeconds(2);
		
		driver.findElement(By.id("login")).click();
		
		Sleeper.sleepTightInSeconds(2);
		
		String str= driver.switchTo().alert().getText();
		System.out.println(str);
		
		Sleeper.sleepTightInSeconds(2);
		
		driver.switchTo().alert().accept();
	
	}

}
