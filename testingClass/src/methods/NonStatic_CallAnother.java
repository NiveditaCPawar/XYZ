package methods;

public class NonStatic_CallAnother {

	public static void main(String[] args) {
		//to call non static method from same class
		//className objectName=new className();
		NonStatic_CallAnother cell=new NonStatic_CallAnother();
		//calling non static method from same class
		cell.books();
		cell.book2();
		//calling non static method from another class
		//create object of that another class 
		//className objectName= new className();
		M123 n123= new M123();
		//calling method from M123
		n123.abc();
		n123.xyz();
		

	}

	public void books()
	{
	System.out.println("Hello i am reference book");		
	}
	public void book2() 
	{
	System.out.println("hello this is history book");	
	}
}
