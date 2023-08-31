package Inheritance;

class student1{
	int rollno,marks;
	String name;
	
	void input() {
		System.out.println("Enter your Name,RollNo Marks :");
	}
}

class Nimeesh extends student1{
	void display() {
		rollno=1;
		marks=95;
		name="Adesh ";
		System.out.println(name + " " + rollno +" "+ marks);
	}
}

public class SingleInheritance {

	public static void main(String[] args) {
	    Nimeesh obj = new Nimeesh();
		obj.input();
		obj.display();
		

	}

}