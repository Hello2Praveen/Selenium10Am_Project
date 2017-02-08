package day2;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;











public class Xpath12 {

	public static void main(String[] args) {
	
		FirefoxDriver d=new FirefoxDriver();
		d.get("http://www.amazon.in/");
		d.manage().window().maximize();
		
		d.findElement(By.xpath(".//*[@id='twotabsearchtextbox']")).
		                                             sendKeys("java");
		
		

	}

}



