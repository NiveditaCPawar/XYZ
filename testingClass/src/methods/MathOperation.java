package methods;

public class MathOperation {

	public static void main(String[] args) 
	{
	MathOperation mo=new MathOperation();
	mo.substraction();
	mo.substraction(50f, 20f);
	mo.substraction(25.4f,11.2f);
	mo.substraction(20.10f, 10.12f);
mo.b(10, 20, 30);
	}

	public void substraction()//method without parameter
	{
		int a;
		int b;
		int sub;
		a=100;
		b=25;
		sub=a-b;
		
			System.out.println("substraction is "+sub);	
	}
	public void substraction(float a, float b)//method with parameter
	{
		float sub;
		sub=a-b;
		System.out.println(sub);
		
	}
	public void b(int a, int b, int c) //method with parameter
	{
		int add=a+b+c;
		System.out.println("addition is "+add);
	}
}
