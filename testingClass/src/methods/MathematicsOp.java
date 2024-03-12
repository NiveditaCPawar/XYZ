package methods;

public class MathematicsOp {

	public static void main(String[] args)
	{
		MathematicsOp s123=new MathematicsOp();
		s123.s();
		s123.t(522, 20, "india");
		u();
		v(301,250.2f,"Bwing");
		
		
		

	}

	public void s()
	{
		System.out.println("this is non static method without parameter");
		
	}	
	
	public void t(int runs, int overs, String teamName ) 
	{
		System.out.println("this is non static method with parameter");
		System.out.println("the total runs are "+runs);
		System.out.println("remaing over is "+overs);
		System.out.println("my team name is "+teamName);
	}
	public static void u()
	{
		System.out.println("this is static method without parameter");
	}
	
	public static void v(int buildingNum,float height, String buildingName  )
	{
		System.out.println("this is static method with parameter");
		System.out.println("my building name is "+buildingName);
		System.out.println("building height is "+height);
		System.out.println("my building name is "+buildingName);
	}
}
