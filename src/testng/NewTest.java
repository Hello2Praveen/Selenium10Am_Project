package testng;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;



public class NewTest {
  
	
	@Test
  public void f() 
	{
		System.out.println("second");
  }
 
	@Test
	public void a()
	{
		System.out.println("FIRST");
	}
	
	@Test
	public void af()
	{
		System.out.println("FIRST");
	}
	
	@Test
	public void abn()
	{
		System.out.println("FIRST");
	}
	
	@Test
	public void ag()
	{
		System.out.println("FIRST");
	}
  
  @BeforeTest
  public void beforeTest() 
  {
	  System.out.println("START"); 
  }

  @AfterTest
  public void afterTest() 
  {
	  System.out.println("STOP"); 
  }

}



