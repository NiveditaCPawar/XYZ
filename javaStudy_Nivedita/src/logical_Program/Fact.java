package logical_Program;

public class Fact {

	public static void main(String[] args) {
		//3!   1*2*3=
		int number=4;
		int fact=1;
		for(int i=number;i>=1;i--) 
		{
			fact=fact*i;
		}
		System.out.println(fact);

}
}






