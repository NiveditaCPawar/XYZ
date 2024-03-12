package methods;

public class WonClass {

	public static void main(String[] args)
	{
		//how to call static regular method from own class
		//methodName();
		batch(); //calling static regular method from same class
		batch1();
		batch1();

	}
	public static void batch()//complete static regular method
	{
		System.out.println("Hi this is complete static regular method batch");
	}
	public static void batch1()
	{
		System.out.println("This is regular static method batch1");
	}
 
}
