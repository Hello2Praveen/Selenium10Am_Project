package day7;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class RadioButtons {

	public static void main(String[] args) {
		
		WebDriver driver=new FirefoxDriver();
		driver.navigate().to("http://echoecho.com/htmlforms10.htm");
		driver.manage().window().maximize();
	
		//identify the block
		WebElement block= driver.findElement(By.xpath("html/body/.......tbody/tr/td"));
		
		//from block get first 3 radio buttons
		List<WebElement> radio= block.findElements(By.name("group1"));
		System.out.println(radio.size());
		
		for (int i = 0; i < radio.size(); i++) 
		{
			
			String  str= radio.get(i).getAttribute("value");
			
			String str12= radio.get(i).getAttribute("checked");
		 
					System.out.println(str+"-----"+str12);
			
		}
	}
}










