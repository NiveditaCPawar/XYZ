package starPattern;

public class ReverseFor {

	public static void main(String[] args) {
		int row=6;
		for(int i=1;i<=row;i++) {
			for(int star=5;star>=i;star--) {
				System.out.print(" * ");
			}
			System.out.println();
		}

	}

}
