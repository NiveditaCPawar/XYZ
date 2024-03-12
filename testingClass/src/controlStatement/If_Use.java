package controlStatement;

public class If_Use {

	public static void main(String[] args) 
	{

		
		int a=10;
		int b=20;
		int c=50;
		if (a<b)
		{
			System.out.println("a is less than b");
			System.out.println("========================");
		}
		
		if (a>c) {
			System.out.println("c is less than a");
			System.out.println("=======================");
		}
		if ((a+b)<c)
		{
			System.out.println("the sum of a and b is less than c");
			System.out.println("=================");
		}
		if (true)
		{
			System.out.println("this will be executed because condition is true");
		}
		//if (false)
		//{
			////System.out.println("this will not be executed because condition is false ");
		//}
	
	}
	
	

	}
