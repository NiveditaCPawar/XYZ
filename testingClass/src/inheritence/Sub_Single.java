package inheritence;

public class Sub_Single extends Super_Single
{

	public static void main(String[] args) {
		
		Super_Single s1=new Super_Single();
		s1.subtraction();
		addition();
		
		Sub_Single s2=new Sub_Single();
		s2.division();
		s2.subtraction();
		mul();
		

	}
	
	public static void mul() {
		int d=10;
		int e=10;
		int mul=d*e;
		System.out.println("my multiplication is "+mul);
	}
	public void division() {
		//int k=50;
		//int l=5;
		int div=50/5;
		System.out.println("my division is "+div);
	}

}
