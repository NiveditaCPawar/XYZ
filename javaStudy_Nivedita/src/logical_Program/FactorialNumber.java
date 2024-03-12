package logical_Program;

public class FactorialNumber {

	public static void main(String[] args) {
		
		//7!=7*6*5*4*3*2*1=?
		int number=7;
		int fact=1;
		for(int i=1;i<=number;i++)
		{
			fact=fact*i;
			//7=1*7
			//42=7*6
			//210=42*5
			//840=210*4
			//2520=840*3
			//5040=2520*2
			//5040*1
		}
		System.out.println(fact);
	}

}
