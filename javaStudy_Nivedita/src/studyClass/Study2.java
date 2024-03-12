package studyClass;

public class Study2 extends Study1 {

	public static void main(String[] args) {
		Study1 s1= new Study1();
		s1.add(10);
		s1.add();
		
		Study2 s2= new Study2();
		s2.add();
		s2.add(20);

	}
	public void add() {
		System.out.println("hiii this is study2 class");
	}
	public void add(int a)
	{
		System.out.println(a);
	}

}
