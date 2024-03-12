package constructor;

public class CoNew {
	String name;//declaration
	char div;
	int rollNum;
	float avg;
	
	public static void main(String[] args)
	{
		CoNew c1=new CoNew();//constructor with zero parameter
		c1.identity();
		c1.division();
		c1.rollnum();
		c1.marks();
		
		CoNew c2=new CoNew("Nivedita");//constructor with one parameter
		c2.identity();
		c2.division();
		c2.rollnum();
		c2.marks();
		
		CoNew c3=new CoNew("Mahesh",'A');//constructor with two parameter
		c3.identity();
		c3.division();
		c3.rollnum();
		c3.marks();
		
		CoNew c4=new CoNew("Swati", 'B', 20);//constructor with three parameter
		c4.identity();
		c4.division();
		c4.rollnum();
		c4.marks();
		
		CoNew c5=new CoNew("Tanvi", 'B', 45, 8.9f);//constructor with four parameter
		c5.identity();
		c5.division();
		c5.rollnum();
		c5.marks();
		

	}
	//initialization
	public CoNew() {//this is 1st constructor without parameter 
		name="Aarti";
		div='A';
		rollNum=12;
		avg=8.5f;
		
	}
	public CoNew(String a) // constructor with single parameter 
	{
		name=a;
	}
	public CoNew(String a, char b) // constructor with two parameter 
	{
		name=a;
		div=b;
	}
	public CoNew(String a, char b, int c) // constructor with three parameter
	{
		name=a;
		div=b;
		rollNum=c;
	}
	public CoNew(String a, char b, int c,float d)// constructor with four parameter
	{
		name=a;
		div=b;
		rollNum=c;
		avg=d;
	}
	public void identity() //usage
	{
		System.out.println("Hello i am "+name);
	}
	public void division() 
	{
		System.out.println("my division is "+div);
	}
	public void rollnum() 
	{
		System.out.println("and my roll number is "+rollNum);
	}
	public void marks()
	{
		System.out.println("i got the average marks is "+avg);
		System.out.println("==================================");
	}
}
