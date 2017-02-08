package sample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.Select;





public class LaunchApp {
	
	public static void main(String[] args) {
		
		WebDriver driver=new FirefoxDriver();
		
		driver.navigate().to("https://www.google.co.in");
		
		driver.manage().window().maximize();
		
		//Login App
		
		/*
		driver.findElement(By.id("txtuId")).sendKeys("Admin");
		
		driver.findElement(By.id("txtPword")).sendKeys("Admin");
		
		driver.findElement(By.id("login")).click();
		*/
	}

}






