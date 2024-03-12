package studyClass;

public class Nested_if_us {

	public static void main(String[] args) {
		String colony="shivaji nagar";
		int rowNum=5;
		String name="Prashant";
		
		if(colony=="shivaji nagar")
		{
			if(rowNum==5) 
			{
				if(name=="Prashant")//grandson if
				{
				System.out.println("my name is Prashant");
				
				}
				else 
				{
					System.out.println("please select correct name");
				}
				}
			else {
					System.out.println("please select correct row");
				}
			
				
		}
		else
		{
			System.out.println("please select correct colony");
		}

	}

}
