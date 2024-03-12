package constructor;

public class ConstructorUse {

	
	int a;
	int b;
	int c;

	public static void main(String[] args) {
		
		ConstructorUse co1=new ConstructorUse();
		co1.computer();
		co1.substraction();
     co1.addition();
	}

	public void computer()
	{
		System.out.println("This is non static without parameter");
	}

	public void substraction()
	{
		int sub=a-b;
		System.out.println("The sub is "+sub);
	}
	
	public void addition()
	{
	int addition=a+b+c;	
	System.out.println("addition is "+addition);
	}
}
