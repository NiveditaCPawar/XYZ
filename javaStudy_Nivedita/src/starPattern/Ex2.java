package starPattern;

public class Ex2 {

	public static void main(String[] args) {
		int row=5;
		for(int i=1;i<=5;i++) {
			for(int j=1;j<i;j++) {
				System.out.print(" ");
			}
			for(int m=row;m>=i;m--) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
