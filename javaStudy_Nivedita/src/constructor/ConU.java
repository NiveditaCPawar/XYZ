package constructor;

public class ConU {
 String name;
	int rollNum;
 boolean status;
float avg;

public ConU() {
	name="Nivedita";
	rollNum=20;
	status=true;
	avg=8.5f;
	System.out.println("===========================");
}

public ConU(String a, int b) {
	name=a;
	rollNum=b;
	System.out.println("===========================");
}

public ConU(String a, int b, boolean c, float d) {
	name=a;
	rollNum=b;
	status=c;
	avg=d;
	
	
}

	public static void main(String[] args) 
	{
		ConU c1= new ConU();
		c1.identity();
		c1.rollNum();
		c1.pass();
		c1.averge();
		
		ConU c2= new ConU("Dipti", 12);
		c2.identity();
		c2.rollNum();
		
		ConU c3= new ConU("Prashant",55,true,9.5f);
		c3.identity();
		c3.rollNum();
		c3.pass();
		c3.averge();
		
		}
	public void identity()
	{
		System.out.println("Hello i am "+ name );
	}
	public void rollNum()
	{
		System.out.println("my roll number "+ rollNum);
	}
	public void pass() {
		System.out.println("my passing statement "+status);
	}
	public void averge() {
		System.out.println("my total cgpa is "+avg);
	}
	

}
