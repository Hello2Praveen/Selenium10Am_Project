package day5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Validations_HRM {

	public static void main(String[] args) {
		
		WebDriver driver=new FirefoxDriver();
		driver.navigate().to("http://opensource.demo.orangehrmlive.com/");
		driver.manage().window().maximize();
		
		String expres= "Orangehrm";
		
		String actres= driver.getTitle();
		System.out.println("The Actual Title is=="+actres);
		
		
		if(expres.equals(actres))
			System.out.println("Launch Suceeesssss");
		else
			System.out.println("Launch not Suceeesssss");

		
		// LOgin App
		
		
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		
		driver.findElement(By.id("txtPassword")).sendKeys("admin");
		
		driver.findElement(By.id("btnLogin")).click();
		
		String exp="Welcome Admin";
		
		String act= driver.findElement(By.id("welcome")).getText();
		
		
		if (exp.equalsIgnoreCase(act))
		{
			System.out.println("Login Suceeessss");
			
		}
		else
		{
			System.out.println("Login not Suceeessss");
		}
	
	}

}
