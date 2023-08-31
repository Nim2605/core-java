package Inheritance;

class Base1{
	void display(){
		System.out.println("This is the base class...");
	}
}

class Derived1 extends Base1{
	void display() {
		super.display();
		System.out.println("This is the derived class...");
		
		}
}
public class SuperMethod {

	public static void main(String[] args) {		
		// TODO Auto-generated method stub
		Derived1 obj = new Derived1();
		obj.display();

	}

}
