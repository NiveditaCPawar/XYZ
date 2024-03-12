package start_Pattern;

public class ButterFly_Pattern {

	public static void main(String[] args) {
//	*		  *
//	**	     **
//	***     ***
//	****   ****  
//	***** *****
//	****   ****
//	***     ***
//	**       **
//	*		  *
		//row=9
		//space1=5, space2=4
		//star1=1, star2=1
		int star1=1;
		int space1=5;
		int star2=1;
		int space2=4;
		
		for(int i=1;i<=9;i++) {
			for(int j=1;j<=star1;j++) {
				System.out.print("*");
			}
			for(int k=1;k<=space1;k++) {
				System.out.print(" ");
			}
			for(int l=1;l<=space2;l++) {
				System.out.print(" ");
			}
			for(int n=1;n<=star2;n++) {
				System.out.print("*");
			}
			if(i<5) {
				star1++;
				space1--;
				star2++;
				space2--;
			}
			else {
				star1--;
				space1++;
				star2--;
				space2++;
			}
			System.out.println();
		}
		
		
		
		
	}

}
