package start_Pattern;

public class LeftAccending {

	public static void main(String[] args) {
//		*
//		**
//		***
//		****			row=6
//		*****			1st row star=1
//		******
		int star=1;
		for(int i=1;i<=6;i++) {
			for(int j=1;j<=star;j++) {
				System.out.print("*");
			}
			star++;
			System.out.println();
		}
		
		
		
	}

}
