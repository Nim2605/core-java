package ExceptionHandling;

public class TestThrow1 {
	
	public static void validate(int age)
	{
		if(age<18) {
			throw new ArithmeticException("Person is not elgible...");
		}
		else {
			System.out.println("Person is elgible to vote...");
		}		
	}
	public static void main(String[] args) {
		validate(9);
		System.out.println("Rest of the code...");
	}

}
