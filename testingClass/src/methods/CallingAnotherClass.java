package methods;

public class CallingAnotherClass {

	public static void main(String[] args)
	{
		//methodName();
		demo8(); //calling static method from same class
		nivedita();
	//calling static method from another class
		//className.methodName();
		WonClass.batch(); //calling static method from another class
		WonClass.batch1();// calling static method from another class 
		

	}
	public static void demo8()//calling regular static method from same class
	{
		System.out.println("This is regular static method ");
	}
	public static void nivedita() 
	{
		System.out.println("Hello this is Nivedita");
	}
	

}
