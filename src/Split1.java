

public class Split1 {

	public static void main(String[] args) {
		
		String str= "one,two,four,five,nine";
		
		String[] s= str.split(",");
		
		System.out.println(s.length);
		
		
		
		for (int i = 0; i < s.length; i++) 
		{
			
			if(s[i].equalsIgnoreCase("two"))
					{
				System.out.println(s[i]);
					}
			
			else {
				System.out.println("no value");
			}
		}

	}

}
