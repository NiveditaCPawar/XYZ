package start_Pattern;

public class Left_Decending {

	public static void main(String[] args) {
//		*****
//		****	row=5
//		***		1st row star=5
//		**
//		*
		int star=5;
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=star;j++) {
				System.out.print("*");
			}
			star--;
			System.out.println();
		}
		
		
		
	}

}
