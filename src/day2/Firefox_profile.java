package day2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;



public class Firefox_profile {

	public static void main(String[] args) {
		
		//create Profile obj
		ProfilesIni pr=new ProfilesIni();
		
		//store firefox profile into obj
		FirefoxProfile  fp=	pr.getProfile("selenium10am");
	 
		WebDriver driver=new FirefoxDriver(fp);
	
		driver.get("http://fb.com");

	}

}

 