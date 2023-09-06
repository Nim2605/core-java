package ExceptionHandling;

public class JavaExceptionexample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
		int data=100/0;
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		System.out.println("rest of the code");

	}

}
