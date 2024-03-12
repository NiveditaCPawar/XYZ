package methods;

public class NonStatic {

	public static void main(String[] args)
	{    //calling non static method from same class
		//to call non static regular method we need object
		// how to create object
		//ClassName ObjectName = new ClassName();
		NonStatic cpu= new NonStatic();
		//how to call non static method 
		//syntax--> ObjectNmae.MethodName();
		cpu.student(); //calling non static method from same class
		cpu.school();
		

	}
	public void student()// this is non static complete and regular method
	{
		System.out.println("This is non static complete regular method");
		
	}
	public void school()//non static complete regular method
	{
		
		System.out.println("This is also non static complete regular method");
	}

}
