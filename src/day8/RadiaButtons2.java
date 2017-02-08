package day8;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class RadiaButtons2 {

	public static void main(String[] args) {


		WebDriver driver=new FirefoxDriver();
		driver.navigate().to("http://echoecho.com/htmlforms10.htm");
		driver.manage().window().maximize();
		
		// Xpath for Block
		String xpathV="html/body/div[2]/table[9]/tbody/tr/td[4]/table/tbody/tr/td/div/span/form/table[3]/tbody/tr/td/table/tbody/tr/td";
		
		 WebElement block= driver.findElement(By.xpath(xpathV));
		 
		 // loop for 2 groups
		 for (int k = 1; k <= 2; k++) 
		 {
			 //identify the radio buttons from block
			List<WebElement> radio= block.findElements(By.name("group"+k));
			
			//loop for Radio buttons
			for (int i = 0; i < radio.size(); i++) 
			{
				radio.get(i).click();
				
				// loop for print radio buttons 
				for (int j = 0; j < radio.size(); j++) 
				{
					System.out.println(radio.get(j).getAttribute("value")+"-----"+
				                            radio.get(j).getAttribute("checked"));
				}
				
				System.out.println("***************************");
			}
		}
	}
}

