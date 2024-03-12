package controlStatement;

public class Nested_if_use {

	public static void main(String[] args)
	{
		String state="maharashtra";
		String division="nashik";
		
		if(state== "maharashtra")
		{
			System.out.println("maharashtra");
			
			if(division=="nashik")
			{
				System.out.println("division is nashik");
			}
			
			else {
				System.out.println("please select correct division ");
			}
			}
		else {
			System.out.println("please select the correct state");
			System.out.println("============================================");
		}
		
		

	}



	}
		

	


