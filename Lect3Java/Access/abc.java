package Access;

class Protected{
	private int a=10;
	private void msg() {
		System.out.println("This is protected class");
	}
}
class abc {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Protected obj = new Protected();
		System.out.println(obj.a);
		obj.msg();
	}
}

//The error will occur as private access modifier is used and it can be only access
//within that class not outside the data
