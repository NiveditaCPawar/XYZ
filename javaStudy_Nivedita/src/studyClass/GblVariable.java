package studyClass;

public class GblVariable
{
	int a = 88 ;//global variable
	            // colour of global varible is always blue

	public static void main(String[] args)
	{
		GblVariable s1 = new GblVariable();
		s1.demo1();
		s1.demo2();
		

	}
	public void demo1()
	{
		           // calling from same class//
		int x=1; //Local varible --->declaration---->intialization
		         // local variable colour is black
		//int y=2; //Local varible --->declaration---->intialization
				 // local variable colour is black
		int sum=x+a; // here we use global variable is a
// to check to value came from which varible---->ctrl pressed varible click
		
		System.out.println("sum is "+sum);
	}
	public void demo2()
	{
		int x =90;     //Local varible --->declaration---->intialization
		               // local variable colour is black
		//int y = 100;   //Local varible --->declaration---->intialization
		               // local variable colour is black
		int sub = x-a; // here we use global variable is a
// to check to value came from which varible---->ctrl pressed varible click
		System.out.println("my sub is "+sub);
	}

}