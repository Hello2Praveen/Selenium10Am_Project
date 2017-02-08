package aui_day9;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Tool_Tip {

	public static void main(String[] args) throws Exception {
		
		WebDriver d=new FirefoxDriver();
		d.get("http://demoqa.com/tooltip/");
		d.manage().window().maximize();
		
		Thread.sleep(2000);
		
		//identify the text box
		WebElement textbox= d.findElement(By.id("age"));
		
		Actions tool=new Actions(d);
		
		Thread.sleep(2000);
		tool.moveToElement(textbox).perform();
		
		Thread.sleep(2000);
		//get ToolTip box message
		String tiptext= d.findElement(By.cssSelector(".ui-tooltip-content")).getText();
		
		System.out.println(tiptext);
		
	
	}

}




