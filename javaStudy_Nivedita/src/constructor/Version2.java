package constructor;

public class Version2 {
	String name;   // data type declaration
	char gender;   // data type declaration
	int rollnu;    // data type declaration
	float height;  // data type declaration
	
	public Version2() // constructor without/ zero parameter (initialization)
	{
		name= "Prashant";
		gender='M';
		rollnu=55;
		height=5.85f;
	}
	
	public Version2(String x , int y) //constructor with two parameter (initialization)
	{
		name=x;
		rollnu=y;
		
	}
	
	public Version2(String x , int y , float z , char w ) //constructor with four parameter (initialization)
	{
		name=x;
		rollnu=y;
		height=z;
		gender=w;
		}

	public static void main(String[] args) {
		Version2 v1 = new Version2("Ganesh", 50); //obj crreation
		v1.intro();                               // calling with 1st constructor
		v1.gender();
		v1.roll();
		v1.height();
		
		// we can work same constrcutor with n number bt it require diff obj
		// we work same constructor with 2 obj create
		
		Version2 v2 = new Version2("Gaytri", 55); //obj crreation
		v2.intro();                               //it also calling with 1st constructor
		v2.gender();
		v2.roll();
		v2.height();
		
		// we can work same constrcutor with n number bt it require diff obj
		// we work same constructor with 2 obj create
		
		Version2 v3 = new Version2("Nivedita", 5, 5.5f, 'f'); //obj crreation
		v3.intro();                                           //it also calling with 2nd constructor
		v3.gender();
		v3.roll();
		v3.height();
		
		Version2 v4 = new Version2("Dipti", 16, 5.4f, 'f'); //obj crreation
		v4.intro();                                         //it also calling with 2nd constructor
		v4.gender();
		v4.roll();
		v4.height();

	}
	public void intro()  //regular non-static without parameter (usage)
	{
		System.out.println("my name is "+name+".");
	}
	public void gender() //regular non-static without parameter (usage)
	{
		System.out.println("my gender is "+gender+"."); 
	}
	public void roll()   //regular non-static without parameter (usage)
	{
		System.out.println("my roll no is "+rollnu);
	}
	public void height() //regular non-static without parameter (usage)
	{
		System.out.println("my height is "+height);
		System.out.println("==========================");
	}

}