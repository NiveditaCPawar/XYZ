package start_Pattern;

public class Acen_Dece_2Comine {

	public static void main(String[] args) {
//	*	
//	**	
//	***	
//	****	
//	***** 	row=9
//	****	1st row star=1
//	***	
//	**	
//  *
		int star=1;
		for(int i=1;i<=9;i++) {
			for(int j=1;j<=star;j++){
				System.out.print("*");
			}
			System.out.println();
			if(i<5) {
				star++;
			}
			else {
				star--;
			}
		}
		
		
	}

}
