package interface_use;

public class Interface_study implements Redmi,Xiaomi,Ambiquity
{

	public static void main(String[] args) 
	{
		Interface_study is1=new Interface_study();
		is1.cell();
		is1.cell2(10, 20);
		is1.cell3(5, 10, 20);
		is1.model();
		is1.model(50);
		is1.model(45, 45);
		is1.nivedita();
		is1.prashant();
	}
	
	@Override
	public void cell2(int a, int b) 
	{
		int sum=a+b;
		System.out.println("addition is "+ sum);
	}
    @Override
	public void cell3(int a, int b, int c) 
    {
		int sub=c-a-b;
		System.out.println("substraction is "+ sub);
		}

	@Override
	public void model() {
		System.out.println("this is model method from redmi");
		
	}

	@Override
	public void model(int a) {
		System.out.println("model method with parameter and the value of a is "+a);
		
	}

	@Override
	public void model(int a, int b)
	{  int sum=a+b;
		System.out.println("the sum is equal to "+sum);
		
	}
	@Override
	public void nivedita() {
		System.out.println("hello yeda mulga");
		
	}
	@Override
	public void prashant() {
		System.out.println("hii");
		
	}

	@Override
	public void cell() {
		System.out.println("hello");
	}

}
