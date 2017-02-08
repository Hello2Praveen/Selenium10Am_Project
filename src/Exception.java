///import org.bouncycastle.tsp.GenTimeAccuracy;

public class Exception {

	public static void main(String[] args) 
	{
		
		try 
		{
			System.out.println(100/0);
			
		} 
		
		catch(ArithmeticException  e)
		{
			System.out.println(e.getMessage());
			System.out.println("hello");
			
		}
		
		
		

	}

	private char[] getMessage() {
		// TODO Auto-generated method stub
		return null;
	}

}
