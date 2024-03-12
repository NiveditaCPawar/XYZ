package polymorphism;

public class Compile_Time {

	public static void main(String[] args) {
		Compile_Time ct=new Compile_Time();
		ct.wolverine();
		ct.wolverine(20, 30);
		ct.wolverine(15.5f, 10f);
		Compile_Time.wolverine1();
		Compile_Time.wolverine1(10);
		Compile_Time.wolverine1(10, 20);

	}
	public void wolverine()//compile time overloading methods
	{
		int a=10;
		int b=20;
		int sum=a+b;
		System.out.println(sum);
		
	}
	public void wolverine(int a,int b)
	{
		int sum=a+b;
		System.out.println(sum);
	}
	public void wolverine(float x,float z) {
		float sum=x+z;
		System.out.println(sum);
	}
	public static void wolverine1() {
		System.out.println("hello");
	}
	public static void wolverine1(int a) {
		System.out.println("Nivedita");
		
	}
	public static void wolverine1(int x, int z) 
	{
		int sum=x+z;
		System.out.println(sum);
	}

}
