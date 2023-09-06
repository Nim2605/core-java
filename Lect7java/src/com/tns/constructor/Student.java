package com.tns.constructor;

public class Student {

		int id ;
		String name;
		int age;
		
		Student(int i,String n)
		{
			id=i;
			name=n; //two arg/parn constructor
		}	
		
		Student(int i,String n,int a){ //three arg/parn constructor
			id=1;
			name=n;
			age=a;
			
		}
		
		void display() {
			System.out.println(id+ " "+name+ " "+age);
		}
		public static void main(String[] args) {
			Student s1 = new Student(10,"Nimish");
			Student s2 = new Student(11,"Sakshi",20);
			s1.display();
			s2.display();
	}
}