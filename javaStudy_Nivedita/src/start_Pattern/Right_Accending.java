package start_Pattern;

public class Right_Accending {

	public static void main(String[] args) {
//			 *
//  		**
//		   ***		row=6  
//		  ****		1st row star=1
//		 *****		space=5
//		******
		int space=5;
		int star=1;
		for(int i=1;i<=6;i++) {
			for(int j=1;j<=space;j++) {
				System.out.print(" ");
			}
			for(int k=1;k<=star;k++) {
				System.out.print("*");
			}
			space--;
			star++;
			System.out.println();
		}
		
		
		
	}

}
