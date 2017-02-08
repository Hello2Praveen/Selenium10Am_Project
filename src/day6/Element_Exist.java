package day6;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Element_Exist {

	public static void main(String[] args) {
		
		WebDriver d=new FirefoxDriver();
		d.navigate().to("http://google.com/");
		d.manage().window().maximize();
		
		String source=  d.getPageSource();
		
		System.out.println(source);
		
		
		if(source.contains("Gmail"))
			System.out.println("Element is exist");
		else
			System.out.println("Element is not exist");
	}

}
