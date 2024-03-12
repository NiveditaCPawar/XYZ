package logical_Program;

import java.util.Scanner;

public class Even_Odd_Number {

	public static void main(String[] args) {
		//int number=100;
		
		Scanner sc= new Scanner(System.in);//using scanner class
		System.out.println("Please enter number");
		int number = sc.nextInt();
		
		if(number%2==0) 
		{
			System.out.println("Given number is even ");
		}
		else {
			System.out.println("Given no is odd ");
		}
	}

}
