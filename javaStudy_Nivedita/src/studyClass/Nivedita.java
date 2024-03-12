package studyClass;

public class Nivedita 
{ int a;
int b;


	public static void main(String[] args) {
		
		Nivedita n=new Nivedita();
		n.add();
		n.sub();
		
		Nivedita n1=new Nivedita(100);
		n1.add();
		n1.sub();
		

	}
	public void add() {
		//a=10;
		//b=10;
		int add=a+b;
		System.out.println(add);
	}
	public void sub() {
	//	a=5;
		int sub=a-b;
		System.out.println(sub);
	}
	
	public Nivedita() {
		a=15;
		b=10;
	}
	public Nivedita(int x) {
		a=x;
		
	}
	
	

}
