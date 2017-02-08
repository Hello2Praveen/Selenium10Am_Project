import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Parameter {

	WebDriver driver;
	
	public void log(String url,String un, String psd)
	{
		 driver=new FirefoxDriver();
		driver.get(url);
		
		driver.findElement(By.id("txtUsername")).sendKeys(un);
		driver.findElement(By.id("txtPassword")).sendKeys(psd);
		
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Parameter obj=new Parameter();
		
		obj.log("http://opensource.demo.orangehrmlive.com", "Admin", "admin");
	
	}

}










