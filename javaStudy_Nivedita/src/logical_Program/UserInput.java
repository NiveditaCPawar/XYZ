package logical_Program;

import java.util.Scanner;

public class UserInput {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter First Name");
		String firstName = sc.next();
		System.out.println("Enter Middle Name");
		String middleName = sc.next();
		System.out.println("Enter Last Name");
		String lastName = sc.next();
		System.out.println(firstName+" "+middleName+" "+lastName);
	}

}
