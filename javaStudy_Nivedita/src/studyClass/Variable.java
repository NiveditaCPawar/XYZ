package studyClass;

public class Variable {
	static int a=20;//static global variable

	public static void main(String[] args) {
		
		pass();//calling static method
		System.out.println("===================");
		Variable v1= new Variable();
		v1.var();
		System.out.println("===================");
		System.out.println("this is static global variable "+a);
		//calling static global variable from same class
		System.out.println("====================");
		System.out.println("this is static global variable from another class "+St.p);
	}
	public static void pass() {
		System.out.println("calling from static method "+a);
	}
	
	public void var() {
		int b=10;//this is local variable
		System.out.println("this is local variable "+b);
		System.out.println("this is static globle variable "+a);
	}
	
}
