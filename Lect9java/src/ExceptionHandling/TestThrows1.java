package ExceptionHandling;

import java.io.IOException;

public class TestThrows1 {
	void m() throws IOException{
		throw new IOException("Device error");
	}
	void n() throws IOException{
		m();
	}
	void p() {
		try {
			n();
		}
		catch(Exception e) {
			System.out.println("Exception Handling");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestThrows1 obj = new TestThrows1();
		obj.p();
		System.out.println("normal flow...");

	}

}
