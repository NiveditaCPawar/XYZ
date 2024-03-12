package inheritence;

public class Nivedita extends Mother
{
	public static void main(String[] args) {
	
	Nivedita n1=new Nivedita();
	n1.cell();//calling non static method from sub class by creating sub classobject
	n1.keys();//calling non static method from super class by ref subclass object
	n1.home();	
	System.out.println("==============");
	
	Mother m1=new Mother();
	m1.keys();//calling non static method from super class by creating of super class object
	m1.home();//calling non static method from supermost class by ref of super class object
	System.out.println("================");
	
	Grand_Mother gm= new Grand_Mother();
	gm.home();//calling non static method from supermost class by creating object
	
}
	
	public void cell() {
		System.out.println("this is my cell");
	}

}
