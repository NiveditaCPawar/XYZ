package this_Super_key;

public class This_use 
{
	int a=10;
	int b=20;
	int c=30;
	
	public static void main(String[] args) {
		This_use k=new This_use();
		k.method();
		
	}
	public void method() 
	{
		int a=45;
		int b=10;
		int sum=a+25;
		System.out.println("the sum is equal to "+sum);
		
		int sum1=this.a+10;
		System.out.println("this is globle variable a "+sum1);
		
		int sum2=b+12;
		System.out.println("this is globle variable b "+sum2);
		
		
		
		
	}

}
