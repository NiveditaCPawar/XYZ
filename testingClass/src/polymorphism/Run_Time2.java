package polymorphism;

public class Run_Time2 extends Run_Time
{

	public static void main(String[] args) 
	{
		Run_Time rt=new Run_Time();//calling super class method
		rt.candy();
		rt.crush();
		
		System.out.println("============");
		
		
		Run_Time2 rt2=new Run_Time2();//calling sub class method
		rt2.candy();
		rt2.crush();
		

	}
	public void crush() {
		System.out.println("this is crush method from 2");
	}
	public void candy() {
		System.out.println("this is candy method from 2");
	}
	

}

