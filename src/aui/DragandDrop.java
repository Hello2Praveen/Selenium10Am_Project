package aui;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.server.browserlaunchers.Sleeper;


public class DragandDrop {

	public static void main(String[] args) {
		

		WebDriver d=new FirefoxDriver();
		d.get("http://jqueryui.com/droppable/");
		d.manage().window().maximize();
		
		 d.switchTo().frame(0);
		
		 Sleeper.sleepTightInSeconds(2);
		 
		 WebElement src= d.findElement(By.id("draggable"));
		 WebElement targ= d.findElement(By.id("droppable"));
		 
	     Sleeper.sleepTightInSeconds(2);
	
		 Actions dd=new Actions(d);
		 dd.dragAndDrop(src, targ).build().perform();
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 

	}

}
