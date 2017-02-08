package day5;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Links_SBI {

	public static void main(String[] args) {
		
		WebDriver driver=new FirefoxDriver();
		driver.navigate().to("https://www.icicibank.com/");
		driver.manage().window().maximize();
		
		//identify the no.of links
		
	     List<WebElement> lk=	driver.findElements(By.tagName("a"));
	     System.out.println(lk.size());
	     
	     for (int i = 0; i <  lk.size(); i++) 
	     {
			String str= lk.get(i).getText();
			System.out.println(str);
		}
	}
}

