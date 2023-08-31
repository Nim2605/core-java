package Inheritance;

class Parent{
	Parent(int a){
		System.out.println("This is the base/parent class "+a);
	}
}
class Child extends Parent{
	Child(){
		super(100);
		System.out.println("This is the child class ");
	}
}
public class superConstructor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Child obj = new Child();
	}
}
