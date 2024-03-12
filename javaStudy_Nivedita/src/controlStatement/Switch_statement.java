package controlStatement;

public class Switch_statement {

	public static void main(String[] args)
	{
        char gender='M';
		
		switch (gender)
		{
		case 'M':
			System.out.println("gender is male");
		break;
		
		case 'F':
		System.out.println("gender is female");
		break;

		default:
			System.out.println("please select correct gender");
			System.out.println("================");
			break;
			
		}
		String days="Monday";
		switch (days) {
		case "sunday":
		//break;
		
		case "Tuesday":
			System.out.println("its Tuesday");
			//break;
			
		case "Friday":
			System.out.println("its friday");
			//break;
			
		case "Wednesday":
			System.out.println("its Wednesday");
			//break;
			
		case "Monday":
			System.out.println("its Monday");
			//break;
			
		case "saturday":
			System.out.println("its saturday");
			//break;
			
		case "thursday":
			System.out.println("its thursday");
			//break;

		default:
			System.out.println("please select the correct day");
			//break;
		}
		

	}

}
