package day8;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CheckBox_Testing {

	public static void main(String[] args) {
		
		WebDriver driver=new FirefoxDriver();
		driver.navigate().to("http://echoecho.com/htmlforms09.htm");
		driver.manage().window().maximize();
		
		// identify the 3 check boxes
		List<WebElement> checks= driver.findElements(By.xpath
				                ("//td[@class='table5']/input[@type='checkbox']"));
		System.out.println(checks.size());
		
		for (int i = 0; i < checks.size(); i++) 
		{
			// IF check box is not selected
			if(   !   checks.get(i).isSelected())
			{
			checks.get(i).click();
			
			System.out.println(checks.get(i).getAttribute("value"));
			}	
		}	
	}
}



