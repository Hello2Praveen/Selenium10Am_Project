package sample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Google {

	public static void main(String[] args) throws Exception {
		
		WebDriver d=new FirefoxDriver();
		d.get("https://www.google.co.in/");
		d.manage().window().maximize();
		
		Thread.sleep(3000);
		
		// identify the search box
		d.findElement(By.id("lst-ib")).sendKeys("seleniummmmmmmm");
		
		Thread.sleep(3000);
		d.findElement(By.id("lst-ib")).clear();
		
		Thread.sleep(3000);
		d.findElement(By.id("lst-ib")).sendKeys("qtpppppppp");
		d.findElement(By.name("btnG")).click();
		
	
	}

}
