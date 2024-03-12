package constructor;

public class NewCon {
    int x; // declaration
    int y;
    int z;
    
    public static void main(String[] args) 
	
	{
    	NewCon n1= new NewCon(10); //
	n1.add();
	n1.sub();
	n1.multiplication();
	System.out.println("============");
	
	NewCon n2= new NewCon(10, 20);
	n2.add();
	n2.sub();
	n2.multiplication();
	System.out.println("================");
	
	NewCon n3= new NewCon(10, 20, 30);
	n3.add();
	n3.sub();
	n3.multiplication();
		

	}
	public void add()//usage
	{
		
		int add=x+y+z;
		System.out.println("this is non static and the addition is "+add);
		
		}
	public void sub() 
	{
		
		int sub=x-y-z;
		System.out.println("the substraction of all the parameter is "+sub);
	
	}
	public void multiplication()
	{
		
		int mul=x*y*z;
		System.out.println("multiplication of all this is "+mul);
		System.out.println("===============");
	}
	public NewCon(int a)// initialization
	{ x=a;
		
	}
	public NewCon(int a, int b)
	{ x=a;
	y=b;
		
	}
	public NewCon(int a, int b, int c)
	{x=a;
	y=b;
	z=c;
		
	}
	}


