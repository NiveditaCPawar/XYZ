package studyClass;
public class Even_number extends Swapping_use{

	public static void main(String[] args) 
	
	{ Swapping_use n1= new Swapping_use();
	n1.numbers();
	
	System.out.println("===============");
		
		int a=100;
		for(int i=1;i<=a;i=i+2) {
			if(a % 2==0)
			{
				System.out.println(i);
		}
		
	}

}
}
