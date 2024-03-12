package start_Pattern;

public class Equilateral_upword {

	public static void main(String[] args) {		
//		   *
//		  ***
//		 *****		row=4	space=3
//		*******		1st row star=1
		int star=1;
		int space=3;
		for(int i=1;i<=4;i++) {
			for(int j=1;j<=space;j++) {
				System.out.print(" ");
			}
			for(int k=1;k<=star;k++) {
				System.out.print("*");
			}
			System.out.println();
			star=star+2;
			space--;
		}

	}

}
