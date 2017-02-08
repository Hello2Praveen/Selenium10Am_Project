package sample;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;






public class Chrome_Browser {

	public static void main(String[] args) {
		
		
System.setProperty("webdriver.chrome.driver","E:\\Selenium10AMto1pm\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("http://google.com");

	}

}
