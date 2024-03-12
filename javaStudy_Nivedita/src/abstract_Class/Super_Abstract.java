package abstract_Class;

public class Super_Abstract extends Concreate_Class
{

	public static void main(String[] args) {
		Super_Abstract sa1=new Super_Abstract();
		sa1.test2();
		sa1.school();
		sa1.school2();
		Concreate_Class.test1();
		Super_Abstract.test3();
		sa1.test4();

	}

	@Override
	public void test2() {
		// TODO Auto-generated method stub
		
	}
	public static void test3() {
		System.out.println("this is static method from supermost class");
	}
	public void test4() {
		System.out.println("this is non static method from supermost class");
	}

}
