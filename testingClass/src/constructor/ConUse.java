package constructor;

public class ConUse {
 int a;
 int b;
 int c;
	public static void main(String[] args) {
		
		ConUse c1=new ConUse(10);
		c1.pass12();
		c1.pass1();
		System.out.println("==========");
		
		ConUse c2= new ConUse(10, 20);
		c2.pass12();
		c2.pass1();
		System.out.println("============");
		
		ConUse c3=new ConUse(10, 20, 30);
		c3.pass12();
		c3.pass1();
		System.out.println("============");
		
		
	}
	public ConUse(int x) {
		a=x;
	}
	
	public ConUse(int x,int y) {
		a=x;
		b=y;
		
	}
	
	public ConUse(int x,int y,int z) {
		a=x;
		c=z;
		b=y;
		
	}
	public void pass1() {
		int mul=a*b;
		System.out.println("the multiplication "+mul);
	}
	
	public void pass12()
	{
		int sum=a+b+c;
				System.out.println("the sum is "+sum);
			
	}

}
