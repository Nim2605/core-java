package Inheritance;

class E{
	void input() {
		System.out.println("enter your name ");
	}
	
}
class F extends E{
	void name() {
		System.out.println("My name is Nimish");
	}
}

class G extends E{
	void name1() {
		System.out.println("My name is Sakshi");
	}
}

public class HierarchicalInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		F obj1 = new F();
		obj1.input();
		obj1.name();
		
		G obj2 = new G();
		obj2.input();
		obj2.name1();
		
		
	}

}
