package aui;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.server.browserlaunchers.Sleeper;



public class Right_Click {

	public static void main(String[] args) {
		
		
		WebDriver d=new FirefoxDriver();
		d.get("http://google.com");
		d.manage().window().maximize();
		
		WebElement rc= d.findElement(By.linkText("Gmail"));
		
		Actions act=new Actions(d);
		
		Sleeper.sleepTightInSeconds(2);
		
		act.contextClick(rc).sendKeys(Keys.ARROW_UP).click().build().perform();
		
		// (  OR  )
		
		//act.contextClick(rc).sendKeys("W").click().build().perform();
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
