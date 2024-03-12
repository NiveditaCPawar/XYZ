package start_Pattern;

public class Ace_Dec_2combine {

	public static void main(String[] args) {
//	*****	
//	****	
//	***
//	**
//	*			row=9
//	**			1st row star=5
//	***
//  ****
//	*****	
		int star=5;
		for(int i=1;i<=9;i++) {
			for(int j=1;j<=star;j++) {
				System.out.print("*");
			}System.out.println();
			if(i<5) {
				star--;
			}
			else {
				star++;
			}
		}
		
	}

}
