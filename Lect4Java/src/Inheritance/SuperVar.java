package Inheritance;

class Base{
	int a = 10;
}

class Derived extends Base{
	int a = 20;
	void show() {
		System.out.println(super.a);
		System.out.println(a);
	}
}

public class SuperVar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Derived obj = new Derived();
		obj.show();

	}

}
