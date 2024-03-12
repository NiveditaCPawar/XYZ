package starPattern;

public class Star4 {

	public static void main(String[] args) {
		for(int i=0;i<=6;i++) {
			for(int j=6;j>i;j--) {
				System.out.print(" ");
			}
			for(int p=1;p<=(i * 2)-1;p++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
