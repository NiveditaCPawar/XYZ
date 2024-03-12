package constructor;

public class ConsU_se {

	String name;
	boolean status;
	int marks;
	float percent;
	
	public ConsU_se(String s){
		name=s;
		
	}
	public ConsU_se(String a, boolean b) {
		name=a;
		status=b;
	}
	public ConsU_se(String x, boolean y,int z) {
		name=x;
		status=y;
		marks=z;
		
	}
	public ConsU_se(String h,boolean i,int j,float k) {
		name=h;
		status=i;
		marks=j;
		percent=k;
	}
	
	
	public static void main(String[] args) {
		ConsU_se cu=new ConsU_se("hello");
		cu.identity();
		cu.passing();
		cu.mark();
		cu.percentages();
		System.out.println("===========================");
		
		ConsU_se cu1=new ConsU_se("akash", true);
		cu1.identity();
		cu1.passing();
		cu1.mark();
		cu1.percentages();
		System.out.println("===========================");
		
		ConsU_se cu2=new ConsU_se("Sanskruti", false, 99);
		cu2.identity();
		cu2.passing();
		cu2.mark();
		cu2.percentages();
		System.out.println("===========================");

		ConsU_se cu3= new ConsU_se("Pawar", true, 100,78.5f);
		cu3.identity();
		cu3.passing();
		cu3.mark();
		cu3.percentages();
				

	}
	
	public void identity() {
		
		System.out.println("my name is "+name);
	}
	public void passing() {
		
		System.out.println("my passing status is "+status);
		
	}
	
	public void mark() {
		
		System.out.println("my marks is "+marks);
	}
	public void percentages() {
	
		System.out.println("my percentage is "+percent);
	}

}
