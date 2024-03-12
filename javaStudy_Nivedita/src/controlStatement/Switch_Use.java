package controlStatement;

public class Switch_Use {

	public static void main(String[] args) {
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
			break;
		}

	}

}
