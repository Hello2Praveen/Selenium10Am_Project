package aui_day9;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.server.browserlaunchers.Sleeper;

public class Slider12 {

	public static void main(String[] args) {
		
		WebDriver d=new FirefoxDriver();
		d.get("https://www.flipkart.com/search?as=on&as-show=on&otracker=start&p%5B%5D=facets.price_range.from%3DMin&p%5B%5D=facets.price_range.to%3DMax&q=watches+women&sid=r18%2Ff13");
		d.manage().window().maximize();
		
		//d.switchTo().frame(0);
		Sleeper.sleepTightInSeconds(2);
		
		WebElement slider=d.findElement(By.cssSelector("._3IGEML"));
		
		 int a = slider.getLocation().x;
		
		Actions sld=new Actions(d);
		
		Sleeper.sleepTightInSeconds(2);
		
		sld.dragAndDropBy(slider, a, 2000).perform();
		
		
	}

}
