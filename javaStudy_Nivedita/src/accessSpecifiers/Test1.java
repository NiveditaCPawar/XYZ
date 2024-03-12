package accessSpecifiers;

public class Test1 
    { 
	
	private int a=10;
	int b=20;
	protected int c=30;
	public int d=40;
	

	public static void main(String[] args) {
		
		Test1 s1=new Test1();
		System.out.println("this is private variable "+s1.a);
		System.out.println("this is default variable "+s1.b);
		System.out.println("this is default variable "+s1.c);
		System.out.println("this is public variable "+s1.d);
		
		
		s1.test1();
		s1.test2();
		s1.test3();
		s1.test4();
		
	}
	private void test1() {
		System.out.println("private method");//visible within class
	}
	void test2() 
	{
		System.out.println("default method");//visible within package
	}
	protected void test3() {
		System.out.println("protected method");//visible within package and out side of package by using inheritance
	}
	public void test4() {
		System.out.println("public method");//visible within the project
	}

}
