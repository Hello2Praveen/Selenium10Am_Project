package aui;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.server.browserlaunchers.Sleeper;

public class Mouse_Hover {

	public static void main(String[] args) {
		
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.emirates.com/in/English/");
		driver.manage().window().maximize();
		
		//identify the Experience link
		WebElement exp= driver.findElement(By.xpath(".//*[@id='inFlight']/a/span[1]"));
		
		//identify the Book link
		WebElement book =driver.findElement(By.xpath(".//*[@id='book']/a"));
		
		Sleeper.sleepTightInSeconds(2);
		
		Actions mo=new Actions(driver);
		
		mo.moveToElement(exp).perform();
		Sleeper.sleepTightInSeconds(2);
		mo.moveToElement(book).perform();
		
		//  ( OR )
		
		mo.moveToElement(exp).moveToElement(book).build().perform();
	}

}





