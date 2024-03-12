package this_Super_key;

public class Super_use extends This_use
{   int a=55; //global variable
    int b=100;//global variable

	public static void main(String[] args) {
		
		Super_use s=new Super_use();
		s.manual();	
	}
	public void manual()
	{
		int a=20;
		int b=30;
		int mul=a*10;
		System.out.println("the multiplication is "+mul);
		
		int div=b/3;
		System.out.println("the dividation is "+div);
		
		int sum=this.a+10;
		System.out.println("non static globle from own class "+sum);
		
		int sum1=this.b+50;
		System.out.println("non static globle from own class "+sum1);
		
		int add=super.a+20;
		System.out.println("globle variable from super class "+add);
		
		int add2=super.b+0;
		System.out.println("globle variable from super class "+add2);
		
		System.out.println(super.c);
		
	}

}
