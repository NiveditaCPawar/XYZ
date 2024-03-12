package abstract_Class;

public abstract class Concreate_Class extends Abstarct_use {

	public static void main(String[] args) {
		//Concreate_Class c1=new Concreate_Class();
		//c1.school();
		//c1.school2();
		Abstarct_use.university();
		Concreate_Class.test1();
		
		

	}

	@Override
	public void school() {
		System.out.println("this is abstract class");
		
	}

	@Override
	public void school2() {
		System.out.println("this is abstract method from abstract class");
		
	}
	public static void test1() {
		System.out.println("this is test1 methos from own class");
	
	
	}
	public abstract void test2();
	
	
	

}
