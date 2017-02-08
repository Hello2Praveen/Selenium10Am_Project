package day5;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;




public class Block_Links {

	public static void main(String[] args) {
		
		WebDriver d=new FirefoxDriver();
		d.navigate().to("http://www.bing.com/");
		d.manage().window().maximize();
		
		//identify the Block
		 WebElement block1= d.findElement(By.id("sc_hdu"));
		 
		//identify the Block LIknks
		 List<WebElement> links= block1.findElements(By.tagName("a"));
		 System.out.println(links.size());
		 
		 for (int i = 0; i < links.size(); i++) 
		 {
			System.out.println(links.get(i).getText());
		}
			 
	}

}
