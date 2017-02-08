package day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Craetion_Xpath {

	public static void main(String[] args) {
		
		WebDriver driver=new FirefoxDriver();
		driver.navigate().to("http://www.amazon.in/");
		driver.manage().window().maximize();
		
		
		driver.findElement(By.xpath
				("//input[@name='field-keywords'  and @ type='text']"))
		                            .sendKeys("hello");
		

	}

}
