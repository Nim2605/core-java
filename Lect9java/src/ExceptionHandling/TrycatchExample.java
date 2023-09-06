package ExceptionHandling;

public class TrycatchExample {

	public static void main(String[] args) 
	{
		try
		{
			int value =50/0;
		}
		catch(Exception e)
		{
			System.out.println("try catch example");
		}
		System.out.println(" ");
	}
}
