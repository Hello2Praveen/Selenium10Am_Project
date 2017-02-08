package day2;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;


public class DropDown_testing {

	public static void main(String[] args) {
		
		FirefoxDriver d=new FirefoxDriver();
		d.get("http://www.amazon.in/");
		d.manage().window().maximize();
		
		//identify the drop down 
		d.findElement(By.id("searchDropdownBox")).sendKeys("Books");
		
		//identify the Search box
		d.findElement(By.id("twotabsearchtextbox")).sendKeys("java");
		
		//identify the Search button
		d.findElement(By.xpath
			(".//*[@id='nav-search']/form/div[2]/div/input")).click();
		

	}

}
