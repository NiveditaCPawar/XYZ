package studyClass;

public class New_class {

	int a=10;//global variable 
	int b=20;
	
	public static void main(String[] args) {
		New_class n1=new New_class();
		n1.test1();

	}
	public void test1() {
		
		int a=50;//duplicate local variable
		int sum=a+20;
		System.out.println(sum);
		
		int sum1=this.a+50;// "this" keyword use for global variable a
		System.out.println(sum1);
		
		int b=5;
		int sum2=b+30;
		System.out.println(sum2);
		
		int sum3=this.b+10;
		System.out.println(sum3);
		
	}
	

}
