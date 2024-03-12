package accessSpecifiers;

public class Exam {

	public static void main(String[] args) 
	{
		Test1 e=new Test1();
		//e.test1();
		e.test2();//default method calling from another class
		e.test3();//protected method calling from another class
		e.test4();//public method calling from another class
		
		//System.out.println("calling private variable from another class "+e.a);
		System.out.println("calling default variable from another class "+e.b);
		System.out.println("calling protected variable from another class "+e.c);
		System.out.println("calling public variable from another class "+e.d);
	}

}
