package For_Loop;

public class pre_Decrement {

	public static void main(String[] args) {
		int m=50;
		{
			
			int i;
			i=m--;//assignemnt and then decrement
			System.out.println(i);//pre decrement
			System.out.println(m);
			System.out.println("===========");
		}
		
		int s=100;
		
		{
			int i;
			i=--s;//decrement and then assignemt
			System.out.println(i);//post decrement
			System.out.println(s);
		}

	}

}
