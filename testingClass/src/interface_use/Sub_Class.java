package interface_use;

public class Sub_Class implements Sample3,Sample2 {

	public static void main(String[] args) {
		
		Sub_Class s1= new Sub_Class();
		s1.test();
		s1.test1();
		s1.demo();
		s1.demo1();
		s1.nivedita();
	
		

	}

	@Override
	public void test() {
		System.out.println("hello");
	}

	@Override
	public void test1() {
		System.out.println("hiii");
		
	}

	@Override
	public void demo() {
		System.out.println("bye");
		
	}

	@Override
	public void demo1() {
		System.out.println("bye bye");
		
	}

	@Override
	public void nivedita() {
	
		Sample3.super.nivedita();
		Sample2.super.nivedita();
		
	}

}
