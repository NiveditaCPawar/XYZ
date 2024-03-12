package studyClass;

public class ClassN {

	public static void main(String[] args) {
		
		
		
		study();// static method calling
		
		
		ClassN c1=new ClassN();//object creation--> syntax-->className object=new className();
		c1.study2();//method calling-->syntax-->object.methodName();
		c1.pass();
		c1.sample();

	}
public static void study()
{
	System.out.println("hello this is static method");
}
public void study2() {
	System.out.println("this is non static method");
}
public void pass() {
	System.out.println("this is non static regular method");
}
public void sample() {
	System.out.println("hello this is non static regular method");
}
}

	

	

	
	
	
	
	
	

