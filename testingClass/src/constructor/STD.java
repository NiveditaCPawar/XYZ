package constructor;

public class STD {

	String name;
	int age;
	float height;
	char gender;
	boolean status;
	public static void main(String[] args) {
		STD s1 = new STD();
		s1.pname();
		s1.age();
		s1.pheight();
		s1.pgender();
		s1.pstatus();
		}
	public STD()
	{
		System.out.println("hello");
	}
				
		
	
	public void pname() {
		name = "Nivedita";
		System.out.println("my name is "+name);
	}
	public void age() {
		age = 25;
		System.out.println("my age is "+age);
		
	}
	public void pheight() {
		height=5.5f;
		System.out.println("my height is "+height);
	}
	public void pgender() {
		gender='F';
		System.out.println("my gender is "+gender);
	}
	public void pstatus()
	{
		status = true;
		System.out.println("my passing statement is "+status);
	}

}


